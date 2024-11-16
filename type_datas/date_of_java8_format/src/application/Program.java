package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	
	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/index.html?java/time/format/DateTimeFormatter.html
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
				.withZone(ZoneId.systemDefault());
		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_INSTANT;
	
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// Data
		System.out.println("d04 = " + d04.format(dtf1));
		System.out.println("d04 = " + dtf1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		
		// Data e hora
		System.out.println("d05 = " + d05.format(dtf2));
		
		
		// Data e hora com fuso horário
		System.out.println("d06 = " + dtf3.format(d06));
		System.out.println("d07 = " + dtf4.format(d07));
	}

}
