package utillpac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocaltimedateDemo {

	public static void main(String[] args) {
		 DateTimeFormatter formatter
         = DateTimeFormatter.ofPattern(
             "yyyy-MM-dd HH:mm:ss a");
		 
		 LocalDateTime now = LocalDateTime.now();
		 
		 String dateTimeString = now.format(formatter);
		 
		 System.out.println(dateTimeString);
		 
		 
		
		
		
		

	}

}
