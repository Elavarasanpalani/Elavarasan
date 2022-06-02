package staticdemo;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Humen ss=new Tamil();
		Humen ff=new English();
		Humen gg=new Maths();
		ff.selvam();
		ss.selvam();
		gg.selvam();
		
		
		
	}

}
abstract class  Humen{
	final  String name="Humen name is abstact class";{
		System.out.println(name);
	}

	abstract void  selvam();
	
}
 class Tamil extends Humen{
	
	public void selvam() {
		
		System.out.println(" he wea studying ");
		
		//English ff=new English();
		//ff.selvam();
		//Maths gg =new Maths();
		//gg.selvam();
	}
	
}
 class English extends Humen{
	public void selvam() {
		System.out.println("aftere struding he was work");
	}
}
class Maths extends Humen{
	public void selvam() {
		System.out.println("he was buy a bike");
	}
}
