package javaprojects;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		politicians pols=new politicians();
		Police cop=new Police();
		//System.out.println(cop);
		
		cop.arrest(pols);
		
		cop.cbi(pols);

	}

}

class Police{
	public void arrest(Object obj) throws Exception {//object is refer reason because it is anyone politicia or barber
		//politicians pol=(politicians)obj;// this casting is menssion to how...
		//System.out.println(pol.name);
		
		
		// Why use this two line means?
		//we dont now creating casting of the programe
		
		
		Class c=obj.getClass();//it will capture on the class
		Field f=c.getField("name");//it will  takes fied of the class
		
		System.out.println(f.get(obj));
		
		
		Method m=c.getMethod("service");
		m.invoke(obj);//it will specified the method object ...
		
		cbi(obj);
		
		
		
	}
	public void cbi(Object obj) throws Exception{
		Class c=obj.getClass();
		Field f=c.getField("Secratename");
		f.setAccessible(true);//object identicate boolena vakue 
		System.out.println(f.get(obj));
		
		Method m=c.getMethod("secreateservice");
		m.setAccessible(true);//set the accessible flag for this object to the indicated boolean value.
		m.invoke(obj);
		
		
	}
}
class politicians{
	public  String name="Raj";
	private  String Secratename="Billa";
	
public void service() {
	System.out.println("he is social serive...");
}

private void secreateservice() {
	System.out.println("he is mafia....");
}
}

