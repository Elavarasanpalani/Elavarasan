package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadingDemo11Callabele {
	//it is returnable we can use interface model..

	public static void main(String[] args)throws Exception {
		ExecutorService ss=Executors.newFixedThreadPool(1);
		
		Future ful=ss.submit(new Mycallable());
		System.out.println(ful.get());
		
		

	}

}
class Mycallable implements Callable{

	@Override
	public Object call() throws Exception {
		
		return "hello returnt the value....";
	}
	
}

