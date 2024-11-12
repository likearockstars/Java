package entities;

import entities.interfaces.Payable;

// Superclasse abstrata employee

public abstract class Employee  implements Payable{
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	
	// Construtor vazio
	public Employee() {
	}
	
	// Construtor com três argumentos
	public Employee(String firstName, String lastName, String
			socialSecurityNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// Retorna o primeiro nome
	public String getFirstName() {
		return firstName;
	}
	
	// Configura o primeiro nome
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Retorna o sobrenome
	public String getLastName() {
		return lastName;
	}
	
	// Configura o sobrenome
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Retorna o securityNumber
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// Configura o socialSecurityNumber
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// Retorna a representação do String do objeto Employee
	@Override
	public String toString() {
		
		return String.format("%s %s/nSocial security number: %s", getFirstName(),
				getLastName(),getSocialSecurityNumber());
	}
	
	// Nota: não implementamos o método getPaymentAmount aqui, mas esta
	// classe deve ser declarada como abstract para evitar um erro de compilação.

	
}
