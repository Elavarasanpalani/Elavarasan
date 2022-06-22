package utillpac;

import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

public class Assigement4 {

	public static void main(String[] args) {
//String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		//PropertyConfigurator.configure(log4jConfigFile);
		
		System.out.println("Welcome to Travels.............");
		
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
		
		LocalDateTime l=LocalDateTime.of(year, month, date, hour, minute);
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");
		
		
		String ss=l.format(f);
		
		System.out.println("The Start Time is....."+ss);
		
		System.out.println("Enter Distance in KM...........");
		
		distance=s.nextDouble();
		
		System.out.println("Distance is..........."+distance);
		
		System.out.println("Enter Speed in Hours...........");
		
		speed=s.nextDouble();
		
		System.out.println("Speed in..........."+speed);
		
		double t=distance*60/speed;
		
		int rr=(int) t;
		
		System.out.println("The Total sTravel Times in minutes.........."+t);
		
	
		LocalDateTime el=l.plusMinutes(rr);
		
		long p2 = ChronoUnit.DAYS.between(l, el);
		
		int n=(int) p2+1;
		
		int g=0,j=0;
		
		for(int i=0;i<=n;i++) {
			
			LocalDateTime l7=l.plusDays(g);
			
			g++;
			
			DayOfWeek as=l7.getDayOfWeek();
			
			if(DayOfWeek.SUNDAY.equals(as)) {
				
				n++;
				j++;
				
			}
			
		}
		
		LocalDateTime l5=el.plusDays(j);
		
		String sss=l5.format(f);
		System.out.println("End Time is............."+sss);
		
		s.close();
		
		System.out.println("Ended...............");
		
		
	}

}
