package staticdemo;

public class InheritanceDemo7 {

	public static void main(String[] args) {
		HeroCompany dd=new Redcar();
		System.out.println(dd.cost());
		
	}

}
abstract class HeroCompany{
	public abstract  int cost();
	
}
abstract class Car extends HeroCompany{
	
}

class Redcar extends Car{
	Redcar red;
	public Redcar() {
		// TODO Auto-generated constructor stub
	}
	public Redcar(Redcar red) {
		this.red=red;
	}
	@Override
	public int cost() {
		if(red==null) {
			return 200000;
			
		}else {
			return 200000;
		}
	
		
	}
	
}
	
	

