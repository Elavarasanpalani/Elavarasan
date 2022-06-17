package thread;

//import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//what is threading?
//threading is a process with in a process

public class ThreadingDemo1 {

	public static void main(String[] args) {
		System.out.println("1.soup giving first..");//low time
		ExecutorService es=Executors.newFixedThreadPool(1);//we create thread for this step..
		es.execute(()->{met();});
		es.shutdown();
		System.out.println("3.stater....");//low time 
		

	}
	public static void met() {
		try{Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("2.the main dish ....");//it is take time
	}

}

