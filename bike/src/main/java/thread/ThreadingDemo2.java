package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo2 {

	public static void main(String[] args) {
		System.out.println("mom makking gravy..");
		ExecutorService ss=Executors.newFixedThreadPool(1);
		ss.execute(()->{cook();} );
		ss.execute(()->{cook1();});
		ss.shutdown();
		System.out.println("in between time mom was boiling a water..");
		

	}
	public static void cook() {
		
	try {//if doni know try catch block is says  unresolved compilationproble
			Thread.sleep(5000);
		}catch(Exception e){}
		System.out.println("mom calling his son go to bye a masala...");
		
		
		
	}
	public static void  cook1() {
		try {
			Thread.sleep(5000);
		}catch(Exception e){}
		System.out.println("mom calling his son go to bye a masala.....................");
		
		
	}
	

}
