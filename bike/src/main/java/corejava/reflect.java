package corejava;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import chapter6.Mathod;

public class reflect {

	public static void main(String[] args) throws Exception{
		police po=new police();
		
		politician pol=new politician();
		po.invest(pol);
		
	}

}


class police {
	public void invest(Object obj) throws Exception  {
		Class c=obj.getClass();
		try {
			Field f=c.getField("name");
			System.out.println(f.get(obj));
			
			Method mo=c.getMethod("servies");
			mo.invoke(obj);
			dgb(obj);
			
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void dgb(Object obj) throws Exception {
		Class c=obj.getClass();
		
		Field f=c.getDeclaredField("secreat");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
		Method mo=c.getDeclaredMethod("secreatservices");
		mo.setAccessible(true);
		mo.invoke(obj);
		
	}
	
	
}

class politician{
	public String name="i ama a goodman";
	private String secreat="i am a bad man";
	
	public void servies() {
		System.out.println("help to others....");
	}
	
	
	private  void  secreatservices() {
		System.out.println("thif to others....");
	}
}