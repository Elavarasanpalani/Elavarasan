package chapter6;

public class Elka {
	public static void main(String[] args) {
Elka calc=new Elka();

                                                                              
		System.out.println(calc.add1(10, 20));
		//int result=calc.add1(100,20);
		
//	System.out.println(result);
		
		//calc.add1(10,20);
		
		
		calc.add4(10,20,100,300,10);
		
		calc.add5(new int[] {10,20,30,40});
	}

	public void add5(int[] is) {
		System.out.println("elavarasan");
	}

	public  void add4(int i, int j, int k, int l, int m) {
		int s=i+j+k+l+m;
		System.out.println("the is number of the programmmg languvage   ="+s);
	}

	private int  add1(int i, int j) {
		int t=i+j;
		System.out.println(t);
		return i+57;
		
	}

}
