package corejava;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ref2 {

	public static void main(String[] args) throws Exception {
		policess po=new policess();
		poll pol=new poll();
		
		po.arrest(pol);
		
	}

}

class policess{
	public void arrest(Object obj) throws Exception {
		Class c=obj.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(obj));
		Method mo=c.getMethod("services");
		mo.invoke(obj);
		Dgb(obj);
		
	
		
	}
	
	public void Dgb(Object obj)throws Exception{
		Class c=obj.getClass();
		Field f=c.getDeclaredField("secrte");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
	}
}



class poll{
	
	public String name="i ama good man";
	private String  secrte="i ama don";
	
	public void services() {
		System.out.println("heal to other.....");
	}
	
	private void secreate() {
		System.out.println("thief to others.");
	}
	
}
