package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		// Criamos um objeto do DateTimeFormatter para conseguir ler a data no formato específicado.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter com os dados do aluguel:");
		
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(),dtf);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),dtf);
		
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = sc.nextDouble();
		
		// Instânciamos o modelo do veiculo	
		Vehicle vehicle = new Vehicle(model);
		
		// Instânciamos do aluguel do carro
		CarRental carRental = new CarRental(start,finish,vehicle);
		
		// Instânciamos a fatura do aluguel do carro
		RentalService rentalService = new RentalService(pricePerHour,pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println();
		
		System.out.println("FATURA:");
		System.out.printf("Pagamento basico: %.2f\n",carRental.getInvoice().getBasicPayment());
		System.out.printf("Imposto: %.2f\n", carRental.getInvoice().getTax());
		System.out.printf("Valor total: %.2f\n",carRental.getInvoice().getTotalPayment());
		sc.close();
	}

}
