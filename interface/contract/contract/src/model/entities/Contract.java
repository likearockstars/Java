package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	// Vai ter a lista de parcelas em que meu contrato vai ser parcelado
	private List<Installment> installments = new ArrayList<>();
	
	public Contract(Integer number, LocalDate date, Double totalValue) {
		
		setNumber(number);
		setDate(date);
		setTotalValue(totalValue);
	}
	
	
	public void setNumber(Integer number) {
		
		this.number = (number > 0) ? number : 0;
	}
	
	public Integer getNumber() {
		
		return number;
	}
	
	public LocalDate getDate() {
		
		return date;
	}
	
	public void setDate(LocalDate date) {
		
		this.date = date;
	}
	
	
	public void setTotalValue(Double totalValue) {
		
		this.totalValue = (totalValue > 0.00) ? totalValue : 0.00;
	}
	
	public Double getTotalValue() {
		
		return totalValue;
	}
	
	public List<Installment> getInstallment(){
		
		return installments;
	}
	

}
