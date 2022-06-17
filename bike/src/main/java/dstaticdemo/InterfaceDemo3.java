package dstaticdemo;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		//Anonymos
	String  value = new FIthree() {
			
			@Override
			public String met(int i,String s) {
				// TODO Auto-generated method stub
				return i+":"+s;
			}
		}.met(155,"elavarsanvjvj");
		
		System.out.println("this is anaymous model..."+value);
		
		
		//methos refrence
		FIthree three=new InterfaceDemo3()::mymood;
		value=three.met(65, "Kamal");
		System.out.println("the prosess of mehtod refreance..."+value);
		
		//lambda
		FIthree threeLambda=(int i,String s)->{return i+":"+s;};
		value=three.met(999,"kamal value");
		System.out.println("this is lambda model vlaue"+value);
		
		//teacher says
		FIthree dd=new Myfun4();
		value=dd.met(4545, "rani");
		System.out.println("this is teache says meodal..."+value);
		
		
		
		

	}
	public String mymood(int i,String s) {
		return  (i+":"+s);
	}

}
class Myfun4 implements FIthree{
	@Override
	public String met(int i, String s) {
		// TODO Auto-generated method stub
		return i+":"+s;
	}
}
interface FIthree{
	public String met(int i,String s);
}
