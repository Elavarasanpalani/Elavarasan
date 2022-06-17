package chapter6;

public class Shoe1 {




class Shoefactory implements shoemanufacture  	{
	public void mackshoes() {
		String name = null;
		System.out.println("mackshoew for facatory"+name);
		
	}
	public void Emplayes() {
		System.out.println("many employe work in shoefacatory");
		
	}
	
	
	
}
class Shoeshop{
	Shoefactory obj=new Shoefactory();
	Salesman obj1=new Salesman();

	public void bata() {
		obj1.sall();
		obj.mackshoes();
		obj.Emplayes();
		
	}
	
	
	
}
class Salesman{
	public void sall() {
		System.out.println("selling to the customer for shoe");
	}
	
	
}
class Customer{
	public void main(String[] args) {
		Customer name=new Customer();
		name.bata();
			
		
		
	}

	private void bata() {
		// TODO Auto-generated method stub
		
	}

	
	
}
interface shoemanufacture{
	String name="kamal";
	public void mackshoes();
	public void Emplayes();
	
}
}