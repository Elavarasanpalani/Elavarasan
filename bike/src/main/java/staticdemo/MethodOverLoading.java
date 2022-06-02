package staticdemo;

public class MethodOverLoading {
	public static void main(String[] args) {//it will same method name 
		MethodOverLoading obj= new MethodOverLoading();
		obj.met(9.7f);//shoud be pass diffrent  perameter
	}
	public void met(int i) {
		System.out.println("first vlaue is print ");
		
	}
	public void met(String d) {
		System.out.println("the second value is sString ");
		
	}
	public  void met(float v) {
		System.out.println("thired vlaue is float");
		
	}

}