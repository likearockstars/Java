package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		
		super(name,anualIncome);
		setHealthExpenditures(healthExpenditures);
	}
	
	public void setHealthExpenditures(Double healthExpenditures) {
		
		this.healthExpenditures = (healthExpenditures > 0.0) ? healthExpenditures : 0.0;
	}
	
	public Double getHealthExpenditures() {
		
		return healthExpenditures;
	}
	
	@Override
	public Double tax() {
		
		double tax = 0.0;
		
		tax = (getAnualIncome() <  20000.00) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
		
		tax -= (getHealthExpenditures() > 0.0) ? healthExpenditures * 0.5 : 0.0;
		
		return tax;

	}
}
