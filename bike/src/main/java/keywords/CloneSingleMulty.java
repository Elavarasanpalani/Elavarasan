package keywords;

public class CloneSingleMulty {

	public static void main(String[] args) {
		//Singlton
		Balance b1=new Balance(); //it will create obj is one time it shared valeu in mul ref....
		Balance b2=b1;
		System.out.println("the value of the amount...."+b2.amt);
		System.out.println(b1.amt);
		
		//multiton
		b2=new Balance();
		
		//clone
		b1.amt=100;
		
		b2.amt=200;
		//b2=b1.getclone();
		
		System.out.println(b2.amt);
	
		
		
		
		
	}

}
class Balance implements Cloneable//becaus is prodectoed   
{
	public Balance() {
		System.out.println("balance object creating of the amount....");
		
	}
	int amt;
	
	public Balance getclone() {
		try {
			return	(Balance) super.clone();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	
	}

	
}

