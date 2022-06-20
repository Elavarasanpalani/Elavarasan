package jproject;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assigenmen1 {

	public static void main(String[] args) {
		Scanner sp=new Scanner(System.in);
		
		System.out.println("speed...km");
		
		long speed=sp.nextLong();
		
		//System.out.println(speed);
		
		System.out.println("distance...");
		
		double dis=sp.nextDouble();
		
		
		double time=dis/speed;
		
		System.out.println(time);
		
		
		Calendar c= Calendar.getInstance();
		c.setTime(new Date());
		System.out.println("year:"+c.get(Calendar.YEAR));
		System.out.println("month:"+c.get(Calendar.MONTH));
		System.out.println("day:"+c.get(Calendar.DATE));
	
		System.out.println("hour:"+c.get(Calendar.HOUR));
		System.out.println("min:"+c.get(Calendar.MINUTE));
		
		int year =sp.nextInt();
		
		
		if(((year %4==0) && (year % 100!=0)) ||(year % 400==0)){
			System.out.println("this not...");

			
		}else {
			System.out.println("this is not leap year.....");
		}
				
		
	}

}
