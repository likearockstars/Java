package entities;

// Vai herdar membros da class (Account)
public class SavingsAccount  extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		
			super(number,holder,balance);
			setInterestRate(interestRate);;
			
	}
	
	// Configure of attribute interest rate
	public  void setInterestRate(Double interestRate) {
		
		this.interestRate = (interestRate > 0.0) ? interestRate : 0.0; // Check interest rate
	}
	
	// Obter a variável de instância interest rate
	public Double getInterestRate() {
		
		return interestRate;
	}
	
	// Atualiza o saldo com a taxa de juro
	public void updateBalance() {
		
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		
		balance -= amount;
	}
	
}
