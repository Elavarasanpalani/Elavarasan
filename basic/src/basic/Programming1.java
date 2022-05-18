package basic;

public class Programming1 {

	public static void main(String[] args) {
		//ternary operator
		String result=((4%2==0)?"Even number ":"odd number..");
		System.out.println(result);
		
		System.out.println((10>30)?"number is true ":"number is falsh");
		
		// Using if statement
		
		if(3%2==0) {
			System.out.println("numebe is even");
		}
		else {
			System.out.println("number is odd");
		}
		
		String name="edf";
		
		if(name.equals("tamil")) {///  if else ladder
			System.out.println("my name is ela");
			
		}
		
		else if(name.equals("english")){
			System.out.println("my name is ela");
			
		}
		
		else {
			System.out.println("mynotname");
		}

	}

}
