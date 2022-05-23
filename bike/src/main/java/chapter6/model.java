package chapter6;

public class model {

	public static void main(String[] args) {
		Test obj =new Test();
		obj.mod(39,50);
		obj.mod1(new int [] {45,456,4,56,45,4,54});

	}

}
class Test{
	void mod(int i,int j) {
		System.out.println(i+":"+j);
	}
	void mod1(int a[]) {
		for(int i:a) {
			System.out.println(i);
			
		}
	}
}
