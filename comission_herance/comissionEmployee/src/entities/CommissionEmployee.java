package entities;

// Classe CommissionEmployee representa um funcionário que recebe
// uma comissão baseada em uma porcentagem das vendas brutas

public class CommissionEmployee extends Object {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Double grossSales; // vendas brutas semanais
	private Double commissionRate; // porcentagem da comissão
	
	// Construtor de cinco argumentos
	public CommissionEmployee(
		String firstName, 
		String lastName, 
		String socialSecurityNumber,
		Double grossSales,
		Double commissionRate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		setGrossSales(grossSales); // valida e armazena as vendas brutas
		setCommissionRate(commissionRate); // valida e armazena a taxa de comissão
	}
	
	// Define o nome
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Retorna o nome
	public String getFirstName() {
		return firstName;
	}

	// Define o sobrenome
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Retorna o sobrenome
	public String getLastName() {
		return lastName;
	}
	
	// Define o número de segurança social
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// Retorna o número de segurança social
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// Define o valor das vendas brutas
	public void setGrossSales(double grossSales) {
		this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
	}
	
	// Retorna o valor das vendas brutas
	public Double getGrossSales() {
		return grossSales;
	}
	
	// Define a taxa de comissão
	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = (commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
	}
	
	// Retorna a taxa de comissão
	public Double getCommissionRate() {
		return commissionRate;
	}
	
	// Calcula os rendimentos
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	@Override
	// "Retorna a representação em string do objeto CommissionEmployee."
	public String toString() {
		
		return String.format("%s: %s %s \n%s: %s\n%s: %.2f\n%s: %.2f",
		"comission employee",getFirstName(), getLastName(),
		"social security number",getSocialSecurityNumber(),
		"gross sales",getGrossSales(),
		"comission rate",getCommissionRate());
	}
}
