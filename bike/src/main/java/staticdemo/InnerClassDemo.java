package staticdemo;

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer=new Outer();
		
		Outer.Inner inner=new Outer().new Inner();
		inner.innerMethod();
		
		Outer2.StaticInner sinner=new Outer2.StaticInner();
		sinner.staticClassInnerMethod();
	}
}
class Outer{
private String money="hundred rupees";
private void outerMethod() {
	new Inner().innerMethod();
	System.out.println("outer method..."+new Inner().innerMoney);
}
class Inner{
	private String innerMoney="thousand rupees......";
	public void innerMethod() {
		outerMethod();
		System.out.println("inner method called..."+money);
	}
}
}
class Outer2{
//private static String money2="two hundred rupees............";
private static void outerMethod2() {
	System.out.println("outer static method called...");
}
static class StaticInner{
	public void staticClassInnerMethod() {
		outerMethod2();
		//System.out.println("static class inner method called..."+money2);
	}

	}

}
