package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private LocalDate dueDate;
	private Double amount;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment(LocalDate date, Double amount) {
		
		setDate(date);
		setAmount(amount);
		
	}
	
	
	public void setDate(LocalDate dueDate) {
		
		this.dueDate = dueDate;
	}
	
	
	public LocalDate getDueDate() {
		
		return dueDate;
	}
	
	
	public void setAmount(Double amount) {
		
		this.amount = (amount > 0.00 ) ? amount : 0.00;
	}
	
	
	public Double getAmount() {
		
		return amount;
	}
	
	@Override
	public String toString() {
		
		return dtf.format(dueDate) + " - " + getAmount();
	}
	
	
}
