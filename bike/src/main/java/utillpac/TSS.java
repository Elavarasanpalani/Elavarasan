package utillpac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TSS {

	public static void main(String[] args) {
		List<ela> list=new ArrayList<ela>();
		
		list.add(new ela("m"));
		list.add(new ela("d"));
		list.add(new ela("b"));
		list.add(new ela("h"));
		list.add(new ela("l"));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		HashSet<ela> hs=new HashSet<ela>(list);
		
		TreeSet<ela> tr=new TreeSet<ela>(new noremal());
		
		tr.addAll(hs);
		System.out.println(tr);
		
		

	}

}
class noremal implements Comparator<ela>{

	@Override
	public int compare(ela o1, ela o2) {
		
		return o2.compareTo(o1);
	}
	
}
class ela implements Comparable<ela>{
	String msg;
	
	public ela(String msg) {
		this.msg=msg;
		
	}

	@Override
	public int compareTo(ela o) {
		
		return this.msg.compareTo(o.msg);
	}
	@Override
	public String toString() {
		
		return this.msg;
	}
}
