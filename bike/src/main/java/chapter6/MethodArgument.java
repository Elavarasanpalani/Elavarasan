package chapter6;

public class MethodArgument {

	public static void main(String[] args) {
		Demp d=new Demp();
		d.msd(20,30, "ela");
		d.msd1(new int [] {10,20,30,40,50,60,55,0,52,052,0,5});
		
	}

}
class Demp{
	void msd(int i,int j,String  s) {
		System.out.println( i+":"+j+":"+s);
	}
	void msd1(int a[]) {
		for(int i:a) {
			System.out.println(i);
		}
	}
}