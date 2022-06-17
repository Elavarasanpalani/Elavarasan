package chapter6;

public class Mathod {/// classification ---it is a only creat object  in main class
	int a=10;
	static int b=9;
	public static void  main(String []args) {
		System.out.println(b);
		Sample num=new Sample();
		
		num.med1();
		num.maed2();
		num.msd();/// main class have tow object create or not ?
		num.ben();
		
		Sample1 run=new Sample1();//new operator is allocate to memory of the refrence neme.
		run.doni();
		
		Sample3 jerry=new Sample3();
		jerry.tom();
		
	}
}


 class Sample implements Raj{//claisifier--abstrac class--->use i dont change  
	int i;//instan verisble 
Mathod k=new Mathod();
int c=k.a;
int e=k.b;
   void med1() { /// rols
	   System.out.println(c);
	System.out.println(e);
	System.out.println("Elavarsan");
}
   void maed2() {
	   int j=10;//local variable
	   System.out.println(j);
   }
   void msd() {
	   int k=120;
	   int c=k+i;
	   System.out.println(c);
   }
 public void ben() {
	   System.out.println(z);
   }
 }
   
 class Sample1{
	 void doni() {
		 System.out.println("is the best player");
	 }
 }
 class Sample3{
	 void tom() {
		 System.out.println("this the cartoom charectot..");
	 }
 }
interface Raj{   //roal -
	int m=8;
	String z="muthu";
	
	void ben(); //declare work
	
}
	
	


