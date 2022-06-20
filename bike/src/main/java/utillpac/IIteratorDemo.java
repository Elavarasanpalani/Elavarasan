package utillpac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IIteratorDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("abb");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		list.add("eee");
		
		
		Iterator item=list.iterator();
		while(item.hasNext())
		System.out.println(item.next());
		
		
	}

}
