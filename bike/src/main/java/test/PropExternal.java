package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropExternal {
	 public static void main(String args[]) throws Exception {
	      Properties prop = readPropertiesFile("config.properties");
	      System.out.println("name: "+ prop.getProperty("name"));
	
	   }
	   public static Properties readPropertiesFile(String fileName) throws Exception {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException e) {
	         e.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }

}
