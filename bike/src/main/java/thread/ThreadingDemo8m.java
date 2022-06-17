package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo8m {

	public static void main(String[] args) {
		Barbershop bar=new Barbershop();
		ExecutorService ss=Executors.newFixedThreadPool(3);
		ss.execute(()->{
			Thread.currentThread().setName("ramesh");
			bar.cutting();
			bar.drimming();
			bar.haircolouring();
			bar.exit();
			
			
		});
		ss.execute(()->{
			Thread.currentThread().setName("surash");
			bar.cutting();
			bar.drimming();
			bar.haircolouring();
			bar.exit();
			
			
		});
		ss.execute(()->{
			Thread.currentThread().setName("dinesh");
			bar.cutting();
			bar.drimming();
			bar.haircolouring();
			bar.exit();
			
			
		});
		ss.shutdown();
		

	}

}
class Barbershop{
	public void cutting() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ "wating for cutting...");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		System.out.println(name+ "Fininsed cutting...");
	}
	public void drimming() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ "wating for drimming...");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(name+ "Fininsed drimming...");
	}
	public void haircolouring() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ "wating for haircolourting...");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		System.out.println(name+ "Fininsed haircolourting...");
	}
	public void exit() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ "wating for exit...");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println(name+ "Fininsed exit...");
	}
	
	
}
