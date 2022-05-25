package staticdemo;

public class PBV_PBR_Demo {

	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.size=10;
		
		System.out.println("Size of laddu before PBV..:"+laddu.size);//10
		new PBV().accept(laddu.size);
		System.out.println("Size of laddu after PBV..:"+laddu.size);//10
		
		
		System.out.println("Size of laddu before PBR..:"+laddu.size);//10
		new PBR().accept(laddu);
		System.out.println("Size of laddu after PBR...:"+laddu.size);//5
	}
	
}
class PBV{
	public void accept(int size) {
		size=size-5;
	}
}
class PBR{
	public void accept(Laddu laddu) {
		laddu.size=laddu.size-5;
	}
}
class Laddu{
	int size;//first creat object
}