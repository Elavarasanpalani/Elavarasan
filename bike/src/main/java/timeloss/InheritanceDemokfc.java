package timeloss;

public class InheritanceDemokfc {

	public static void main(String[] args) {
		Watchman elaLambda=()->{System.out.println("Welcome to malll");
		};elaLambda.met();
		
		
		
		
		
	   
		Mall tedy=new Chicken(new PeperChicken(new Vennilaa(new Buluberry())));
		System.out.println("the vlaue .."+tedy.cost());
		tedy=new Vennilaa(new Buluberry(new Chicken(new PeperChicken(new Chicken()))));
		System.out.println("the vlaue of..."+tedy.cost());
		
		
		
		
	
		
		
		
	

}
}
interface Watchman{
	public void met();
	
}
	
abstract class Mall {
	public abstract int cost();
 

	
}

	
	


abstract  class Kfc extends Mall{
	
}
abstract class Ibaco  extends Mall{
	
}
class Chicken extends Kfc{
	Mall mall;
	public Chicken() {
		
	}
	public Chicken(Mall mall) {
		this.mall=mall;
		
	}

	@Override
	public int cost() {
		if (mall==null) {
			return 100;
			
		}else {
			return 100+mall.cost();
		}
	}
	
}
class PeperChicken extends Kfc{
	Mall mall;
	public PeperChicken() {
		
	}
	public PeperChicken(Mall kfc) {
		
	}

	@Override
	public int cost() {
		if (mall==null) {
			return 115;
			
		}else {
			return 115+mall.cost();
		}
	}
	
}

class Vennilaa extends Ibaco{
	Mall mall;
	public Vennilaa() {
		// TODO Auto-generated constructor stub
	}
	public  Vennilaa(Mall mall) {
		this.mall=mall;
		
	}
	


	@Override
	public int cost() {
	if(mall==null) {
		return 40;
		
	}else {
		return 40+mall.cost();
	}
	
		
	}
	
}
class Buluberry extends Ibaco{
	Mall mall;
	public Buluberry() {
		// TODO Auto-generated constructor stub
	}
	public  Buluberry(Mall mall) {
		this.mall=mall;
		
	}
	


	@Override
	public int cost() {
	if(mall==null) {
		return 50;
		
	}else {
		return 50+mall.cost();
	}
	
		
	}
	
}





