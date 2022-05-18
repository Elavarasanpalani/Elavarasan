package basic;

public class CastingDemo {

	public static void main(String[] args) {
		
		byte b=100;
		int n=b;//auto type promotion
		//b=(int)n;
		System.out.println(n);
		
		
		//b=n;//illegal - because int is 32 bit and byte is 8 bit - they are incompatible
		
		//to solve this we can do explicit casting
		
		b=(byte)n;
		System.out.println(b);
		
		n=423;
		b=(byte)n;
		System.out.println(b);
		
		byte n1=2;
		byte  n2=10;
		
		int n3=n1*n2;
		System.out.println(n3);
		
		byte n4=(byte)(n1*n2);
		
		float f=100.23f;
		//n=int(f);//integer can be stored in float but not vice versa
		f=(float)n;
		System.out.println(f);
		
		
		
		char c=97;
		int d=c;
		System.out.println(c);
		//System.out.println((char)n);
		//;c=n;
		
		
	}

}
