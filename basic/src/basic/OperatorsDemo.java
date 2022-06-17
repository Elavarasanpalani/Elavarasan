package basic;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic operators
				//+,-,*,%,/
		int n1=10;
		int n2=2;
		//Addition
		System.out.println(n1+n1);
		//sub
		System.out.println(n1-n2);
		//mul
		System.out.println(n1*n2);
		//mod
		System.out.println(n1%n2);
		//div
		System.out.println(n1/n2);
		
		
		//increment and decrement operators
		int i=n1++;//this will allocate and then increment
	    i=++n1;//n1=n1+1; - it will increment and allocation
		System.out.println(i);
		
		int x=20;
		
		System.out.println(x++);//first it will print and then increment
		System.out.println(x);
		
	    x=20;
		System.out.println(x--);//first it will print and then decrement
		System.out.println(x);
		
		
        x=21;
		
		System.out.println(++x);//first it will increment and then print
		System.out.println(x);
		
		x=20;
		System.out.println(--x);//first it will decrement and then print
		System.out.println(x);
		
		x=20;
		//x=x+4;
		x+=4;
		System.out.println(x);
		
		x=20;
		//x=x-4;
		x-=4;
		System.out.println(x);
		
		x=20;
		//x=x*2;
		x*=2;
		System.out.println(x);
		
		x=20;
		//x=x/3;
		x/=3;
		System.out.println(x);
		
		x=20;
		//x=x%3;
		x%=3;
		System.out.println(x);
		
		//Relational Operators = ==, !=, <, >, <=, >= -0--> to compare value is relation  olperator
		int num1=100;
		int num2=200;
		
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1<num2);
		System.out.println(num1>num2);
		System.out.println(num1<=num2);
		System.out.println(num1>=num2);
		
		System.out.println(!(num1>=num2));//false
		//Logical operators = &&, ||, !----> it will check to two condition
		
		System.out.println(!(num1<num2 && num1==100));//true because edther or
		
		System.out.println(num1<num2 || num1==101);//false - will return true only if both the conditions are satisfied	
		System.out.println(num1 != num2);
		int y=10;
		int z=30;
		
		System.out.println(y<z   &&  y==z);
		
		System.out.println(y>z || y!=z);
	}

}
