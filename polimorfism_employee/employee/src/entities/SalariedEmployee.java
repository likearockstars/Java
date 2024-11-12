package entities;

// A classe concreta SalariedEmployee estende a classe Employee abstrata.
public class SalariedEmployee extends Employee {
	
	private Double weeklySalary;
	
	
	// Construtor vazio
	public SalariedEmployee() {
		super();
	}
	
	// Construtor com quatro argumentos
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
	Double weeklySalary) {
		
		super(firstName,lastName,socialSecurityNumber);
		setWeeklySalary(weeklySalary);
	}
	
	// Configura o salário
	public void setWeeklySalary(Double weeklySalary) {
		
		this.weeklySalary = (weeklySalary < 0.0) ? 0.0 : weeklySalary;
	}
	
	// Retorna o sálario
	public Double getWeeklySalary() {
		
		return weeklySalary;
	}
	

	// Retorna a representação String do objeto SalariedEmployee
	@Override
	public String toString() {
		
		return String.format("Salaried employee: %s\n%s: $%.2f",super.toString(),"weekly salary",
				getWeeklySalary());
	}

	@Override
	public double getPaymentAmount() {
		
		return getWeeklySalary();
	}

	
}
