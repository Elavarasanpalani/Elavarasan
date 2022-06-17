package staticdemo;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		//1.Anoneymous,2.Metrhod Refresing ,3.lambda.4.teacher says
		//1.Anaoneymous
		new FinterOne() {
			
			@Override
			public void met() {
				System.out.println("this is Anoneymous model");
				
			}
		}.met();
	
	
	//2.Method Refressing -we will create method  
	FinterOne one=InterfaceDemo1::mymethod;
	one.met();
	
	//3.lambda
	FinterOne oneLambda=()->{System.out.println("logic is lamda....");
	};oneLambda.met();
	//System.out.println(oneLambda.met());
	
	//4.teacher sayes
	FinterOne oneela=new MyFInterOneImpl();
	oneela.met();
	System.out.println();
	
	//Part2
	//Anaonymous
	int value=new FinterTwo() {
		
		@Override
		public int met() {
			// TODO Auto-generated method stub
			return 100;
		}
	}.met();
	System.out.println("the vlaue of te ananye part 2.."+value);
	
	//Method refrence..
	
	FinterTwo two=new InterfaceDemo1()::mymethod2;
	value=two.met();
	System.out.println("the voaue of method refrance ..."+value);
	
	//lambdamoddl
	
	FinterTwo twoLambda=()->{return 3000;};
	value=twoLambda.met();
	System.out.println("the value of lambd modle"+value);
	
	//teacher says
	FinterTwo twos=new MYnter();
	value=twos.met();
	System.out.println("the value of teacer says"+value);
	System.out.println();
	
	//part3
	//Ananymos
	String store=new FinterThree() {
		
		@Override
		public String met(int i, String s) {
			// TODO Auto-generated method stub
			return i+":"+s;
		}
	}.met(100, "elavarasan");
	System.out.println("the logic of ananyms ..."+store);
	
	//method refrance
	
	FinterThree three=new InterfaceDemo1()::mymethod3;
	store=three.met(123, "kamal");
	System.out.println("the logic of method refrance..."+store);
	
	//lambda method
	FinterThree threeLambda=(int i,String s)->{return i+":"+s;};
	store=threeLambda.met(455, "meena");
	System.out.println("the logic of labda..."+store);
	
	//tracher says
	FinterThree elathree=new Teacher();
	store=elathree.met(789, "Raja");
	System.out.println("the logic of teache says..."+store);
	System.out.println();
	
	//part 4
	//Ananymus
	 IsAccount1 four=new IsAccount1();
	 four.balances=6000;
	
	new FinterFour() {
		
		@Override
		public IsAccount1 trans(IsAccount1 acc, int amt) {
			acc.balances=acc.balances-amt;
			return acc;
		}
	}.trans(four, 5000);
	System.out.println("the logic of .."+four.balances);
	
	//method refreance
	 IsAccount1 four2=new IsAccount1();
	 four2.balances=6000;
	 
	FinterFour four4=new InterfaceDemo1()::demo;
	IsAccount1 ss=four4.trans(four2, 100);
	System.out.println("the logic of .."+ss.balances);
	
	//lamda
	IsAccount1 the=new IsAccount1();
	 the.balances=6000;
	 
	FinterFour fourLambda=(acc,amt)->{
		acc.balances=acc.balances-amt;
		return acc;
		
	};
	fourLambda.trans(the, 150);
	System.out.println("the loginc of the lambda..."+the.balances);
	
	
	//teacher sayes
	IsAccount1 a=new IsAccount1();
	 a.balances=6000;
	FinterFour tech=new IsAccount1();	
	tech.trans(a, 652);
	System.out.println("the logic of techer says.."+a.balances);
	
	
	
	
	
		
		
	
	
	
	
	
	
	
		
	}
	public IsAccount1 demo(IsAccount1 acc,int amt) {
		acc.balances=acc.balances-amt;
		return acc;
		
	}
	public String mymethod3(int i,String s) {
		return (i+":"+s);
		
	}
	public int mymethod2() {
		return 2000;
	}


public static void  mymethod(){
	System.out.println("this is method refressing... ");
	
}
}
class MyFInterOneImpl implements FinterOne{
	public void met() {
		System.out.println("met normal old implementation called...");
	}
	
}
class MYnter implements FinterTwo{

	@Override
	public int met() {
		// TODO Auto-generated method stub
		return 4000;
	}
	
}
class Teacher implements FinterThree{

	@Override
	public String met(int i, String s) {
		// TODO Auto-generated method stub
		return i+":"+s;
	}
	
}

interface FinterOne{
	public void met();
	
}
interface FinterTwo{
	public int met();
	
}
interface FinterThree{
	public String met(int i,String s);
	
}
interface FinterFour{
	public IsAccount1  trans(IsAccount1 acc,int amt);
}
class IsAccount1 implements FinterFour{
	int balances;

	@Override
	public IsAccount1 trans(IsAccount1 acc, int amt) {
		acc.balances=acc.balances-amt;
		return acc;
	}
}

