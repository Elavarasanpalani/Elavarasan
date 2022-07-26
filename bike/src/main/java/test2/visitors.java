package test2;

public class visitors {
	
	public static void main(String[] args) {
		ItemElement[] item=new ItemElement[] { new  Book(30, "1234"),new Fruit(10, 2, "banaba")};
		
	int total=calculateprice(item);
	System.out.println("total cost=" +total);
		}
	


private static int calculateprice(ItemElement[] item) {
	Shoppingcared visitor=new shopcaredvisted();
	int sum=0;
	
	for(ItemElement item1 :item) {
		sum=sum+ item1.accpt(visitor);
		
	}
	
	return sum;
	
}
}


class shopcaredvisted implements Shoppingcared{

	@Override
	public int visit(Book book) {
		int cost=0;
		if(book.getPrices()>50) {
			cost=book.getPrices()-5;
		}else {
			cost=book.getPrices();
			System.out.println("book isbn::"+book.getIsboname()+"cost="+cost);
		}
		
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost=fruit.getPriceprekg()*fruit.getWeight();
		System.out.println(fruit.getName()+"cost="+cost);
		return cost;
	}
	
}

interface ItemElement1{
	public int  accpt(Shoppingcared shop);
}




interface Shoppingcared{
	int visit(Book book);
	int visit(Fruit fruit);

}
class Fruit  implements ItemElement{
	private int priceprekg;
	private int weight;
	private String name;
	
	public int getPriceprekg() {
		return priceprekg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	
	
	public Fruit(int pricekg,int weight,String na) {
		this.priceprekg=pricekg;
		this.weight=weight;
		this.name=na;
		
	}

	@Override
	public int accpt(Shoppingcared shop) {
		
		return shop.visit(this);
	}
	
}

class Book implements ItemElement{
	private int prices;
	
	
	public String getIsboname() {
		return isboname;
	}

	

	public int getPrices() {
		return prices;
	}

	private String  isboname;
	
	public Book(int prices,String isboname) {
		this.isboname= isboname;
		this.prices=prices;
		
	}

	@Override
	public int accpt(Shoppingcared shop) {
		// TODO Auto-generated method stub
		return shop.visit(this);
	}
	
}

