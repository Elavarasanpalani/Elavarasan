package utillpac;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {

	//	String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		//PropertyConfigurator.configure(log4jConfigFile);
		
		System.out.println("Welcome to Sundara Travels.............");
		
		int date,month,year,hour,minute,shour,sminute,ehour,eminute;
		
		double distance,speed;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Date....................");
		
		date=s.nextInt();
		
		System.out.println("Enter Month....................");
		
		month=s.nextInt();
		
		System.out.println("Enter Year....................");
		
		year=s.nextInt();
		
		LocalDate dfg=LocalDate.of(year, month, date);
		
		DayOfWeek sfg=dfg.getDayOfWeek();
		
		if(DayOfWeek.SUNDAY.equals(sfg)) {
			
			System.out.println("It is Sunday..................");
			
		}
		
		else {
		
			System.out.println("Enter Hour....................");
		
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
		
		System.out.println("The Total Travel Time in minutes.........."+t);
		
		System.out.println("Enter start Hour....................");
		
		shour=s.nextInt();
		
		System.out.println("Enter start Minutes....................");
		
		sminute=s.nextInt();
		
		LocalTime sti=LocalTime.of(hour, minute);
		
		LocalTime sts=LocalTime.of(shour, sminute);
		
		if(sti.getHour()<sts.getHour() || ((sti.getHour()==sts.getHour()) && (sti.getMinute()<sts.getMinute()))) {
			
			System.out.println("It is Wrong Timing sense................");
			
		}
		
		else {
		
			System.out.println("Enter end Hour....................");
		
		ehour=s.nextInt();
		System.out.println("Enter end Minutes....................");
		
		eminute=s.nextInt();
		
		LocalTime ste=LocalTime.of(ehour, eminute);
		
		if(sti.getHour()>ste.getHour() || ((sti.getHour()==ste.getHour()) && (sti.getMinute()>ste.getMinute()))) {
			
			System.out.println("It is Wrong Timing sense................");
			
		}
		
		else {
		
		LocalTime startl=LocalTime.now().withHour(shour).withMinute(sminute);
		
		LocalTime endl=LocalTime.now().withHour(ehour).withMinute(eminute);
		long sd=ChronoUnit.MINUTES.between(startl, endl);
		double ssd=t/sd;
		
		double ssde=t%sd;
		
		int g=0;
		
		for(int i=0;i<ssd-1;i++) {
			
			LocalDateTime l7=l.plusDays(g);
			
			g++;
			
			DayOfWeek as=l7.getDayOfWeek();
			
			if(DayOfWeek.SUNDAY.equals(as)) {
				
				ssd++;
				
			}
			
		}
		
		LocalDateTime l5=l.plusDays(g).withHour(shour).withMinute(sminute).plusMinutes((long) ssde);
		
		LocalDateTime lf=l5.plusMinutes((long) ssde);
		
		String sss=lf.format(f);
		System.out.println("End Time is............."+sss);
		
		s.close();
		
		System.out.println("Ended...............");
		
		}
		
		}
		
		}
		
		

	}

}
