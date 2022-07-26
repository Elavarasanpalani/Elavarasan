package test2;



public class Visitor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
public static int computerprice(Itemelement[] item) {
	Shoppingcardvist  visto =new shoppingcardvisimp();
	
	int sum=0;
	
	for(Itemelement item12:item) {
	  sum=sum+item12.accpet(visto);
	}
	
	return sum;
	
}
}

class shoppingcardvisimp implements ShoppingCartVisitor{

	@Override
	public int visit(Book book) {
		int cost=0;
		
		if(book.getPrice()>50) {
			cost=book.getPrice()-5;
		}else {
			cost=book.getPrice();
		}
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost=fruit.getWeight()*fruit.getPricekg();
		
		return cost;
	}
	
}


interface Itemelement{
	public int accpet(Shoppingcardvist visite);
}




interface Shoppingcardvist{
	int visit(Books books);
	int visit(Fruit fru);
//	int visit(test2.shoppingcardvisimp.Fruit.Books books);
}


class Fruit implements Itemelement{
	
	private int pricekg;
	public int getPricekg() {
		return pricekg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	private int weight;
	private String name;
	public Fruit(int pricekg,int weight,String name) {
		this.pricekg=pricekg;
		this.weight=weight;
		this.name=name;
	}
	
	@Override
	public int accpet(Shoppingcardvist visite) {
		// TODO Auto-generated method stub
		return visite.visit(this);
	}
	
	class Books implements Itemelement{
		public Books() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int accpet(Shoppingcardvist visite) {
			// TODO Auto-generated method stub
			return visite.visit(this);
		}
		
	}
}
