package model.entities;

import java.time.LocalDate;

import model.services.OnlinePaymentService;

public class ContractService {
	
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		
		this.onlinePaymentService = onlinePaymentService;
		
	}
	
	
	public void processContract(Contract contract, int months) {
		
		//S ystem.out.println(months);
		
		double basicQuota = contract.getTotalValue() / months;
		// System.out.println(basicQuota);
		
		for(int i = 1; i <= months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			// System.out.println(dueDate);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			// System.out.println(interest);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			// System.out.println(fee);
			
			Double quota = basicQuota + interest + fee;
			//System.out.println(quota);
			contract.getInstallment().add(new Installment(dueDate,quota));
			
		}
		
	}

}
