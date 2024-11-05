package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, LocalDate date) {
		
		super(name,price);
		this.date  = date;
	}
	
	public void setDate(LocalDate date) {
		
		this.date = date;
	}
	
	public LocalDate getDate() {
		
		return date;
	}
	
	@Override
	public String priceTag() {
		
		return super.getName() + " (used) $ " +
		String.format("%.2f",super.getPrice()) + 
		" (Manufacture date: " +
		date.format(dtf) + ")";
	}
	

}
