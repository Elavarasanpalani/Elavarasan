package staticdemo;

public class StaticDemo1 {

	public static void main(String[] args) {
		
		House.saram="23 ton bouth";
		System.out.println(House.saram);
		
		House veedu1=new House();
		veedu1.saram="2 ton bouth....";//it passing argument
		veedu1.toilet="western toilen...";
		System.out.println(House.saram);
		System.out.println(veedu1.toilet);
		
		House veedu2=new House();
		veedu2.toilet="indian toilet..";
		System.out.println("veedu2 saram.."+veedu2 .saram);
	   System.out.println("veedu2 toilet..:"+veedu2.toilet);
		veedu2.toilet("Steel tap..");
		
		
		
		//House veedu3=new House();
		//veedu3.toile("elavarasan");
		
		
		
		
		
	}

}
class House{
	static String saram;//class veriable it can use anywehere
	String toilet;//it is instance variable  we can use class only dont use method
	public void toilet(String tap) {// it passing perameters
	String taps=tap;
		//tap="elavarasan";//local veriable
	    System.out.println(taps);
		System.out.println(tap);
		
	}
}