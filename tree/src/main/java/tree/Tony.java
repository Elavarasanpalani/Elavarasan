package tree;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Tony {
	static Logger logger=Logger.getLogger(Tony.class);

	public static void main(String[] args) {
		String str="Welcome";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("this is a dasdmessage....:"+str);
		logger.warn("warning mesdasdasage...:"+str);
		logger.error("error medscadsssage....:"+str);

	}

}
