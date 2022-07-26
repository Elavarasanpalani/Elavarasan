package corejava;

public class Genarics {
	public static void main(String[] args) {
		
//		badpaintbrus bd=new badpaintbrus();
//		bd.dopaint(1);
		
		Water wa=new Water();
		Air ai=new Air();
		
		Goodpaintbrus<Water>  wr=new Goodpaintbrus();
		wr.setObj(wa);
		
		wa.dowater();
	}

}


abstract class paint{}
class readpaint extends paint{}

class bluepaint extends paint{}

class goodpaintbures1{
	paint pa;
	
	public void  dopaint() {
		System.out.println(pa);
	}
	
}

class badpaintbrus{
	
	public void dopaint(int i) {
		
		if(i==1) {
			System.out.println("reapain");
			
		}
		else if(i==2) {
			System.out.println("blue");
		}
		
	}
	
}

class Water{
	public void dowater() {
		System.out.println("water in the bresh..");
	}
}
class Air{
	public void doair() {
	  System.out.println("ait in the bresh,,");
	}
}

class Goodpaintbrus<t> {
	
private  t obj;

public t getObj() {
	return obj;
}

public void setObj(t obj) {
	this.obj = obj;
}
	
}

