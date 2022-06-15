package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo10interthreadcommunication {

	public static void main(String[] args) {
		Guns mass=new Guns();
		ExecutorService ss=Executors.newFixedThreadPool(2);
		ss.execute(()->{
			//for(int i=0;i<5;i++)
			
			mass.loads();
			
			
		}
		);
		ss.execute(()->{
			//for(int i=0;i<5;i++)
			
			mass.shoots();
			
			
		}
		);
	}

}
class Guns{
	boolean flag;
	
	synchronized public void loads() {
		if(flag) {//falsh
			try{Thread.sleep(5000);}catch(Exception e) {}
				
			
			
		}
		
		System.out.println(" loaders loads for the gun.....");
		flag=true;
		notify();//it is convay to the msg for the shooter...
		
	}
   synchronized	public void shoots() {
		if(!flag) {//true
			try{Thread.sleep(5000);}catch(Exception e) {}
			
			
		}
		System.out.println("shooter is shoot the gun...");
		flag=false;
		notify();
		
	}
	
}
