package genaric;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		Politician  diamon=new Politician();
		Policestation p1=new Policestation();
		Barber bar=new Barber();
		p1.arrest(diamon);//it is unaccepttable
		
	}

}
class Policestation{
	public void arrest(Object obj) throws Exception {//we can arrest anybody....
	
		Politician pol=(Politician) obj;//we cannot convert to object to politician so we casting 
	//	System.out.println(pol.name);
		//then we enquire the politician for the police..
		 Class c=obj.getClass();//object original is class so we get the class 
	      Field f=c.getField("name");//it will throw exception becaus  he investication the perosn so exception will come
	      System.out.println(f.get(obj));
	      
	      Method d=c.getMethod("service");
	      d.invoke(obj);//get method and ivoke it..method vaagi invoke pannurom.
	      
		
	}
	public void singaminrogation(Object obj) throws Exception{
		Class c=obj.getClass();
		Field f=c.getDeclaredField("secratename");
		
	}
	
}
class Barber{
	public String name=" i am a barbar..";
	private String secratename="i am not gice incomtax...";
}// it is unacceptable because is casting only politiaciton...
class Politician{
	public String name=" i am a good man..";
	private String secratename="i am  don  of city...";
	
	public void service() {
		System.out.println(" i do social service...");
	}
	private void secretservice() {
		System.out.println("i thif loot of money...");
	}
}
