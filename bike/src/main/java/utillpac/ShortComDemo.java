package utillpac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ShortComDemo {

	public static void main(String[] args) {
		List<Studens> list=new ArrayList<Studens>();
		list.add(new Studens("ramu"));
		list.add(new Studens("sumo"));
		list.add(new Studens("akil"));
		
		list.add(new Studens("zara"));
		list.add(new Studens("ramu"));
		
	
	
	
				
		
		list.add(new Studens("xman"));
		
		list.add(new Studens("babu"));
		System.out.println("before shorting..."+list);
		
		Collections.sort(list);
		System.out.println();
		
		System.out.println("after shortingh...."+list);//it is printin  asscending
		System.out.println();
		
		Set<Studens> dd=new HashSet<Studens>(list);
//		dd.add(new Studens("zara"));
//		dd.add(new Studens("ramu"));
//		dd.add(new Studens("zara"));
//		dd.add(new Studens("ramu"));
		System.out.println("Hahset......"+dd);
		System.out.println();
		
		TreeSet<Studens>  ff=new TreeSet<Studens>(new MyComparators());
		ff.addAll(dd);
		
		System.out.println("trees set assending comparator....."+ff);//it assendiing order of  the value
		
			
		
		
		
		
		
		
	}

}

class MyComparators implements Comparator<Studens>{

	@Override
	public int compare(Studens o1, Studens o2) {
		
		return o2.compareTo(o1);
	}
	
}
class Studens implements Comparable<Studens>{//comparable to recive another student to compare
	String name;
	public Studens(String name) {
		this.name=name;
		
	}
	@Override
	public String toString() {
		
		
		return this.name;
	}
	@Override
	public int compareTo(Studens o) {
		
		return this.name.compareTo(o.name);
	}


}
	
