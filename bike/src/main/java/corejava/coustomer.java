package corejava;

import java.lang.reflect.Method;

public class coustomer {

	public static void main(String[] args) throws Exception {
		Food fo=new Food();
		
//	veg veg=	fo.getClass().getAnnotation(veg.class);
//		
//		if(veg==null) {
//			System.out.println("it is  nonveg");
//		}
//		else {
//			System.out.println("it is veg....");
//		}
//	
//
//	}
		
		
Method mo=fo.getClass().getMethod("nonveg");

NonVeg veg=mo.getAnnotation(NonVeg.class);
if(veg==null) {
	System.out.println("this is nonveg");
}
else {
	System.out.println("it is veg");
}


}
}
