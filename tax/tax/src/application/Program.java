package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the number of tax payers: ");
		int quantityOfTaxPayers = sc.nextInt();
		
		List<TaxPayer> payers = new ArrayList<>();
		
		System.out.println();
		
		for(int i = 0; i < quantityOfTaxPayers; i++) {
			
			System.out.println("Tax payer #" + (i+1) + " data:");
			
			System.out.print("Individual or company (i/c): ");
			char typeTaxPayer = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			
			if(typeTaxPayer == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				Individual individual = new Individual(name,anualIncome,healthExpenditures);
				payers.add(individual);
			}else {
				
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				Company company = new Company(name,anualIncome,numberOfEmployees);
				payers.add(company);
			}
			
			
			System.out.println();
			
		}
		
		System.out.println("TAXES PAID:");
		
		showTaxes(payers);
		
		System.out.println();
		
		System.out.println("TOTAL TAXES $ " + String.format("%.2f", totalTax(payers)));
		
		sc.close();
		
	}
	
	public static void showTaxes(List<TaxPayer> payers) {
		
		
		for(TaxPayer payer : payers) {
			
			System.out.println(payer.toString());
		}
		
	}
	
	public static double totalTax(List<TaxPayer> payers) {
		
		double totalTax = 0.0;
		
		for(TaxPayer payer: payers) {
			
			totalTax += payer.tax();
		}
		
		return totalTax;
	}
	
	
	
}
