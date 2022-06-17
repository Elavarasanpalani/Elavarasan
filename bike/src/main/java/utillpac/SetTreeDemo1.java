package utillpac;



import java.util.Set;
import java.util.TreeSet;

public class SetTreeDemo1 {

	public static void main(String[] args) {
		Set<String> hs=new TreeSet<String>();
		
		hs.add(new A("d"));
		hs.add("e");
		hs.add("a");
		hs.add("f");
		System.out.println(hs);
		
		
		
		
		
	}

}
class A implements Comparable<A>{
	String name;
	public A(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(A o) {
		System.out.println(o);
		return 	name.compareTo(o.name);
	}
	@Override
	public String toString() {
		
		return this.name;
	}
	
}
