package keywords;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GBColllectionDemo1 {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Aailable memory...."+r.freeMemory());
		System.out.println("Available process..."+r.availableProcessors());
		System.out.println("availabel free memory..."+r.freeMemory());
		r.gc();
		System.out.println("available free space..."+r.freeMemory());
		Food food=new Food();
		SoftReference soft =new SoftReference(food);//now you are working but we dont have project 
		//you go to hometown after i will call you..
		//WeakReference weal =new WeakReference(food);//weakref you dont need for this memory is distryed
		//memory loacation ...
		food=null;
		r.gc();
		System.out.println("free memory..."+r.freeMemory());
		food=(Food)soft.get();
		//food=(Food)weal.get();
		System.out.println(food);
		

	}

}
class Food{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized for the food in objects...");
	}
	
}
