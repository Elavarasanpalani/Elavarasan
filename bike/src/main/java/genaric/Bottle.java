package genaric;

public class Bottle {

	public static void main(String[] args) {
		//Bottlever bb=new Bottlever();
		Bottlever1<Maaza> jj=new Bottlever1<>();
		Bovanto  bo=new   Bovanto();
		Maaza maa=new Maaza();
		
		jj.setObj(maa);
		
		maa=(Maaza)jj.getObj();
		
		maa.yellow();
		

	}

}

class  Bovanto{
	public void black() {
		System.out.println("it is bovanto ...");
	}
	
}
class Maaza{
	public void yellow() {
		System.out.println("it is maazaa.....");
	}
	
}
class Bottlever{
	private Object obj;
	public Object getObj() {
		return this.obj;
		
	
		
	}
	public void setObj(Object obj) {
		this.obj=obj;
	}
	
	
	
}
class Bottlever1<T> {
	private T obj;
	public T getObj() {
		return this.obj;
		
	
		
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
	
	
	
}
