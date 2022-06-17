package timeloss;

public class InheritanceDemoibaco {

	public static void main(String[] args) {
		Arun icecream=new Vennila();
		System.out.println("the vlaue of vennila..."+icecream.cost());
		
		Arun icecream2=new Fruits(new Choclate(new Vennila()));	
		System.out.println("the valkue of Fruits...."+icecream2.cost());
	}

}
//composition 
abstract class Arun{
	 public abstract int  cost();
	
}
abstract class Icecream extends Arun{
	
}
class Vennila extends Icecream{
	Arun arun;
	public Vennila() {
		
	}
   public Vennila(Arun arun) {//constractor one or more the one class we use that process
	 this.arun=arun;//YOU  take vennuila for Fruits we can use this key word.
		
	}

	@Override
	public int cost() {
		if(arun==null) {
			return 10;
			
		}else {
			return 10+arun.cost();
			
		}
				
	}
	
	
}
class Fruits extends Icecream{
	Arun arun;
	public Fruits() {
		
	}
    public Fruits(Arun arun) {
    this.arun=arun;
	
		
	}

	@Override
	public int cost() {
		if(arun==null) {
			return 20;
			
		}else {
			return 20+arun.cost();
			
		}
				
	}
	
	
}
class Choclate extends Icecream{
	Arun arun;
	public Choclate() {
		
	}
   public Choclate(Arun arun) {
	   this.arun=arun;
		
	}
	

	@Override
	public int cost() {
		if(arun==null) {
			return 40;
			
		}
		return 40+arun.cost();
		
	}
	
}