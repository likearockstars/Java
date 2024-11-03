package entities;

// A classe BasePlusCommissionEmployee representa um empregado que
// recebe um sálario-base além da comissão

public class BasePlusCommissionEmployee extends CommissionEmployee {
		
	private Double baseSalary;
	
	public BasePlusCommissionEmployee() {
		// chama o construtor da superclasse
		super();
	}
	
	public BasePlusCommissionEmployee(
			String firstName,
			String lastName,
			String socialSecurityNumber,
			Double grossSales,
			Double commissionRate,
			Double baseSalary) {
		
			super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
			
			setBaseSalary(baseSalary); // valida e armazena o sálario-base
		
	}
	
	// Configura o salário-base
	public void setBaseSalary(Double baseSalary) {
		
		this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
	}
	
	// retorna o salário-base
	public Double getBaseSalary() {
		
		return baseSalary;
	}
	
	@Override
	public double earnings() {
		
		return baseSalary + super.earnings();
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("base-salaried comission employee: " + super.getFirstName() + "\n");
		sb.append("social security number: " + super.getSocialSecurityNumber() + "\n");
		sb.append("gross sales: " + String.format("%.2f\n", super.getGrossSales()));
		sb.append("commision rate: " + String.format("%.2f\n",super.getCommissionRate()));
		sb.append("base salary: " + String.format("%.2f",getBaseSalary()));
		
		return sb.toString();
	}
	
	
	
}
