package utillpac;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assigement3 {

	public static void main(String[] args) {
		
       int date,month,year,hour,minute;
		
		double distance,speed;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the distance..");
		
		distance=s.nextDouble();
		
		System.out.println("Enter the speed..");
		
		speed=s.nextDouble();
		
		
		double Time=distance/speed;
		
		System.out.println(Time);
		
		
		System.out.println("enter the date...");
		
		date=s.nextInt();
		
		System.out.println("Enter the moths..");
		
		month=s.nextInt();
		
		System.out.println("enter year..");
		
		year=s.nextInt();
		
		if(((year %4==0) && (year % 100!=0)) ||(year % 400==0)){
			System.out.println("this not...");

			
		}else {
			System.out.println("this is not leap year.....");
		}
		
		System.out.println("Starting Enter hour...");
		
		hour=s.nextInt();
		
		System.out.println(" Starintng Enter min..");
		
		minute=s.nextInt();
		
		double Totaltime=Time-hour;
		
		System.out.println(Totaltime);
		
		LocalDateTime l=LocalDateTime.of(year, month, date, hour, minute);
		System.out.println("starting date..."+l);
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");	
				
		String jj=l.format(f);
		
		System.out.println(jj);
		
		
		
		
		
		
		
			
		

	}

}
