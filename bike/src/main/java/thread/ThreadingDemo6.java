package thread;
//class look
//object look
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo6 {
	//class lock is worng because how where can acces hotel at any time 
	//object lock is  food of theh class because it will access any  time and any were

	public static void main(String[] args) {
		Hotel dd=new Hotel();
		Hotel ff=new Hotel();
		ExecutorService ss=Executors.newFixedThreadPool(2);
		ss.execute(()->{
			synchronized (dd) {
				
			
			Thread.currentThread().setName("ela");
			dd.cash.food();
			}
		});
		ss.execute(()->{
			synchronized (ff) {
				
			
			Thread.currentThread().setName("raj");
			ff.cash.food();
			}
		});
		ss.shutdown();
		
		
		

	}

}
class Cashcount{
	public void food() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"order full meels...");
		try {
			Thread.sleep(1000);
		}catch(Exception d) {}
		System.out.println(name+"bay bill for cashcounter....");
	}
	
}
class Hotel{
	  Cashcount cash=new Cashcount();
	
}
