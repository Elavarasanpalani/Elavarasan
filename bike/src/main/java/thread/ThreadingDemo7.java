package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo7 {
	//method look

	public static void main(String[] args) {
		CounsellingHoll anna=new CounsellingHoll();
		ExecutorService ss=Executors.newFixedThreadPool(3);
		ss.execute(()->{
			Thread.currentThread().setName("Rajini");
			anna.showpaper();
			anna.selectcollage();
			anna.payfees();
			anna.exit();
			
			
		});
		ss.execute(()->{
			Thread.currentThread().setName("Kamal");
			anna.showpaper();
			anna.selectcollage();
			anna.payfees();
			anna.exit();
			
			
		});
		ss.execute(()->{
			Thread.currentThread().setName("vijay");
			anna.showpaper();
			anna.selectcollage();
			anna.payfees();
			anna.exit();
			
			
		});
		ss.shutdown();
		
		
		
	}

}
class CounsellingHoll{
	synchronized public void showpaper() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"showing the paper...");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(name+"completing showing papers....");
		//System.out.println();
		
	}
    synchronized public void  selectcollage() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"seleted college...");
		try {
			Thread.sleep(4000);
		}catch(Exception e) {}
		System.out.println(name+"completing selecting college...");
		//System.out.println();
		
	}
   synchronized	public void payfees() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"paying fees...");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(name+"completing paying fees...");
		//System.out.println();
		
	}
  synchronized public void exit() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" exit...");
	}
   
	
}
