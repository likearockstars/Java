package model.services;

public class PayService {
	
	private TaxService taxService;
	private DeliverService deliverService;
	
	// Inversão de controle por meio de construtor.
	public PayService(TaxService taxService, DeliverService deliverService) {
		
		this.taxService = taxService;
		this.deliverService = deliverService;
	}
	
	public double finalPrice(Double cost, String state) {		
		return cost +  taxService.tax(cost) +  deliverService.fee(state);
		
	}

}
