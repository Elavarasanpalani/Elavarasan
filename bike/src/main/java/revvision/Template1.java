package revvision;

public class Template1 {
	public static void main(String[] args) {
		
		HousTemplate hous=new WoodenHouse();
		
		hous.buildHous();
		System.out.println("the  woodhouse  is build");
		System.out.println();
		
		HousTemplate house1=new GlassHouse();
		
		house1.buildHous();
		System.out.println("the glass house is build");	
	
	}
}

abstract class HousTemplate{
	 
public final void 	buildHous() { //final method is non changable.... and imposible to inherit and override..
	buildFountation();
	buildWindow();
	buildPillar();
	buildWalls();	
}
private void buildFountation() {
	System.out.println("building foundation with cement,ironroad and sand");
}
private void buildWindow() {
	System.out.println("biilding glass windows");
	
}
public abstract void buildWalls();
public abstract void buildPillar();
}

class GlassHouse extends HousTemplate{

	@Override
	public void buildWalls() {
		System.out.println("build glass wall...");
		
	}

	@Override
	public void buildPillar() {
		System.out.println("biild gglass piller...");
		
	}	
}

class WoodenHouse extends HousTemplate{

	@Override
	public void buildWalls() {
		System.out.println("build wood wall...");
		
	}

	@Override
	public void buildPillar() {
		System.out.println("wood piller.....");
		
	}
	
	
}
	



