package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		// Formato de data corresponde ao Brazil
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Pegando um número inteiro válido (número do quarto)
		Integer numberRoom = getNumber("Number room: ",sc);
		
		System.out.print("Check-in: ");
		LocalDate checkIn = LocalDate.parse(sc.next(),dtf);
		
		System.out.print("Check-out: ");
		LocalDate checkOut = LocalDate.parse(sc.next(),dtf);
		
		
		Reservation reservation = new Reservation(numberRoom, checkIn, checkOut);
		
		System.out.println(reservation.toString());
		
		
		
		sc.close();
		
	
	}
	
	// Método que garante um número (Integer) para o usuário (wrapper class)
	public static Integer getNumber(String msg, Scanner sc) {
		
	    // Loop infinito que irá garantir um número inteiro
	    while(true) {
	    	
	        try {
	            // Prompt informado ao método
	            System.out.print(msg);
	            
	            // IO do usuário
	            Integer number = sc.nextInt();
	            
	            // Limpando \n do buffer
	            sc.nextLine();
	            
	            // Verifica se o número é positivo, por exemplo
	            if (number <= 0) {
	                System.out.println("Please enter a positive integer.");
	            } else {
	                // Retornando o número válido e encerrando o loop
	                return number;
	            }
	            
	        } catch (InputMismatchException e) {
	            System.out.println("Try again, enter an integer number!");
	            sc.nextLine(); // Limpa o buffer em caso de erro
	        }
	    }
	}


}
