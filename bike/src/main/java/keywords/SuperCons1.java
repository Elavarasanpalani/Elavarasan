package keywords;

public class SuperCons1 {

	public static void main(String[] args) {
		cartoon dd=new cartoon("ela");
		
		
		
	}

}
class tom{
	public tom() {
		System.out.println("default constructor print defalty");
	}
	
}
class jerry extends tom{
	public jerry(int j) {
		System.out.println("the vlaue of the super class...."+j);
		
	}
	
}

class cartoon extends jerry{
	public cartoon(String s) {
		super(121);//super constructor is ref to sub class to super class
		
	    System.out.println(s);
		
	}
	
}
