package staticdemo;

public class StaticCompleType {

	public static void main(String[] args) {
		Classroom neuton=new Classroom();
		
		Classroom edison=new Classroom();
		
		System.out.println(edison.sanyo+":"+edison.sulab);
		
		System.out.println(neuton.sanyo+":"+neuton.sulab);
		
		
		Board black =new Board();
		System.out.println(black.meena);
		
	}

}
class Classroom{
	Projecter sanyo=new Projecter();
	
	static Toilet sulab=new Toilet();
	
}
class Projecter{
	
	
}
class Toilet{
	
}
class Board{
	Staff meena=new Staff();
	
}
class Staff{
	
}