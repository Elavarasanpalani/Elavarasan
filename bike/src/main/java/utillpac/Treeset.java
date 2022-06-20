package utillpac;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		Set ts=new TreeSet(new MyComparator());
		ts.add( new A("basi"));
		ts.add( new A("amal;"));
		ts.add(new A("ela"));
		System.out.println(ts);
	}

}
class MyComparator implements Comparator<A>{

	@Override
	public int compare(A o1, A o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}

	

class A implements Comparable<A>{
	public A(String name) {//it will referd instance variable...
		this.name=name;
	}
	String name;
	@Override
	public int compareTo(A o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	@Override
	public String toString() {//to String is reprasentin the this  String object...
		
		return this.name;
	}
	
	
}

