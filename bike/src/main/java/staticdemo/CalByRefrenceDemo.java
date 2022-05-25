package staticdemo;

public class CalByRefrenceDemo {

	public static void main(String[] args) {
		MyBank sbi=new MyBank();
	    
		Money myMoney=new Money();
		
		sbi.acceptMoney(myMoney);
		
		
		sbi.TransferMoney(10000, new Account());
		
	}

}

class MyBank{// this is class
	
	public void acceptMoney(Money m) {
		
	}
	public void TransferMoney(int amt,Account acct) {
		acct.credit(100);
		acct.debit(200);
	}
	
	
}
class Money{
	public void AccountName(String s) {
		
	}
	
}
class Account{
	public void debit(int drid) {
		System.out.println("debited..."+drid);
	}
	public void credit(int crdit) {
		System.out.println("credited.."+crdit);
	}
}
