package javaprojects;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo1sta {

	public static void main(String[] args) throws Exception {
//		Demo obj=new Demo();//static object creation
//		System.out.println(obj);
		
		Demo demo=(Demo)Class.forName("javaprojects.Demo").newInstance();
		System.out.println(demo);//dynamic method..
		//forname is return the class for object  associatie of a class
		//newInstance creates a new instance of the class represented by this Class object.
		
		
		demo=(Demo)Class.forName("javaprojects.Demo").getConstructor().newInstance();
		
		System.out.println(demo);
		
		demo=(Demo)Class.forName("javaprojects.Demo").getConstructor(String. class,int .class).newInstance("ela",9);
		
		
	    Class c=demo.getClass();
	    
	     Method m=c.getDeclaredMethod("met",Employe.class);
	     
	     m.setAccessible(false);
	     System.out.println(m);
	     m.invoke(m, new Employe());
	 

		
		
		
	}

}
class Demo{
	public Demo() {
      System.out.println("Empty constrctor....");	
      }
	public Demo(String s,int i) {
	      System.out.println(s+"...................."+i);	
	}
	public void met(Employe s) {
		System.out.println(s);
	}
	
}
class Employe{
	
}
