package staticdemo;

public class StaticConstructorDemo {
	
	static {
		System.out.println("static block called....");
	}
	public static void main(String[] args) {
		new SBDemo();
		//SBDemo.met();
		//SBDemo.met2();
	}
}
class SBDemo{
	static {
		System.out.println("SBDemo static block called....");
	}
	SBDemo(){//constructor
		System.out.println("constructor called...");
	}
	static void met() {
		System.out.println("static method met called...");
	}
	
	static void met2() {
		System.out.println("static method met2 called...");
	}
}
