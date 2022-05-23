package timeloss;

public class Cat
{
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.c1(45,66);
	}
	

}
class Demo
{
	void c1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
