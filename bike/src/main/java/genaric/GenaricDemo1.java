package genaric;

public class GenaricDemo1 {

	public static void main(String[] args) {
		//BadpaintBrush dd=new BadpaintBrush();
		//dd.dopaint(2);
	//	GoodpaintBrushver1 ff=new GoodpaintBrushver1();
		//ff.dopaint();
		Water water=new Water();
		Air driyer=new Air();
		
		//GoodpaintBrushver2 ss=new GoodpaintBrushver2();
		
		GoodPaintBrushver3<Water> oo=new GoodPaintBrushver3<>();
		oo.setObj(water);
		//oo.setObj(water);//object will be set on the process
		
		//water=(Water)oo.getObj();//it will get on the objects//casting the object
		water.sprinkle();
		
	}

}
class BadpaintBrush{
	public void dopaint(int i) {
		if(i==1) {
			System.out.println("red paint....");
		}
		else if(i==2){
			System.out.println("blue  paint...");
			
		}
		
	}
	
}
//Convert the condition to class
//Grupe the under hierarchy
//Create a associate between using class and hierrrchy class..
class GoodpaintBrush{
	
}
abstract class Paint{}
class Redpaint extends Paint{}
class Bluepaint extends Paint{}
class GoodpaintBrushver1{
	Paint paint;
	public void dopaint() {
		System.out.println(paint);
	}
	
}
class Water{
	public void sprinkle() {
		System.out.println("water is sprinked..");
	}
}
class Air{
	public void driyer() {
		System.out.println("air is driyer..");
	}
}
class GoodpaintBrushver2{
	private Object obj;
	public Object getObj() {
		return this.obj;
		
	}
	public void setObj(Object obj) {
		 this.obj=obj;
		
	}
}
class GoodPaintBrushver3<T>{//T is type it will give to the object on this type..of T..
	private T obj;
	
	public T getObj() {
		return this.obj;
		
	}
	public void setObj() {
		// TODO Auto-generated method stub
		
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}


