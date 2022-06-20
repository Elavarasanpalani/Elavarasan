package utillpac;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class HasmapgcDemo {
	static Logger logger=Logger.getLogger(HasmapgcDemo.class);
	



	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Map<String, String> gg=new WeakHashMap<String, String>();
	//	Map<String,String>  gg=new TreeMap<String, String>();
		
		String key1=new String("a100");
		String key2=new String("a200");	
		
		gg.put(key1, "behind fource");
		gg.put(key2, "anode tech");
		
		logger.info(gg);
		key1=null;
		//key2=null;
		logger.info(gg);
		System.gc();
		logger.info(gg);
		
		
		

	}

}
