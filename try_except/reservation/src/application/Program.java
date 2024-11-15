package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Reservation;
import model.exceptions.DomainException;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		// Formato de data corresponde ao Brazil
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Pegando um número inteiro válido (número do quarto)
		Integer numberRoom = getNumber("Number room: ",sc);
		
		//
		try {
			System.out.print("Check-in (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(),dtf);
			
			System.out.print("Check-out (dd/MM/yyyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(),dtf);
			
			
			Reservation reservation = new Reservation(numberRoom, checkIn, checkOut);
			
			System.out.println(reservation.toString());
			
			System.out.println();
			
			// Update data
			System.out.println("Enter data to update the reservation:");
			
			System.out.print("Check-in (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(),dtf);
			
			System.out.print("Check-out (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(),dtf);
			
			// Method to update data
			reservation.updateDate(checkIn, checkOut);
			System.out.println(reservation.toString());
			
		// Exception to (LocalDate.parse)
		}catch(DateTimeParseException e) {
			
			 	System.out.println("Invalid date format. Please enter the date in the format dd/MM/yyyy.");
			 	System.out.println("Error details " + e.getMessage());
	    // Tratando a exceção personalizada
		}catch(DomainException e) {
			
			// Estamos capturando a mensagem que passamos ao instanciar a exceção (DomainException)
			System.out.println("Error in reservation: " + e.getMessage());
			
		}
		
			 	
		// Exception to (check-in or check-out)
		/*
		 	}catch(IllegalArgumentException e) {
			
			System.out.println("Error in reservation: " + e.getMessage());
			}
	
		 */
		
		
		
		sc.close();
		
	
	}
	
	// Método que garante um número (Integer) para o usuário 
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
