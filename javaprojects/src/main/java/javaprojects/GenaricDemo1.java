package javaprojects;

//import javaprojects.Water.Colour;

//import javaprojects.Water.Air1;

public class GenaricDemo1 {// genaic is use to specify object of the class 
	public static void main(String[] args) {
		Goodpaintbruah<Water> ffo=new Goodpaintbruah<>();
		
		
		Water wa=new Water();
		
		
		ffo.setObj(wa);
		
		wa.sprinkel();
		
	

		
		 

	}

}
class Water{
	public void sprinkel() {
		System.out.println("it is sprinkle water...");
	
}

class Colour{
	public void dusting() {
		System.out.println(" it is cleaning dusting....");
	}
}
	
}
class Goodpaintbruah<T>{
	private T obj;
	
	public T getObj() {
		return this.obj;
		
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
	
}

