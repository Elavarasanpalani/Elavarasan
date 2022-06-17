package staticdemo;

public class ThisDemo2 {
	String p;
	String t;//instant veribale and contructorer value store pannura veriable sameornot check is this keywork
	
	public ThisDemo2(String s) {
     t=s;//constructor//logic giver
     p=s;
		//System.out.println(s);
		
	}
	public static void main(String[] args) {
		ThisDemo2 ela=new ThisDemo2("this keywork...");
		ela.prints("elavarasan","elaga");
		ela.sadham("dfsdfs","eddfds");
	}
	public void prints(String  s,String i) {
		System.out.println(s);
		//System.out.println(i);
		System.out.println(this.t);//locanl veirbale cannot acces  instan veriable
	}
	public void sadham(String s,String p)
	{
	//String	q=s;
		System.out.println(p);
		System.out.println(t);
		System.out.println(s);
	}
}

	

	
		

	


