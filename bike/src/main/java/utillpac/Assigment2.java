package utillpac;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assigment2 {
	public long daysBetween(Date one,Date two) {
		long different=(one.getTime()-two.getTime()/86400000);
		return Math.abs(different);
	}

	public static void main(String[] args) {
		 Date date=new Date();
			Calendar mycal=Calendar.getInstance();
			mycal.set(2022, 01, 26);
			System.out.println("it is holiday..."+mycal);
			Date da=mycal.getTime();
			System.out.println(da);
			
			Assigment2 myobj=new Assigment2();
			long days=myobj.daysBetween(date, da);
			
			SimpleDateFormat sd=new SimpleDateFormat("mm,dd,yyyy");
			String todaydate=sd.format(date);
			String todaydate1=sd.format(da);
			
			System.out.println(days+"days frodfm today "+todaydate+".."+todaydate1	);

	}

}
