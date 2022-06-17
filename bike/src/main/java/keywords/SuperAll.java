package keywords;

public class SuperAll {

	public static void main(String[] args) {
		working dd=new working(230000);
		dd.office();
		
		

	}

}
abstract class Computer{
	public Computer() {
		System.out.println("computer is usefull to all fesilitys..");
	}
	public void office() {
		System.out.println("he was going bike to office...");
	}
	
}
abstract class Humen extends Computer{
	int k=40000;
	public Humen(int j) {
		System.out.println("he was take ..."+j);
	}
	public void office() {
		super.office();
		System.out.println("raja was going office...");
	}
	
}
class working extends Humen{
	int k=300000;
	
	
	public working(int s) {//super key workd constructor
		super(18000);
		System.out.println("company has paid....."+s);
		
	}
	final public void office() {
		super.office();
		
		System.out.println(" its  working a information sector..");
		System.out.println("after one  company was giving "+k);
		System.out.println("after one Humen was getting "+super.k);
	}
	
	
}