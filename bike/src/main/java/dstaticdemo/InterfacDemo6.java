package dstaticdemo;

public class InterfacDemo6 {

	public static void main(String[] args) {

//anaonymus
		ela kk=new ela();
		kk.balance=9000;
		
		new Adi() {
			
			@Override
			public ela demo(ela acc, int amt) {
				acc.balance=acc.balance-amt;
				return acc;
			}
		}.demo(kk, 5000);
		System.out.println("the vlaue of ,,"+kk.balance);
		
		//method refgrance
		ela mm=new ela();
		mm.balance=9000;
		
		Adi ll=new InterfacDemo6()::demo1;
		ll.demo(mm, 8000);
		System.out.println("the vlaue of .."+mm.balance);
		//lambda
		ela nn=new ela();
		nn.balance=9000;
		
		Adi bblambd=(acc,amt)->{
			acc.balance=acc.balance-amt;
			return acc;
			
		};
		bblambd.demo(nn, 4568);
		System.out.println("the value of .."+nn.balance);
		//teacher
		ela nd=new ela();
		nd.balance=9000;
		
		Adi jj=new ela();
		jj.demo(nd, 2457);
		System.out.println("the value of .."+nd.balance);
		
		
	}
	public ela demo1(ela acc,int amt) {
		acc.balance=acc.balance-amt;
		return acc;
		
	}

}
interface Adi{
	public ela demo(ela acc,int amt);
	
}
class ela implements Adi{
	int balance;

	@Override
	public ela demo(ela acc, int amt) {
		acc.balance=acc.balance-amt;
		return acc;
	}
	
}