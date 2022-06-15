package genaric;

import java.lang.reflect.Method;

public class Customer {
	public static void main(String[] args) throws Exception{
		Food food=new Food(); //i want to know this food veg or non veg
//		
//	    veg veg=food.getClass().getAnnotation(veg.class);
//	    if(veg==null) {
//	    	System.out.println("this is  non veh..");
//	    	
//	    }else {
//	    	System.out.println("it is veg");
//	    }
		
		Method m=food.getClass().getMethod("rice");
	   Nonveg veg=	m.getAnnotation(Nonveg.class);
	   if(veg==null) {
		   System.out.println("this is non veg...");
	   }else {
		   System.out.println("this is veg...");
	   }
	    
		
	}

}
