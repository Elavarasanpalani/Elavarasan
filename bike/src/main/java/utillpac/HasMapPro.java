package utillpac;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HasMapPro {
//it not working in gendric because is old model
	public static void main(String[] args) {
		Properties pro=new Properties();
		
		pro.put("a200", "ela");
		pro.put("v373","tamil");
		pro.put("c300", "num");
		pro.put("c400", "dfdf");
		
		System.out.println(pro);
		
		System.out.println();
		
		System.out.println(pro.get("v373"));
		
         Set dd=	pro.entrySet();//because cont gendric
    
         Iterator item=dd.iterator();
         
         while(item.hasNext()) {
        	System.out.println(item.next());
        	 
         }
   


   
   

		
		


	}

}
