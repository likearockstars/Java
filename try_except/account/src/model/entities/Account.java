package model.entities;


import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	// Construtor sem argumentos
	public Account() {
	}
	
	// Construtor com quatro argumentos
	public Account(Integer number, String holder, Double initialBalance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		balance = initialBalance;
		this.withdrawLimit = withdrawLimit;
	}
	
	// Configura o número da conta
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	// Obtém o número da conta
	public Integer getNumber() {
		return number;
	}
	
	// Configura o nome do titular da conta
	public void setHolder(String holder) {
		this.holder = holder;
	}

	// Obtém o nome do titular da conta
	public String getHolder() {
		return holder;
	}
	
	// Obtém o saldo da conta
	public Double getBalance() {
		return balance;
	}
	
	// Configura o limite de saque da conta
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// Obtém o limite de saque da conta
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	// Deposita dinheiro na conta
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		
		Validatewithdraw(amount);
		balance -= amount;
	}

	public void Validatewithdraw(Double amount) throws DomainException {
		// Verifica se o valor a ser sacado é maior que o saldo atual
		if (amount > getBalance()) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		
		// Verifica se o valor a ser sacado é maior que o limite de saque
		if (amount > getWithdrawLimit()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		
		
	}

	
	
}
