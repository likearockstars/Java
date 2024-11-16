package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class Program {
	
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		

		// "Realizando cálculos com datas: lembre-se de que datas são objetos imutáveis, ou seja, 
		//  qualquer alteração requer a criação de um novo objeto."
		
		// Instânciando uma nova data, com uma semana a menos.
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);
		
		// Data
		System.out.println("Past week local date = " + pastWeekLocalDate.toString());
		System.out.println("Next week local date = " + nextWeekLocalDate.toString());
		System.out.println();
		
		// Data e hora 
		System.out.println("Past week local date time = " + pastWeekLocalDateTime.toString());
		System.out.println("Next week local date time = " + nextWeekLocalDateTime.toString());
		System.out.println();
		
		// Data e hora com fuso horário
		System.out.println("Past week instant: " + pastWeekInstant.toString());
		System.out.println("Next week instant: " + nextWeekInstant.toString());
		System.out.println();
		
		// Calculando a duração entre duas datas.
		
		// Data
		
		// atStartOfDay(): Converte para LocalDateTime iniciando o dia às 00:00, permitindo calcular a 
		// duração sem erros!
		Duration t01 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
		System.out.println("t01 dias = " + t01.toDays());
		
		// Data e hora 
		Duration t02 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t02 dias = " + t02.toDays());
		
		// Data e hora com fuso horário
		Duration t03 = Duration.between(pastWeekInstant, nextWeekInstant);
		System.out.println("t03 dias = " + t03.toDays());
	}
	
	

}
