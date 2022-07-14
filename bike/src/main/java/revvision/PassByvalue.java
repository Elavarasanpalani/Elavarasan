package revvision;

public class PassByvalue {
	
	
	public static void main(String[] args) {
		Shop shop=new Shop();
		
		factory fact=new factory();
		System.out.println(shop.met(fact).t);
	}
	
	
	
}
class Shop{
	factory shop; 
	
	public factory met(factory dd) {
		this.shop=dd;
		return shop;
		
	}
	
	
	
}
class factory{
	int t=10;
}
