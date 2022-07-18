package keywords;

public class Bridge2 {
	public static void main(String[] args) {
		
		
	}

}
class Redcolor implements color{

	@Override
	public void applycolor() {
		System.out.println("red...");
		
		
	}
	
}

class Bulecolor implements color{

	@Override
	public void applycolor() {
	System.out.println("blue");
		
	}
	
}

interface color{
	public void applycolor();
}

abstract class Shap{
	protected color cco;
	
	public Shap(color d) {
		this.cco=d;
		
	}
	
	abstract public void applyColor();
}

class  Pentagon extends Shap{
	public Pentagon(color d) {
		super(d);
	}

	@Override
	public void applyColor() {
		System.out.println("pentageanal cor is applay..");
		
	}
	
}

class triangle extends Shap{
	public triangle(color d) {
		super(d);
	}

	@Override
	public void applyColor() {
		
		
	}
	
}

