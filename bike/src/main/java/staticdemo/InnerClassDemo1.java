package staticdemo;

public class InnerClassDemo1 {
	public static void main(String[] args) {
		Pepsi  pepsiCo=new Pepsi();
	//	Kalimark kali=new Kalimark();
		
		
		pepsiCo.sellcola();
		//kali.sellcola();
		
		
	}

}

	

class Pepsi{
	public void sellcola() {
		Kalimark cc=new Kalimark();
		cc.sellcola();
		
		
		
		
		
	}
	
}
class Kalimark{	
	public void sellcola() {
		CampaCola cc=new CampaCola();
		cc.makecola();
		
		System.out.println("kalimarkfill bovonto for sell");
		
		
	}
	class CampaCola{
		public void makecola() {
			Slice dd=new Slice();
			dd.dring();
			System.out.println("CompaCola make cola");
		}
	}
	class Slice{
		public void dring() {
			System.out.println("this is sweet dring");
		}
	}
}
			
		
		
	

