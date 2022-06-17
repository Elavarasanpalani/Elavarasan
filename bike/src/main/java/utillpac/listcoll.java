package utillpac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listcoll {

	public static void main(String[] args) {
<<<<<<< HEAD
		List<String> list=new ArrayList();//arraylis is fast
		//
=======
		List<String> list=new ArrayList();
>>>>>>> branch 'master' of https://github.com/Elavarasanpalani/Elavarasan.git
		
//		//hettrogienou for the list collection but is work
//		list.add("string");
//		list.add(343);
//		list.add(new Test());
//		//homoginous..
//		String s[]=new String[4];
//		s[0]="sfdfisdfi";
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(".............................");
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("..............................");
		list.add("dddd");
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(".................................");
		
		System.out.println(list.get(1));//get the value of list.
		
		System.out.println("................................");
		
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("*******************************");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*********************************");
		
		Iterator<String> iter=list.iterator();//it is only for forword
		while(iter.hasNext())//hasNext is boolena potentioan  it will chouse next value .next value
		System.out.println(iter.next());//.next is read the record..
		
		System.out.println("********************************************");
		
		ListIterator<String> iters=list.listIterator();//it is forword and backword for the value
		while(iters.hasNext())
			System.out.println(iters.next());
		
		System.out.println("***************************************");
		
		while(iters.hasPrevious()) {
			System.out.println(iters.previous());
		}
	
		
		
	     
		

	}

}
class Test{
		
}
