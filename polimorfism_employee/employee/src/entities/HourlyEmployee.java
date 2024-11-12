package entities;

public class HourlyEmployee extends Employee {
	
	private Double wage; // Salário por hora
	private Integer hours; // Horas Trabalhadas durante a semana
	
	private static final int hoursToWork = 40;
	
	// Construtor vazio
	public HourlyEmployee() {
		super();
	}
	
	// Construtor com cinco argumentos
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Double wage,Integer hours) {
	
		super(firstName,lastName,socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}
	

	
	// Configura a remuneração
	public void setWage(double wage) {
		
		this.wage = (wage > 0.0) ? wage : 0.0;
	}
	
	// Retorna a remuneração
	public Double getWage() {
		
		return wage;
	}
	
	// Configura as horas trabalhadas
	public void setHours(Integer hours) {
		
		this.hours = (hours > 0.0 && hours < 168) ? hours : 0;
	}
	
	// Retorna as horas trabalhadas
	public Integer getHours() {
		
		return hours;
	}
	
	// Calcula os rendimentos: sobrescreve o método earnings em Employee
	@Override
	
	public double getPaymentAmount() {
		
		if(getHours() <= 40) {
			return getWage() * getHours();
		}else {
			
			return (getWage() * hoursToWork) + (getHours() - hoursToWork) * getWage() * 1.5;
		}
	}
	
	// Retorna a representação de String do objeto em HourlyEmployee
	@Override
	public String toString() {
		
		return String.format("hourly employee: %s\n%s: $%.2f: %s: %d", super.toString(),
				"hourly wage",getWage(),"hours worked",getHours());
	}
}


