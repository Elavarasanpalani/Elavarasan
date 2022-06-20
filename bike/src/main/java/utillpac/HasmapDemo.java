package utillpac;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HasmapDemo {
//hasmap is intedusing in jdk1.3
	public static void main(String[] args) {
	  //  HashMap<Integer, String>	hash=new HashMap<Integer, String>();	
		TreeMap<Integer, String>  hash=new TreeMap<Integer, String>(); //it will show assending order of the programming and its shorted in key
		
		

		hash.put(100, "ela");
		hash.put(200, "raj");
		hash.put(300, "idiameen");
		hash.put(500, "dfdf");
		hash.put(400, "ben");
		hash.put(400,"ben" );
		System.out.println(hash);//it will print key,value\
		
		System.out.println();
		
		
		System.out.println(hash.get(500)); // it will get particular 
		
		System.out.println();
		
    Set<Entry<Integer, String>>	 s= hash.entrySet();//we don't have in interato so use entryset
    
    Iterator<
    Entry<Integer, String>> hs=s.iterator();//set have the method is iterator
    
    while(hs.hasNext()) {
    	Entry<Integer, String> me=hs.next();
    	System.out.println(me.getKey()+".."+me.getValue());
    	//System.out.println(hs.next());
    	
    }
    	
    
    
 
		
		
		
		
		

		

	}

}
