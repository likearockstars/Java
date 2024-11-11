package application;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.Employee;
import entities.HourlyEmployee;
import entities.SalariedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		// Cria objetos da subclasses
		
		SalariedEmployee salariedEmployee = new SalariedEmployee("Jonh","Smith","111-11-111",800.00);
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen","Price","222-22-2222",16.75,40);
		
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue","Jones","333-33-3333",10000.00,.06);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob","Lewis",
		"444-44-4444",5000.00,.04,300.00);
				
		
		System.out.println("Employees processed individually:\n");
				
		System.out.printf("%s\n%s: $%.2f\n\n",salariedEmployee.toString(),"earned",salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%.2f\n\n",hourlyEmployee.toString(),"earned",hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%.2f\n\n",commissionEmployee.toString(),"earned",commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%.2f\n\n",basePlusCommissionEmployee.toString(),"earned",basePlusCommissionEmployee.earnings());
			
				
		// cria um array Employee de quatro elementos
		Employee[] employees = new Employee[4];
		
		// Inicializa o array com employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.println();
		
		for(Employee currentEmployee: employees) {
			
			System.out.println(currentEmployee + "\n");
			
			// determina se o elemento é um BasePlusCommissionEmployee
			if(currentEmployee instanceof BasePlusCommissionEmployee) {
				
				// downcast da referência de employee para BasePlusCommissionEmployee
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n",employee.getBaseSalary());
				
			}
			
			System.out.printf("eanerd: $%,.2f\n\n", currentEmployee.earnings());
		}
		
		// Obtém o nome do tipo de cada objeto no array employee
		for(int i = 0; i < employees.length; i++) {
			System.out.printf("Employee %d is a %s\n", (i+1),employees[i].getClass().getName());
		}
		
		
				
				
}

}
