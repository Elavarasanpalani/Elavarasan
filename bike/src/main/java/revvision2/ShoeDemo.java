package revvision2;

public class ShoeDemo {
	public static void main(String[] args) {
		Customer customer=new Customer("stalin");
		ShoeShop shop=Chennai.getShop();
		Shoe shoe=shop.sellShoe(customer);
		
		System.out.println(shoe);
	}
}
class Chennai{
	public static ShoeShop getShop() {
		ShoeFactory factory=new BataShoeFactory();
		ShoeShop shop=new AnoundShoeShop();
		
		//dependency injection
		shop.setFactory(factory);
		
		return shop;
	}
}
abstract class Shoe{
	
}
class SportsShoe extends Shoe{
	
}
class LeatherShoe extends Shoe{
	
}
class Customer{
	String name;
	public Customer(String name) {
		this.name=name;
	}
}
interface ShoeManufacturer{
	public Shoe makeShoe();
}
interface ShoeSeller{
	public Shoe sellShoe(Customer c);
}
abstract class ShoeFactory implements ShoeManufacturer{
	
}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new SportsShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new LeatherShoe();
	}
}
abstract class ShoeShop implements ShoeSeller{
	ShoeFactory factory;
	public ShoeFactory getFactory() {
		return factory;
	}
	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
class AnoundShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer c) {
		return getFactory().makeShoe();
	}

}
