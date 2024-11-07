package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;	
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anualIncome) {
		
		this.name = name;
		setAnualIncome(anualIncome);
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAnualIncome(Double anualIncome) {
		
		this.anualIncome = (anualIncome > 0.0) ? anualIncome : 0.0;
		
	}
	
	public Double getAnualIncome() {
		
		return anualIncome;
	}
	
	public String toString() {
		
		return getName() + " $ " + String.format("%.2f",tax());
	}
	
	public abstract Double tax();
	
	
}
