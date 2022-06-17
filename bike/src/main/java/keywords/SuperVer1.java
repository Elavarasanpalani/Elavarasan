package keywords;

public class SuperVer1 {
	//super class veriableis  ref to sub class veriable 
	

	public static void main(String[] args) {
		top2 dd=new top2();
		dd.met2();
	
		

	}

}
class toprt{
	int i=10;
}
class top1 extends toprt{
	int i=20;
	 public void met2() {
		System.out.println(super.i);
	}
}
class top2 extends top1{
	int i=30;
final public void met() {
		
		System.out.println("this is the value "+i);
		System.out.println("value of super class "+super.i);
	}
}
