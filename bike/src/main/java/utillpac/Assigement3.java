package utillpac;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.Scanner;

public class Assigement3 {

	//private static final TemporalField DayOfWeek = null;

	public static void main(String[] args) {
		
       int date,month,year,hour,minute;
		
		double distance,speed;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the distance..");
		
		distance=s.nextDouble();
		
		System.out.println("Enter the speed..");
		
		speed=s.nextDouble();
		
		
		double Time=distance*60/speed;
		
      	int fr=(int) Time;
		
		System.out.println("toral min..."+Time);
		
		
		System.out.println("total hour...."+(fr/60));
		
		
		System.out.println("enter the date...");
		
		date=s.nextInt();
		
		System.out.println("Enter the moths..");
		
		month=s.nextInt();
		
		System.out.println("enter year..");
		
		year=s.nextInt();
		
		if(((year %4==0) && (year % 100!=0)) ||(year % 400==0)){
			System.out.println("this IS Leap year..");

			
		}else {
			System.out.println("this is not leap year.....");
		}
		
		System.out.println("Starting Enter hour...");
		
		hour=s.nextInt();
		
		System.out.println(" Starintng Enter min..");
		
		minute=s.nextInt();
		
	//	double Totaltime=Time-hour;
		
		//System.out.println("total timeing for traval...."+Totaltime);
		
		LocalDateTime l=LocalDateTime.of(year, month, date, hour, minute);
	//	LocalDateTime localdate=LocalDateTime.of(date,month,year,hour,minute);
		System.out.println("starting date..."+l);
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");	
		  // DateTimeFormatter formats = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");
				
		String jj=l.format(f);
		
		System.out.println(jj);
		
		LocalDateTime ld=l.plusMinutes(fr);
		
		String chg=ld.format(f);
		
		System.out.println("ending date..."+chg);
		
		
		//System.out.println("date.."+ld);
		
	//	System.out.println(l.compareTo(ld));
		
	
		
		
		
	     
		
		
		
		
		
		
		
			
		

	}

}
