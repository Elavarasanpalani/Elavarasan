package keywords;

public class SuperKeywork1 {
	//super key word is ref=super class constructor, super method ,super  class veriable

	public static void main(String[] args) {
		medium dd=new medium();
		dd.tkmet();
		

	}

}
abstract class topm{
	public void tkmet() {
		System.out.println("this t  k m methed of super key word");
	}
}
abstract class top extends topm{
 public void tkmet(){
	 super.tkmet();
		System.out.println("this is t met of super key word");
		
	}
}
abstract class topkey extends top{
   final public void tkmet() {
	//   tkmet();/// is a recursion can't  called two  same method for calss
	   super.tkmet();// super key work is refer to super class methods
		System.out.println("this is tk met of super key word");
	}
}
class medium extends topkey {
	
	
}

