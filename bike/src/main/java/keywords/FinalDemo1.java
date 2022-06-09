package keywords;

public class FinalDemo1 {
	//final method can be over load
	//fina  method cannot be over rider
	//final class cannot be inheritance
	//
	

	public static void main(String[] args) {
		Fin nn=new Fin();
		nn.met(90);
		System.out.println(nn.x);
		
		

	}

}
 class Fin{
	final int x=100;//  final is a constant 
	int i=10;
	final void met() {
		
	}
	final void met(int s) {
		System.out.println(s);
		
	}
	
}
class Tin extends Fin{
	int x=999;{
		System.out.println(x);
	}

	//void met(int d) {
		
		
		
	}
class toms{
	int x=100;
}

