package staticdemo;

public class InheritanceDemo4 {

	public static void main(String[] args) {
		Dominos dominos=new JahnaviPizza();
		dominos.sellPizza();
	}
}
abstract class Dominos{
	private void makeDough() {
		System.out.println("dough made as per the dominos logic..");
	}
	private void bakePizza() {
		System.out.println("pizza baked as the dominos logic..");
	}
	private void addToppings() {
		System.out.println("toppings added as per the dominos logic..");
	}
	private void packing() {
		System.out.println("packing done as per dominos logic...");
	}
	final public void makePizza() {//this method is called template method
		makeDough();
		bakePizza();
		addToppings();
		packing();
	}
	final public void sellPizza() {//this method is called template method
		collectMoney();
		makePizza();
		delivery();
	}
	public abstract void delivery();
	public abstract void collectMoney();
}
class JahnaviPizza extends Dominos{
	@Override
	public void collectMoney() {
		System.out.println("money is collected in US Dollors..");
	}
	@Override
	public void delivery() {
		System.out.println("delivery done via benz car....");
	}
	
}