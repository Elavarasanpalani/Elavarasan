package staticdemo;

public class InheritanceDemo6 {
	public static void main(String[] args) {
		Ibaco ela=new venila();
		//System.out.println(ela.cost());
		
		Ibaco tamil=new Strawberry();
		//System.out.println(tamil.cost());
		
		Ibaco kamal=new Strawberry(new Fruits(new Nuts(new venila())));
		
		System.out.println("the cost of there components..."+kamal.cost());
	}

}
abstract class Ibaco{//abstract class
	public abstract int cost();
	
}
abstract class Ieccream extends Ibaco{
	
}
abstract class Toppings extends Ibaco{
	
}
class venila extends Ieccream{
	Ibaco ibaco;
	public venila() {
		
	}
	public venila(Ibaco ibaco) {
		this.ibaco=ibaco;//main class we should  call for this key workds..
	}
	

	@Override
	public int cost() {
		if(ibaco==null) {
			return 10;
			
		}
		else {
			return 10+ibaco.cost();
		}
		
	}
	
}
class Strawberry extends Ieccream{
	Ibaco ibaco;
	public Strawberry() {
		
	}
	public Strawberry(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	

	@Override
	public int cost() {
		if(ibaco==null) {
			return 15;
			
		}
		else {
			return 15+ibaco.cost();
		}
		
	}
	
}
class Fruits extends Ieccream{
	Ibaco ibaco;
	public Fruits() {
		
	}
	public Fruits(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	

	@Override
	public int cost() {
		if(ibaco==null) {
			return 20;
			
		}
		else {
			return 20+ibaco.cost();
		}
		
	}
	
}
class Nuts extends Ieccream{
	Ibaco ibaco;
	public Nuts() {
		
	}
	public Nuts(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	

	@Override
	public int cost() {
		if(ibaco==null) {
			return 30;
			
		}
		else {
			return 30+ibaco.cost();
		}
		
	}
	
}
	
