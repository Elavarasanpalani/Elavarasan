package utillpac;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < 5; i++)
            q.add(i);
		
		System.out.println(q);
		System.out.println("Elements of queue "
                + q);
		
		//System.out.println(q.remove());
		int rem=q.remove();
		System.out.println(rem);
		
		
		
		
		

	}

}
