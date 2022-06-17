package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo4 {
	public ThreadingDemo4() {
		ExecutorService ss=Executors.newFixedThreadPool(1);
		ss.execute(()->{System.out.println("the child class....");});//this is stati in  waitingroom..
	}

	public static void main(String[] args) {
		new ThreadingDemo4();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception d){}
		}
		
	}

}
