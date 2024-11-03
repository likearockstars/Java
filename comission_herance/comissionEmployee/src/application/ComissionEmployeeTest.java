package application;

import java.util.Locale;
import entities.CommissionEmployee;

public class ComissionEmployeeTest {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Instancia o objeto ComissionEmployee
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue","Jones","222-22-2222",
				100000.00, 0.6);
		
		// Obtém os dados do empregado comissionado
		
		System.out.println("Employee information obtained by get methods: \n");
		
		System.out.printf("%s %s\n","First name is", commissionEmployee.getFirstName());
		System.out.printf("%s %s\n","Last name is", commissionEmployee.getLastName());
		System.out.printf("%s %s\n","Social security number is",commissionEmployee.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n","Gross sales is",commissionEmployee.getGrossSales());
		System.out.printf("%s %.2f\n","Comission rate is",commissionEmployee.getCommissionRate());
		
		// Configura vendas brutas
		commissionEmployee.setGrossSales(500);
		commissionEmployee.setCommissionRate(0.1);
		
		System.out.printf("\n%s:\n\n%s\n","Update employee information obtained by toString",
				commissionEmployee.toString());
		

		
		
	
	}

}
