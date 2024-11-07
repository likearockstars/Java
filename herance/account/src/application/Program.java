package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BussinessAccount;
import entities.Account;
import entities.SavingsAccount;
import java.util.List;
import java.util.ArrayList;

public class Program {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Account> accounts = new ArrayList<>();
		
		// Account acc = new Account(1001,"Alex",0.0);
		BussinessAccount bacc = new BussinessAccount(1002,"Maria",0.0,500.00);

		// Up casting
		
		// Relation is one 
		
		// super class  = sub class
		
		Account acc1 = bacc;
		
		Account acc2 = new BussinessAccount(1003,"Bob",0.0,200.00);
		
		Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);
		
		// Down casting
		// Temos que deixar claro ao compilador que queremos converter a superclasse (Account) para subclasse (BusinessAccount)
		BussinessAccount acc4 = (BussinessAccount) acc2;
		acc4.loan(100.00);
		
		
		// Erro em tempo de compilação.
		// BussinessAccount acc5 = (BussinessAccount)acc3;
		
		BussinessAccount acc5;
		
		// Verifica se a variável de instância é uma instância de (BussinessAccount) para realizar o casting
		if(acc3 instanceof BussinessAccount) {
			
			acc5  = (BussinessAccount) acc3;
			acc5.deposit(1000.00);
		}
		else {
			System.out.println("Nao é uma instância de BussinessAccount");
		}
		
		
		// Account account1 = new Account(1001,"Alex",1000.00);
		// account1.withdraw(200.00);
		// System.out.println("Balance = " + String.format("%.2f", account1.getBalance()));
		
		System.out.println();
		
		// Account account2 = new SavingsAccount(1002,"Maria",1000.00,0.21);
		// account2.withdraw(200.00);
		// System.out.println("Balance = " + String.format("%.2f",account2.getBalance()));
		
		// System.out.println();
		
		// Account account3 = new BussinessAccount(1003,"Carla",1000.00,500.00);
		// account3.withdraw(200.00);
		//System.out.println("Balance = " + String.format("%.2f",account3.getBalance()));
		
		
		accounts.add(new SavingsAccount(1000,"Alex",5000.00,0.01));
		accounts.add(new BussinessAccount(1002,"Maria",1000.0,400.00));
		accounts.add(new SavingsAccount(1004,"Bob",300.0,0.01));
		
		double sum = 0.0;
		
		for(Account acc : accounts) {
			
			sum += acc.getBalance();
		}
		
		System.out.println();
		
		System.out.printf("Total balance: %.2f\n",sum);
		
		for(Account acc: accounts) {
			
			acc.deposit(10.0);
		}
		
		System.out.println();
		
		for(Account acc: accounts) {
			
			System.out.printf("Total balance: %.2f\n",acc.getBalance());
		}
		sc.close();
	}

}
