package staticdemo;

public class ThisDemo1 {
	String s;
	//String j;
	public ThisDemo1(String s) {
		this.s=s;
	}
	public static void main(String[] args) {
		//this keyword cannot be used inside a static method
		ThisDemo1 obj=new ThisDemo1("some value...");
		obj.printS("aaaaaaaaaa");
		ThisDemo1.tamil("ela");
		Raja obj1=new  Raja();
		obj1.rani("thais is this key work");
		obj1.sole("prodect the solture of the kindom","don");
		
	}
	
	public void printS(String s) {
		System.out.println(this.s);
		//System.out.println();
		//System.out.println(this.j);
		
		
	}
	static void tamil(String s) {
		System.out.println(s);
		
	}
	

}
class Raja{
	String j;
	public void rani(String l) {
	 this.j=l;
	System.out.println(j);
		
		
	}
	public void sole(String  d,String f) {
		System.out.println(d);
		System.out.println(j);
		System.out.println(f);
		System.out.println(this.j);
		
	}
}
