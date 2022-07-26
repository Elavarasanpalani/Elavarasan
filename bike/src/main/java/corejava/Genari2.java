package corejava;

public class Genari2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Airs ai=new Airs();
Water wa=new Water();
goodpaintbrus<Airs> er=new goodpaintbrus();

er.setObj(ai);
ai.doAir();
	}

}

class Airs{
	public void doAir() {
		System.out.println("air is in the brus....");
	}
}
class Water{
	public void dowater() {
		System.out.println("water is bresh");
	}
}

class goodpaintbrus <T>{
	 private  T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}