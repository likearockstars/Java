package model.services;

public class DeliverService {
	
	public DeliverService() {
	}
	
	public double fee(String state) {
		
		if("SP".equalsIgnoreCase(state)) {
			
			return 10.00;
		}else {
			
			return 20.00;
		}
	}
}
