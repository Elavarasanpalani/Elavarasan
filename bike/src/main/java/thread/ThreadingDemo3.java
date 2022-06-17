package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo3 {
	public ThreadingDemo3() {
		
	ExecutorService et=Executors.newFixedThreadPool(1);//lamda is going to call runable and runmethod
	et.execute(()->{System.out.println("child thread called...");});//after execute line the sos is stay  in waiting room
	et.shutdown();
	}

	public static void main(String[] args) {
		new ThreadingDemo3();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {};
			
		}
		
	}

}

