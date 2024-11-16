package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
	
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		/*
		 
		// Retorna a coleção dos IDs de zones.
		 
		for(String zone: ZoneId.getAvailableZoneIds()) {
			
			System.out.println(zone);
		}
		
	    */
		
		// Convertendo data hora gobal -> data hora local
		LocalDate d07 =  LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate d08 =  LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime d09 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime d10 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		// Data
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println();
		
		// Data e hora
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println();
		
		// Obter dados de datas isolados
		System.out.println("d04 day = " + d04.getDayOfMonth());
		System.out.println("d04 month = " + d04.getMonthValue());
		System.out.println("d04 year = " + d04.getYear());
		
		System.out.println("d05 hour = " + d05.getHour());
		System.out.println("d05 minutes = " + d05.getMinute());
		
		
		
	}

}
