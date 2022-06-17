package timeloss;

public class Cat{
	int a=10;
	public static void main(String[] args) {
		Cat p=new Cat();
		p.change(55);
		System.out.println(p.a);
		
	}
	public void change(int a) {
		a=a+100;
	}

	
	
	}

