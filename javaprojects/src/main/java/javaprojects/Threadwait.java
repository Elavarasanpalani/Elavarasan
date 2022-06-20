package javaprojects;

//import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadwait {

	public static void main(String[] args) {
		Gun dd=new Gun();
		ExecutorService t=Executors.newFixedThreadPool(2);
		t.execute(()->{
			for(int i=0;i<5;i++)
			dd.lood();
		});
		t.execute(()->{
			for(int i=0;i<5;i++)
			dd.lood();
		});
		t.shutdown();
 	

	}

}
class Gun{
	boolean flag;
	synchronized void lood() {
		if(flag){
			try {
				Thread.sleep(1000);
 			}catch(Exception e) {}
			
			System.out.println("loder is load the gun...");
			flag=true;
			notify();
		}
		
	}
	
	synchronized public void shoot() {
		if(!flag){
			try {
				Thread.sleep(1000);
 			}catch(Exception e) {}
			
			System.out.println("loder is load the gun...");
			flag=false;
			notify();
		}
		
	}
	
}

