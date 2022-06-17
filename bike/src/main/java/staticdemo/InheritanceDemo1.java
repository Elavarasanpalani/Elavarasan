package staticdemo;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		Superclass ss=new Subclass();
		System.out.println(ss.name);
		ss.met();
		ss.asmet();
		
	}

}
//Good Rules pertaining to Inheritance - They are not compulsory but good
/*
* 1. The super class should be either abstract or interface
* 2. The super class can have methods or need not have methods
* 3. Since the super class is abstract or interface, its object cannot be created
* 4. If you have to create a object of the super class then you need inherit that class with child class
* 5. The super class can have abstract methods.
* 6. The super class can have non abstract methods, but they should be declared final or private
* 7. All the public, nomodifier and protected properties of super class will be visible in sub class
*
*/
abstract class Superclass{//shoued be abstrac class forsuper class
	public Superclass() {
		System.out.println("this is constractor....");
	}
	final String name="elavarasan";//Final verialble are veriable are constandf and value also  constand 
  final public void met() {// fianla method also  can not be override 
		System.out.println("it is called super class....");//
	}
    abstract void asmet() ;//no give logic for abstract method
	  
  }

  
	

class Subclass extends Superclass{
	public void asmet() {
		System.out.println("it is called subclass....");//it is called method overlodding its true but its not good roul
	}
	
}