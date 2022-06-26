package excersicepro;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class App {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
    	Date now = new Date();
    	
        System.out.printf("Now (jre default): %s\n\n", now);

        if (args.length > 0){
        	String informedTimezone = args[0];
        	try{
        		TimeZone selectedTimeZone = TimeZone.getTimeZone(informedTimezone);
        		sdf.setTimeZone(selectedTimeZone);
        		System.out.printf("***Current time zone at selected time zone: %s \t %s\n\n", selectedTimeZone.getID(), sdf.format(now));
        	}catch(Exception e){
        		System.out.printf("*** Invalid time zone: %s\n\n", informedTimezone);
        	}
        }

        
        System.out.printf("Default time zone: %s\t\n", TimeZone.getDefault().getID());
        sdf.setTimeZone(TimeZone.getDefault());
        System.out.printf("Current time at %s\t%s\n\n", TimeZone.getDefault().getID(), sdf.format(now));
        
        String[] availableIDs = TimeZone.getAvailableIDs();
        Arrays.sort(availableIDs);
        
        System.out.printf("Current time at ...\n");
        for (String timezone : availableIDs) {
            sdf.setTimeZone(TimeZone.getTimeZone(timezone));
            System.out.printf("%s\t%s\n", TimeZone.getTimeZone(timezone).getID(), sdf.format(now));
		}

	}

}
