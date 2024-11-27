package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

// Classe respónsavel por gerar a fatura
public class RentalService {
		
	
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;
	
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void  processInvoice(CarRental carRental) {
		
		//  Pegamos a duração em minutos para termos a fração de horas e minutos.
		double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
		// Divide por 60 para pegarmos a quantidade de horas
		double hours = minutes / 60.00;
		
		double basicPayment = 0.0;
		
		if(hours <= 12.0) {
			
			/*
			 	
			 		Calculamos a opção quando a alocação do carro não dura mais de 12 horas, multiplicando somente a quantidade de 
			 		horas arredonda para cima pelo preço da hora.
			 	
			 */
			
			basicPayment = pricePerHour * Math.ceil(hours);
			
		}else{
			
			/*
			 
			 	Calculamos a opção quando passa de 12 horas que pega o preço da alocação por dia e multiplica pela quantidade de dias, 
			 	arredonda para cima.
			 
			 */
			basicPayment = pricePerDay * Math.ceil(hours / 24.00);
		}
		
		// Pegando o valor do imposto
		double tax = taxService.tax(basicPayment);
		
		// Instânciando a fatura do serviço.
		carRental.setInvoice(new Invoice(basicPayment,tax));
	}
}
