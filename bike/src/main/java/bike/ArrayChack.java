package bike;



import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class ArrayChack {
	static Logger logger=Logger.getLogger(ArrayChack.class);

	
	
public static void main(String[] args) {
	String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
	PropertyConfigurator.configure(log4jConfigFile);
	
	
	Scanner n = new Scanner(System.in);
	
	System.out.println("the vlau of vowle");
	String ch=n.nextLine();
	
	
	String[] a1 = {"a","o","i","e","u"};
/*	String a2="e";
	String a3="i";
	String a4="o";
	String a5="u"; */
	
	
	if(ch==a1[0] || ch==a1[1] || ch==a1[2] || ch ==a1[3] || ch==a1[4]) {
		
		logger.info(ch+" this is vowel");
		
	}
	else {
		logger.info( ch+"  This is not vowel");
}
}
}
