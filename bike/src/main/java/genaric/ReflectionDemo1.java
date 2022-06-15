package genaric;

import java.lang.reflect.Method;

public class ReflectionDemo1 {

	public static void main(String[] args)throws Exception {
		Demo demo =new Demo();// Static object creation -it use to compail time 
		System.out.println(demo);
		System.out.println();
		
		Demo demo1=(Demo)Class.forName("genaric.Demo").newInstance();//dynamic object -it is use to give for run time 
		System.out.println(demo1);
		System.out.println();
		
		demo=(Demo)Class.forName("genaric.Demo").getConstructor().newInstance();
		System.out.println(demo);
		System.out.println();
		
		demo=(Demo)Class.forName("genaric.Demo").getConstructor(int.class,String.class).newInstance(100,"ela");
		System.out.println(demo);
		System.out.println();
		
	     Class c=demo.getClass();
	     Method f=c.getDeclaredMethod("met",String .class, Employee. class);
	     
	     f.setAccessible(true);//like field  instanc but not actural field it create.it  will reflecting the object
	     System.out.println(f);
	     f.invoke(demo,"hello",new Employee());
		
		
		
		
		
		
		

	}

}
class Demo{
	public Demo() {
		System.out.println("empty");
	}
	public Demo(int i,String str) {
		System.out.println(i+"................"+str);
	}
	public void met(String s,Employee e) {
		System.out.println(s+".........."+e);
		
	}
	
}
class Employee{
	public Employee() {
		System.out.println("the employe object  is created...");
	}
}
