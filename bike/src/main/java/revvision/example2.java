package revvision;

public class example2 {

	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println(bank.depoisite(100000));
		long mon=bank.getmoney();
	String name=bank.getname();
	System.out.println(mon);
	System.out.println(name);
		
	}
	
}
class Bank{
	
	boolean depoisite(int amt) {
		if(amt>1000) {
			
			return true;
		}else {
			return false;
		}
	}
	
	long getmoney(){
		return 10L;
	}
	
	String getname() {
		return "sam";
	}
}
