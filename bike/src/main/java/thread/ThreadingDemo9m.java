package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo9m {
	//inter thread communication

	public static void main(String[] args) {
		
		
		ExecutorService ss=Executors.newFixedThreadPool(2);
		Gun before=new Gun();
		ss.execute(()->{
			for(int i=0;i<5;i++) {
				before.lood();
				
			}
		});
		ss.execute(()->{
			for(int i=0;i<5;i++) {
				before.shoot();
				
			}
		});
		ss.shutdown();
		
	}

}
class Gun{
	boolean flag;
	synchronized public void lood(){
		if(flag) {
			try {wait();}catch(Exception e) {}
			
		}
		System.out.println("loader load the gun....");
		flag=true;
		notify();
		
		
		
	}
	synchronized public void shoot() {
		if(!flag) {
			try {wait();}catch(Exception e) {}
			
		}
		System.out.println("shoot the gun.....");
		flag=false;
		notify();
		
	}
	
	
}
