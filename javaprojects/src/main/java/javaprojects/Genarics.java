package javaprojects;

public class Genarics {

	public static void main(String[] args) {
		//Box box=new Box();
		Paper pa=new Paper();
		Salt sa=new Salt();
		//box.setObj(sa);//  it cannot compailer error ...the program was not accpted....
		
	//	pa=(Paper)box.getObj();
		
	//	pa.drow();
		
		Box1 <Paper>bo=new Box1<>();
		
		bo.setObj(pa);///but it  is compailer lae program term error.....
		
		pa=(Paper)bo.getObj();//casting panna tha na thrium
		
		pa.drow();
				
	
	}

}
class Paper{
	public void drow() {
		System.out.println("it have paper box...");
 	}
	
}
class Salt{
	public void put() {
		System.out.println("it hava a salt");
 	}
}
class Box{
	private Object obj;
	public Object getObj(){
		return this.obj;
		
	}
	public void setObj(Object obj) {
		this.obj=obj;
	}
	
}
class Box1<T>{
	private T obj;
	public T getObj(){
		return this.obj;
		
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}
