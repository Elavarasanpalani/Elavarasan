package staticdemo;

public class TryCathcDemo {///1.we are accept the problam
	//we should conve the prcess
	//we should handil the process...

	public static void main(String[] args) {
		
		
		System.out.println("befour excution....");
		try{
			int i=1/0;
		}catch(Exception s) {//Exception handiling 
			System.out.println(s);
			new Handling().handle(s);
		}
		
		
		System.out.println("after excution..... ");
		

	}

}
class Handling{
	public void handle(Exception u) {
		System.out.println("plz dont divide the process of zeor.."+u);
	}
}
