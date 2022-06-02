package dstaticdemo;

public class InterfaceDemo2 {

	public static void main(String[] args) {
		//1.Anonymous
		int value=new FInterTwo() {
			
			@Override
			public int met() {
				
				return 100;
			}
		}.met();
		System.out.println(" it is anoymous model"+value);
		
		//mehtod refrence
		FInterTwo two=new InterfaceDemo2()::mymethod;
		value =two.met();
		System.out.println("the models is method refrenceing..."+value);
		
		//lambda
			FInterTwo  towLambda=()->{return 3000;};
			value=towLambda.met();
			System.out.println("this lambda value od model..."+value);
			
			//teacher says
			FInterTwo tow=new Myfunimp();
			value=tow.met();
			System.out.println("thie is teache says..."+value);
		
		
		

	}
	public int mymethod() {//this is method refresing model becaue we creatring method
		return 2000;
	}

}
class Myfunimp implements FInterTwo{
	@Override
	public int met() {
		// TODO Auto-generated method stub
		return 4000;
	}
}
interface FInterTwo{
	public int met();
}