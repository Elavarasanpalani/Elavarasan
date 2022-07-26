package corejava;

import java.lang.reflect.Method;

public class cousm {

	public static void main(String[] args)throws Exception {
		
		Car car=new Car();
//		
//		Method mo=car.getClass().getMethod("best");
//		
//		bmw bm=mo.getAnnotation(bmw.class);
//		if(bm==null) {
//			System.out.println("this is bm");
//		}
//		else {
//			System.out.println("this not bmw");
//		}
//
//	}
		
	bmw bm=	car.getClass().getAnnotation(bmw.class);
	
	if(bm==null) {
		System.out.println("this is bm");
	}else {
		System.out.println("this is not bmw");
	}

}
}
	