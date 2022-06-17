package chapter6;

public class CalaculatePro1 { 
	public static void main(String[] args) {
		CalaculatePro1 obj=new CalaculatePro1();
		obj.add1(20,30);
		obj.add2();
		obj.add3(45,26,0);
		System.out.println(obj.add3(0,0,0));
		//obj.add4( new int  [] {12,30,55,00,6});
		System.out.println(obj.add4(56,23));
		obj.ben(new int [] {51,30,55,66,66,32});
		
	}
	void add1(int i,int j) {
		int k=i+j;
		System.out.println(k);
	}
	void add2() {
		int o = 885;
		int p = 565;
		
		int k = o+p;
	
		System.out.println(k);
		 
		
	}
	int add3(int i,int j,int k) {
		k=i+j;
		System.out.println(k);
		 return 1000;
	}
	void add4(int a[]) {
		for (int i: a) {
			System.out.println(i);
		}
	}
	int add4(int a,int c) {
		int d=a+c;
		
		return d;
	}
	void ben(int b[]) {
		
		for(int i:b) {
			System.out.println(i);
		}
	}
 
	}


