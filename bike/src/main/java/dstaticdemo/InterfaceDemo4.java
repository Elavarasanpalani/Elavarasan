package dstaticdemo;

//import javax.print.attribute.standard.Fidelity;

public class InterfaceDemo4 {

	public static void main(String[] args) {
		//Anonymosu
		MyAccount myaccount=new MyAccount();
		myaccount.balance=2000;
	   MyAccount  my=new FIfour() {
			
			@Override
			public MyAccount transfer(MyAccount act, int amt) {
				act.balance=(act.balance-amt);
				return act;
			}
		}.transfer(myaccount, 500);
		System.out.println("the is acooutn balce checkein foujr .."+my.balance);
		
		//mehod refreance
		MyAccount smyaccount=new MyAccount();
		myaccount.balance=2000;
		
		FIfour four=new InterfaceDemo4()::mymethod4;
	     smyaccount=four.transfer(myaccount, 1000);
		System.out.println("the method refrance vaolue....."+smyaccount.balance);
		
		//lambda
		MyAccount tmyaccount=new MyAccount();
		myaccount.balance=2000;
		
		FIfour elaLambda=(act, amt) -> {
		act.balance=(act.balance-amt);
		return act;
		};
		myaccount=elaLambda.transfer(myaccount,1500);
	
		System.out.println("the Lambda vlaue of "+tmyaccount.balance);
		
		//teacher sacys
		FIfour fours=new MyAccount();
		MyAccount f=four.transfer(myaccount, 800);
		System.out.println("the teache says model"+f.balance);
		
		
		
		
		

	}
	public MyAccount mymethod4(MyAccount act,int amt){
		act.balance=(act.balance - amt);
		return act;
		
	}

}
//class Casier implements FIfour
interface FIfour{
	public MyAccount transfer(MyAccount act,int amt);
}
class MyAccount implements FIfour{
	int balance;

	@Override
	public MyAccount transfer(MyAccount act, int amt) {
		act.balance=act.balance-amt;
		// TODO Auto-generated method stub
		return act;
	}
	
}
