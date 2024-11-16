package application;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Formatos específicos para datas
		// https://docs.oracle.com/javase/8/docs/api/index.html?java/time/format/DateTimeFormatter.html
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		//DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss SZ");
		
		// Instância a data atual do sistema
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		// Instância uma data por texto que é informado no formato ISO
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// Instânciando datas em formatos customizados
		LocalDate d08 = LocalDate.parse("16/11/2024",dtf1);
		LocalDateTime d09 = LocalDateTime.parse("16/11/2024 10:28:00",dtf2);
		// Instant d10 = Instant.parse("16/11/2024 10:28:00.03.00Z");
		
		// Instânciando datas com dados isolados
		LocalDate d10 = LocalDate.of(2024, 11, 16);
		LocalDateTime d11 = LocalDateTime.of(2024, 11, 16,10,34,00);
		
		// Data
		System.out.println("d01 = " + d01.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d08 = " + d08.format(dtf1));
		System.out.println("d10 = " + d10.toString());
		System.out.println();
		
		// Data e hora
		System.out.println("d02 = " + d02.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d09 = " + d09.format(dtf2));
		System.out.println();
		
		// Data e hora com fuso horário
		System.out.println("d03 = " + d03.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d11 = " + d11.toString());
		// System.out.println("d10 = " + dtf3.format(d10));
		
		
		
		sc.close();
		
	}

}
