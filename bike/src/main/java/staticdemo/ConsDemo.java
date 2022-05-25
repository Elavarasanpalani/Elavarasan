package staticdemo;

public class ConsDemo {
	public ConsDemo(){
		  System.out.println("thei is can not called constructor");
	  }
	public ConsDemo(int i) {
		System.out.println(i);
		
	}
	public ConsDemo(Employee e) {
		System.out.println("employee cons called...."+e.size);
		
	}

	public static void main(String[] args) {
		new ConsDemo();
		new ConsDemo(8);
		new ConsDemo(new Employee());
		
		Employee h=new Employee();
		h.ela();
		//System.out.println(h.ela);
		System.out.println(h.size);
		
		
	}

}
class Employee{
	String  size="elavarasan";//instance veriable
	
	
	public void ela() {
		int s=10;//local variable
		System.out.println(s);
	}

	
	
	
	
}
