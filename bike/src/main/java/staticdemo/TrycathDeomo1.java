package staticdemo;

public class TrycathDeomo1 {

	public static void main(String[] args) {
		System.out.println("the  befor excepton ...");
		int a[]= {10,20,30};
		//int v =3;
	//int c=0;
		//int j;
		
		try{
			int j=1/1;
			System.out.println("after exeption..."+j);
			for(int i=0; i<6;i++) {
				System.out.println("the value of array.."+a[i]);
				
			}
		}catch(ArithmeticException y){
			System.out.println(y);
			new jon().hello(y);
			
		}
			
			
		catch(ArrayIndexOutOfBoundsException u){
			System.out.println(u);
			new handle().hand1(u);
			
			
			
		}finally {
			System.out.println("finally block code called...");
		}
		System.out.println("the afrer exception ...");
		
	}

}
class handle{
	public void hand1(ArrayIndexOutOfBoundsException f) {
		System.out.println("the array lenth is more then three  so dont use.."+f);
	}
}
class jon{
	public void hello(ArithmeticException d) {
		System.out.println("plz dont divid zero..."+d);
	}
}
