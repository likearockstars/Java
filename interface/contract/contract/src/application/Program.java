package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.entities.Contract;
import model.entities.ContractService;
import model.entities.Installment;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String stringNumber;
		String stringData;
		String stringTotalValueContract;
		String stringQuantityOfInstallments;
		
		Integer number  = 0;
		LocalDate date = null;
		Double totalValueContract = 0.0;
		Integer quantityOfInstallments = 0;
	
		
		Contract contract;
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// System.out.println("Enter contract details: ");
		
		try {
			
			stringNumber = JOptionPane.showInputDialog("Enter a number of contract: ");
			stringData = JOptionPane.showInputDialog("Date (dd/mm/yyyy): ");
			stringTotalValueContract = JOptionPane.showInputDialog("Total value of contract: ");
			stringQuantityOfInstallments = JOptionPane.showInputDialog("Quantity of installments: ");
			
			number = Integer.parseInt(stringNumber);
			date = LocalDate.parse(stringData,dtf);
			totalValueContract = Double.parseDouble(stringTotalValueContract);
			quantityOfInstallments = Integer.parseInt(stringQuantityOfInstallments);
			
			contract = new Contract(number,date,totalValueContract);
			
			OnlinePaymentService onlinePaymentService = new PaypalService();
			
			ContractService contractService = new ContractService(onlinePaymentService);
			
			contractService.processContract(contract, quantityOfInstallments);
			
			for(Installment installment : contract.getInstallment()) {
				
				JOptionPane.showMessageDialog(null, installment.toString());
			}
			
			
		}catch(NumberFormatException error) {
			
			System.out.println(error.getMessage());
		}catch(DateTimeParseException error) {
			
			System.out.println(error.getMessage());
		}
		
		
		
	
	
		
		
		sc.close();
		
		
	}
}
