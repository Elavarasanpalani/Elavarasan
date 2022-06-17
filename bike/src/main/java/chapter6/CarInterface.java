package chapter6;

class CarInterface implements Tamil{
	public void jerry(){						
		System.out.println("this is abstract class "+n1);
	}
	public static void main (String []args) {
		
		CarInterface c;
		c=new CarInterface();
	Factory ela=new Factory();
	c.jerry();
	 ela.tom();
	 ela.jerry();
	
	}
}
class Factory implements Tamil{
	void tom() {
		System.out.println("Elavarasan");
	}
public void jerry(){
	System.out.println("this is abstract class "+n1);
}
}

interface Tamil{
	String n1="book";
	//void jerry();
}