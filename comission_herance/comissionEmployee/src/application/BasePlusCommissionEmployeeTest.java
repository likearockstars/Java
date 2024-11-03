package application;

import java.util.Locale;
import entities.BasePlusCommissionEmployee;

public class BasePlusCommissionEmployeeTest {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Instancia o objeto BasePlusCommissionEmployee
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob","Lewis","333-33-3333",
				5000.00,0.4,300.00);
		
		
		System.out.println("Employee now:\n" + employee.toString());
		System.out.println();
		
		employee.setBaseSalary(1000.00); // Configura o salário base
		
		System.out.println("Employee update:\n" + employee.toString());
		
	}
}
