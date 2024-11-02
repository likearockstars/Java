package entities;

// Extends garante que essa subclasse herde os membros da superclasse
public class BussinessAccount extends Account {
	
	private Double loanLimit;
	
	// "Utilizamos super para inicializar os membros herdados da superclasse, além dos membros adicionados nesta subclasse."
	public BussinessAccount() {
		
		super();
	}
	
	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		
		// Utilizamos 'super' para inicializar os membros herdados da superclasse , mas , garantindo que o usuário
		// forneça valores no momento da instanciação do objeto.
		
		super(number,holder,balance);
		this.loanLimit = loanLimit;
		
	}
	
	public Double getLoanLimit() {
		
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		
		// variavel = (condicao) ? valor_se_verdadeiro : valor_se_falso;
		
		balance += (amount <= loanLimit) ?  amount : 0.0;
	}
}
