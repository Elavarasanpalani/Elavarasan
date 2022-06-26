package utillpac;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
	int date,month,year,hour,minute;//,shour,sminute,ehour,eminute;
		System.out.println("Enter Date....................");
		
		date=s.nextInt();
		
		System.out.println("Enter Month....................");
		
		month=s.nextInt();
		
		System.out.println("Enter Year....................");
		
		year=s.nextInt();
		
		System.out.println("Enter Time....................");
		
		hour=s.nextInt();
		
		System.out.println("Enter Minutes....................");
		
		minute=s.nextInt();
		
		  LocalDateTime a = LocalDateTime.of(year, month, date, hour, minute); 
		  
		  DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");
			
			
			String ss=a.format(f);
			System.out.println(ss);
	
	}

}
