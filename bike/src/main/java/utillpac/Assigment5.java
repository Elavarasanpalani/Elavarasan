package utillpac;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assigment5 {

	public static void main(String[] args) {
		
		

		int date,month,year,hour,minute;//,shour,sminute,ehour,eminute;
		
		double distance,speed;
		
		Scanner s=new Scanner(System.in);
		
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
		
		//LocalDateTime l=LocalDateTime.of(year, month, date, hour, minute);
		
		
	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");
		
		
		//String ss=l.format(f);
		
		
		
		
		//System.out.println("The Start Time is....."+ss);
	
	//	 Date dateOne = ss.getTime();
		Calendar c1 = Calendar.getInstance();
		c1.set(hour, minute,date,month,year);
		
		Date da=c1.getTime();
		System.out.println("gettime.."+da);
		
		da.setTime(12000);
		
		System.out.println("after setting time"+da);
		
		
		
	}

}
