package application;

import entities.Invoice;
import entities.interfaces.Payable;

// Teste a interface Payable

public class PayableInterfaceTest {

	public static void main(String[] args) {
		
		// Cria um array Payable de quatro elementos
		Payable[] payableObjects = new Payable[4];
		
		// prenche o array com objectos que implementam Payable
		payableObjects[0] = new Invoice("01234","seat",2, 375.00);
		System.out.println(payableObjects[0].toString());
		
	}

	
}
