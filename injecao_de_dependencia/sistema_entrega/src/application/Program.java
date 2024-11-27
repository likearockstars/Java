package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.DeliverService;
import model.services.PayService;
import model.services.TaxService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("State: ");
		String state = sc.nextLine();
		
		System.out.print("Value: ");
		Double value = sc.nextDouble();
		
		DeliverService deliverService = new DeliverService();
		TaxService taxService = new TaxService();
		
		PayService payService = new PayService(taxService,deliverService);
		
		System.out.println("Value total: " + String.format("%.2f",payService.finalPrice(value, state)));
		
		
		sc.close();
		
	}

}
