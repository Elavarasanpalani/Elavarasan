package staticdemo;

public class InheritanceDemo5 {

	public static void main(String[] args) {
		IndianPlug indianplug=new SakthiPlug();
		//indianplug.roundpin();
		IndianSocket indiansocket=new SakthiSocket();
		//indiansocket.roundpinhole(indianplug);
		
		AmericanPlug lenova=new LenovaPlugs();
		//lenova.slabpin();
		
		AmericanSocker socker=new LenovaSocker();
		//socker.slabpinholes(socker);
		
		IndianAdapter adapter=new IndianAdapter(lenova);
		indiansocket.roundpinhole(adapter);
		
		
		
		
		
	}

}	
abstract class IndianPlug{
	public abstract void roundpin() ;
		
	
	
}
abstract class IndianSocket{
	public abstract void  roundpinhole(IndianPlug ip);//beacause accept indianplug
	
}

abstract class AmericanPlug{
	public abstract void slabpin();
	
}
abstract class AmericanSocker{
	public abstract void slabpinholes(AmericanSocker ss);
}
class SakthiPlug extends IndianPlug{
	@Override
	public void roundpin() {
		System.out.println("Sakthi plug is working...");
		
	}
	
}
class SakthiSocket extends IndianSocket{
	@Override
	public void roundpinhole(IndianPlug ip) {
		System.out.println("sakthiscoket is working....");
		
	}
	
}
class LenovaPlugs extends AmericanPlug{

	@Override
	public void slabpin() {
		System.out.println("lenovaplugs is working....");
		
	}
	
}
class LenovaSocker extends AmericanSocker{
	@Override
	public void slabpinholes(AmericanSocker ps) {
	System.out.println("lenovasocker is working ...");
		
	}
	
}
class IndianAdapter extends IndianPlug{
	AmericanPlug ps;
	public IndianAdapter() {//contretor is use tor part of the function 
		//indianadapter is part of americanplug so we are use in constructor
		
	}
	public IndianAdapter(AmericanPlug ps){
		this.ps=ps;
		
	}
	@Override
	public void roundpin() {
		ps.slabpin();
	
		
	}
	
}