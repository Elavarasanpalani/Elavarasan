package staticdemo;

public class InterfaceDemo {
	
	
}
//1.Interface with no methods is called - Marker interface
interface MyInter{
	
}
//2.Interface with one method is called - Functional Interface
interface MyInter2{
	public void met();//funcationo method
}
//3. All methods in interface are abstract in nature
//But still interface can have non abstract methods also**
//private, static and default methods are possible
//interface objects cannot be created, so you cannot have CONSTRUCTOR
//interface can have static final fields or variables
interface MyInter3{
	static final float pi=3.14f;//declaring constants
	public void met();//this is an abstract method
	public abstract void met2();//this way also its acceptable
	default void met3() {//template method - non abstract
		
	}
  //  private void met4() {//this is a template method private to interface - non abstract
		
	//}
	static void met5() {//this is a static method - non abstract
		
	}
}
//4. Interface can extend another interface
interface MyInter4 extends MyInter3{
	
}