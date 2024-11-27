package model.entities;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CarRental {
	
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	
	public CarRental() {
	}
	
	public CarRental(LocalDateTime start,LocalDateTime finish, Vehicle vehicle) {
		
		this.start = start;
		setFinish(finish);
		this.vehicle = vehicle;
	}
	
	// Data de retirada de um carro que está sendo alugado tem que ser igual a data de agora.
	public void setStart(LocalDateTime start) {
		
			this.start = start;
		}
		
	public LocalDateTime getStart() {
		
		return start;
	}
	
	public void setFinish(LocalDateTime finish) {
		
		
		if(finish.truncatedTo(ChronoUnit.MINUTES).isAfter(getStart())) {
			
			this.finish = finish;
		}
		else {
			throw new IllegalArgumentException("A data para entrega tem que ser depois da data em que o carro foi alugado!");	
		}
	
		
	}
	
	public LocalDateTime getFinish() {
		
		return finish;
	}
	
	public void setVehicle(Vehicle vehicle) {
		
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		
		return vehicle;
	}
	
	public void setInvoice(Invoice invoice) {
		
		this.invoice = invoice;
	}
	
	public Invoice getInvoice() {
		
		return invoice;
	}
	
}
