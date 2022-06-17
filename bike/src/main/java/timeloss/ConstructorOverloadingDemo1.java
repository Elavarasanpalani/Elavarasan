package timeloss;

public class ConstructorOverloadingDemo1 {

	public static void main(String[] args) {
		Biscuirt ss=new Parlag();
		
		

	}

}
abstract class Biscuirt{
	
	
}
class Parlag extends Biscuirt{
	Biscuirt bis;
	public Parlag() {
		System.out.println("called ibaca");
		
	}
	

	
}
class Milkbis extends Biscuirt{
	 Biscuirt bis;
	public Milkbis() {
		System.out.println("this is milk");
		
	}
	public Milkbis(Biscuirt bis) {
		this.bis=bis;
		
	}
	
	
}
