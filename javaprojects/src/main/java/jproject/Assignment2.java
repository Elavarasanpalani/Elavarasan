package jproject;

import java.util.Calendar;

public class Assignment2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
	      System.out.println(calendar.getTime().toString());
	      int day = calendar.get(Calendar.DAY_OF_WEEK);
	      System.out.println("Day: " + day);
	      int hour = calendar.get(Calendar.HOUR_OF_DAY);
	      System.out.println("Hour: " + hour);
	      int minute = calendar.get(Calendar.MINUTE);
	      System.out.println("Minute: " + minute);
	}

}
