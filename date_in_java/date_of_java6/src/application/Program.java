package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class Program {
	
	public static void main(String[] args) {
		
		// Formats
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		// Date of now 
		Date dateNow1 = new Date();
		Date dateNow2 = new Date(System.currentTimeMillis());
		Date dateOld1 = new Date(0L);
		Date dateOld2 = new Date(1000L * 60 * 60L * 5L);
		
		// Format ISO
		
		Date d03 = Date.from(Instant.parse("2024-11-16T12:20:00-03:00"));
		
		try {
			
			// Instance of date per text
			Date d01  = sdf1.parse("16/11/2024");
			Date d02  = sdf2.parse("16/11/2024 12:11:00");
			
			System.out.println("d01 = " +  d01.toString());
			System.out.println("d02 = " + d02.toString());
			System.out.println("d03 = " + d03.toString());
			
			System.out.println();
			
			System.out.println("d01 = " + sdf1.format(d01));
			System.out.println("d02 = " + sdf2.format(d02));
			System.out.println("d03 = " + sdf3.format(d03));
			
			System.out.println();
			System.out.println("Date now1 = " + dateNow1.toString());
			System.out.println("Date now2 = " + dateNow2.toString());
			System.out.println("Date old1 = " + dateOld1);
			System.out.println("Date old2 = " + dateOld2);
			
		}catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
