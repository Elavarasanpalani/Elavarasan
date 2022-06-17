package chapter6;

public class LastExcersize {
	//System.out.println("this is abstract clsss");
	public static void main(String[] args) {
		College Roll=new College();
		//Roll.c1();
		Roll.student();
		Roll.A.avs();
	}

}
class College implements Study{
	
		class c2 
			{
				void avs() {
					System.out.println("Enter valu");
				}
			}
		
		c2 A=new c2();
	
public 	void student() {
		System.out.println("this is read time"+a);
	}
}
interface Study{
	int a=19;
	void student();
}
