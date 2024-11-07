package entities;

public class Company  extends TaxPayer{

	private Integer numberOfEmployee;
	
	public Company() {
	}
	
	public Company(String name, Double anualIncome,Integer numberOfEmployee) {
		
		super(name,anualIncome);
		setNumberOfEmployee(numberOfEmployee);
	}
	
	public void setNumberOfEmployee(Integer numberOfEmployee) {
		
		this.numberOfEmployee = (numberOfEmployee < 0) ? 0 : numberOfEmployee;
	}
	
	public Integer getNumberOfEmployee() {
		
		return numberOfEmployee;
	}
	
	@Override
	public Double tax() {
		
		double tax = 0.0;
		
		tax = (getNumberOfEmployee() > 10) ? getAnualIncome() * 0.14: getAnualIncome() * 0.16;
		
		return tax;
	}
}
