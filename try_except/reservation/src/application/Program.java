package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.entities.Reservation;

public class Program {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Integer room = 1020;
		LocalDate checkIn = LocalDate.parse("23/09/2019",dtf);
		LocalDate checkOut = LocalDate.parse("26/09/2019",dtf);
		Reservation reservation = new Reservation(room,checkIn,checkOut);
		
		System.out.println(reservation.duration());
		
		System.out.println();
	}

}
