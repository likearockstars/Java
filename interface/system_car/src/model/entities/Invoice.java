package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	
	public Invoice() {
	}
	
	public Invoice(Double basicPayment, Double tax) {
		
		setBasicPayment(basicPayment);
		setTax(tax);
	}
	
	public void setBasicPayment(Double basicPayment) {
		
		this.basicPayment = (basicPayment > 0.0) ? basicPayment : 0.0;
	}
	
	public Double getBasicPayment() {
		
		return basicPayment;
	}
	
	public void setTax(Double tax) {
		
		this.tax = (tax > 0.0) ? tax : 0.0;
	}
	
	public Double getTax() {
		
		return tax;
	}
	
	public double getTotalPayment() {
		
		return getBasicPayment() + getTax();
		
	}
	
}
