package utillpac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

//import javax.swing.Spring;

public class setDemoHas {

	public static void main(String[] args) {
		Set<String>  hs=new  HashSet<String>();//Store  the group of strting 
		
		
		hs.add("aaa");
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");
		
		
		System.out.println(hs);
		hs.remove("aaa");
		System.out.println(hs);
		System.out.println(hs.size());
		//System.out.println(hs.add("tttt"));
		
		System.out.println(hs.isEmpty());//it will show empy or not the string
		System.out.println(hs.contains("ccc"));//the ccc is there in string or not
		
		//method refrence
		hs.forEach(System.out::println);// to iterate the elements the element is foreach()
		
		System.out.println("************************* method ref");
		hs.forEach(new MyConsumer() );//foreach method is asking the comsumer interface 
		
		System.out.println("########################//creat method of the class and implements");
		
		hs.forEach((s)->{System.out.println(s);});
		
		System.out.println("..............................lambd");
		
		hs.forEach(System.out::println);
		
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
       
	hs.forEach(setDemoHas::print);
	System.out.println("//////////////////////////////// method refranceing ");
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
		
		//System.out.println("----------------------------------");
		
		static void print(String d) {
			System.out.println(d);
		}
		
		 
		
		

	}



class MyConsumer implements Consumer<String>{//consumer is a pridefind class 

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	
}


