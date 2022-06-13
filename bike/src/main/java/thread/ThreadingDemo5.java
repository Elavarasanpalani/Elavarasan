package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo5 {

	public static void main(String[] args) {
		ExecutorService ss=Executors.newFixedThreadPool(2);
		
		ss.execute(()->{
			 {
				     synchronized (Thread.class) {
						
					
					Thread.currentThread().setName("rajini");
					Theater.toilet.usetoilate();
				     }
				
			}
			
			
			
		});
		
		ss.execute(()->{
			
		 {
			     synchronized (Thread.class)
			     {
					
				
				Thread.currentThread().setName("kamal");
				Theater.toilet.usetoilate();
			     }
			}
			
			
		}
		);
		ss.shutdown();
			
	}

}
class Toilate{
	public void usetoilate() {
		
	
	Thread t=Thread.currentThread();
	String name=t.getName();
	System.out.println(name+"is using the toilate");
	try {
		Thread.sleep(5000);
	}catch(Exception e) {}
	System.out.println(name+"come out of toilate...");
	}

	
	
	
}
class Theater{
	static Toilate toilet=new Toilate();
}
