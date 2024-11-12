package entities;

// Classe BasePlusCommissionEmployee que estende a commissionEmployee

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private Double baseSalary; // salário de base por semana
	
	// Construtor default
	public BasePlusCommissionEmployee() {
		super();
	}
	
	// Construtor com seis argumentos
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecuriytNumber,
	Double grossSales, Double commissioRate, Double baseSalary) {
		
		super(firstName,lastName,socialSecuriytNumber,grossSales,commissioRate);
		setBaseSalary(baseSalary);
	}
	
	// Configura o salário base
	public void setBaseSalary(Double baseSalary) {
		
		this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
	}
	
	// Retorna o salário base
	public Double getBaseSalary() {
		
		return baseSalary;
	}
	
	// calcula os vencimentos: sobrescreve o método earnigs em CommissionEmployee
	@Override
	public double getPaymentAmount() {
		
		return getBaseSalary() + super.getCommissionRate() * super.getGrossSales();
	}
	
	// Retorna a representacao do objeto BasePlusCommissionEmployee
	@Override
	public String toString() {
		
		return String.format("%s %s; %s: $%,.2f","base-salaried",super.toString(),"base salary",getBaseSalary());
	}

}
