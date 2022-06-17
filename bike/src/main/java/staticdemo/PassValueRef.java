package staticdemo;

public class PassValueRef {

	public static void main(String[] args) {
		//simple type
		int  n=100;
		
		int k=n;//we can creat copy
		
		n=n+100;
		//System.out.println(k);
		//k=n+100;
		
		System.out.println(n);
		System.out.println(k);
		
		String str="hello";
		
		String temp=str;//it will created from copy
		str=str+"word.....";
		System.out.println(str);
		System.out.println(temp);
		
		
		//complex type-pass by refrance
		
		World w=new World();
		
		World tempw=w;
		
		w.size=110083;
		System.out.println(w.size);
		System.out.println(tempw.size);
		
		
		
	}

}
class World{
	int size=10;
}
