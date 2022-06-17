package staticdemo;

public class VeiableArqument1 {

	public static void main(String[] args) {
		m1(10,20);
		m1(10,20,30);
		m1(10,20,30,40);
		
	}
	public static void m1(int...x) {
		System.out.println(x.length);
	}

}
