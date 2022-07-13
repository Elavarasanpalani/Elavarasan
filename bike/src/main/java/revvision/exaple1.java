package revvision;

public class exaple1 {

	public static void main(String[] args) {
		Test obj=new Test();
		
		obj.met1();
		obj.met2();
		
		int reshult=obj.met3(); //it si capture reshult 
		System.out.println(reshult);	

	}
	}
	
//class Test{
//	int i;//this is local veriyable....
//	void met1() {// it is non return metho 
//		int value=10;//local veriable 
//		
//		System.out.println(i);
//		System.out.println(value);
//		
//	}
//	
//	void met2() {
//		System.out.println(i);
//	}
//	
//	int met3() { //it is return method ..
//		return 122;
//		
//	}
//}



class Test{
	int i;//locla variable
	void met1() {
		int value=3; //local variable
		System.out.println(value);
		
	}
	void met2() {
		System.out.println(i);
		
		
		
		
	}
	int met3() {
		
		return 10;
		
	}
}


