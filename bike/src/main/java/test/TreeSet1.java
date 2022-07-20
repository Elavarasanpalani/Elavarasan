package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import utillpac.listcoll;

public class TreeSet1 {

	public static void main(String[] args) {
		List<Name>list=new ArrayList<Name>();
		
		list.add(new Name("a"));
		list.add(new Name("s"));
		list.add(new Name("b"));
		list.add(new Name("e"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		HashSet<Name> hs=new HashSet<Name>(list);
		TreeSet<Name>tr=new TreeSet<Name>(new narmal());
		tr.addAll(hs);
		System.out.println(tr);

	}

}
class narmal implements Comparator<Name>{
	 @Override
	public int compare(Name o1, Name o2) {
	
		return o2.compareTo(o1);
	}
}
class Name implements Comparable<Name>{
	String name;
	public Name(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Name o) {
		
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		
		return this.name;
	}
}