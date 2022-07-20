package utillpac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TreeDemo11 {
	public static void main(String[] args) {
		List< Names> list=new ArrayList<Names>();
		
		list.add(new Names("ela"));
		list.add(new Names("ramu"));
		list.add(new Names("januma"));
		list.add(new Names("some"));
		list.add(new Names("thala"));
		
		System.out.println(list);
		
		HashSet<Names> hs=new HashSet<Names>(list);
		
		TreeSet<Names> tr=new TreeSet<Names>(new normas());
		
		tr.addAll(hs);
		
		System.out.println(tr);
		
		
		
		
	}

}

class normas implements Comparator<Names>{
	@Override
	public int compare(Names o1, Names o2) {
		
		return o2.compareTo(o1);
	}
}


class Names  implements Comparable<Names>{
	String msg;
	public Names(String msg) {
		this.msg=msg;
	}

	@Override
	public int compareTo(Names o) {
		
		return this.msg.compareTo(o.msg);
	}
	@Override
	public String toString() {
		
		return this.msg;
	}
	
}
