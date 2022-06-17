package staticdemo;

public class CallByValueDemo {
	//private char[] met2;
	public static void main(String []atgs) {
		CallByValueDemo obj=new CallByValueDemo();
		obj.met(35);
		//xobj.met2(null, 0);
		
		
		smet(6);
	}


public void met(int i) {
	i=i*30;//local veriable
	System.out.println("the value of ="+i);
	met2("hello",i);
	
}
public void met2(String g ,int j) {
	System.out.println(g+": "+j);///it is callle done method to another method
	met3("elavarasan",25);
	
}
public static void smet(int i) {
	//static method cannot access non static method
	System.out.println(i);//this place will be pass  class veriable
	smet2(45,25,"passbyvalue");
	
	
}
public static void smet2(int k,int h,String s) {
	System.out.println(k+":"+h);
	System.out.println(s);
	
}
public void met3(String n,int o) {
	int b=o+78;
	System.out.println(n+":"+o);
	System.out.println(b);
	
}
}