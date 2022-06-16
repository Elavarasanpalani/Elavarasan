package genaric;

public class UseEnum {
	public static void main(String[] args) {
	
		System.out.println(Fruitss.BANANA.details);
		met(Fruitss.APPLE);
		
		//System.out.println(Fruitss.valueOf("MANGO").details);
		
		for(Fruitss d:Fruitss.values())
		System.out.println(d.details);
	
		
		
	}
	public static void met(Fruitss furits) {
		System.out.println(furits);
		
	}
	
}
