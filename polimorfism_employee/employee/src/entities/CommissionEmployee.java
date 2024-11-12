package entities;

public class CommissionEmployee extends Employee {
	
	private Double grossSales; // Vendas brutas semanais
	private Double commissionRate; // Percentual da comissão
	
	// Construtor padrão
	public CommissionEmployee() {
		super();
	}
	
	// Construtor com cinco argumentos
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
	Double grossSales, Double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);
		setCommissionRate(commissionRate);
		setGrossSales(grossSales);
	}
	
	// Configura a taxa de comissão
	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = (commissionRate < 0.0) ? 0.0 : commissionRate;
	}
	
	// Retorna a taxa de comissão
	public Double getCommissionRate() {
		return commissionRate;
	}
	
	// Configura o valor das vendas brutas
	public void setGrossSales(Double grossSales) {
		this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
	}
	
	// Retorna o valor das vendas brutas
	public Double getGrossSales() {
		return grossSales;
	}
	
	// Calcula os rendimentos; sobrescreve o método earnings em Employee
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * grossSales;
	}
	
	// Retorna a representação em String do objeto CommissionEmployee
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
		"Commission employee", super.toString(),
		"gross sales", getGrossSales(), "commission rate", getCommissionRate());
	}
}
