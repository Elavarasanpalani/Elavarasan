package dstaticdemo;

public class InterfacesDemo5 {

	public static void main(String[] args) {
		Teacher tamil=new Teacher();
		tamil.balaces=5000;
		
		//Anaonymus
	Teacher myaccount2=new Fidemo() {
			
			@Override
			public Teacher ela(Teacher acc, int amt) {
				acc.balaces=acc.balaces-amt;
				
				return acc;
			}
		}.ela(tamil, 500);
		System.out.println("the vlaue of the logic .."+myaccount2.balaces);
		
		//method refrenace
		Teacher tom=new Teacher();
		tom.balaces=5000;
		
		Fidemo kamal=new InterfacesDemo5()::demo;
	 Teacher ss=kamal.ela(tom, 2000);
		System.out.println("value..."+ss.balaces);
		
		//lambda
		Teacher jerry=new Teacher();
		jerry.balaces=5000;
		
		Fidemo elaLambda=( acc, amt)->{
			acc.balaces=acc.balaces-amt;
			return acc;
		};
		elaLambda.ela(jerry, 1000);
		System.out.println("vakye iof.."+jerry.balaces);
		
		//Teacher says
		Teacher ben=new Teacher();
		ben.balaces=5000;
		
		Fidemo  mall = new Teacher();
	Teacher ss1=mall.ela(ben, 500);
	System.out.println("the vlaue of .."+ben.balaces);
		
		
		
	
		
		
		

	}
	
	public Teacher demo(Teacher acc,int amt) {
		acc.balaces=acc.balaces-amt;
		
		
		return acc;
	}

}
interface Fidemo{
	public Teacher ela(Teacher acc,int amt);
	
}
class Teacher implements Fidemo{
	int balaces;

	@Override
	public Teacher ela(Teacher acc, int amt) {
		acc.balaces=acc.balaces-amt;
		return acc;
	}
}