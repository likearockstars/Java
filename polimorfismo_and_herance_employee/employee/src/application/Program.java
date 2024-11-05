package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantityOfEmployee = sc.nextInt();

        System.out.println();

        for (int i = 0; i < quantityOfEmployee; i++) {

            System.out.println("Employee #" + (i + 1) + " data:");

            System.out.print("Outsourced (y/n)? ");
            char answer = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            /*
                Verifica se o funcionário a ser instanciado é do tipo Employee ou
                do tipo OutsourcedEmployee, para que a memória seja alocada de forma
                dinâmica e a variável (employee), que aponta para o objeto na memória
                dinâmica, seja adicionada à lista.
            */
            if (answer == 'y') {

                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                OutsourcedEmployee employee = new OutsourcedEmployee(
                        name,
                        hours,
                        valuePerHour,
                        additionalCharge);

                employees.add(employee);

            } else {

                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }

            System.out.println();

        }

        System.out.println();
        System.out.println("PAYMENTS:");

        // Imprime as informações do funcionário.
        showEmployees(employees);

        sc.close();
    }

    public static void showEmployees(List<Employee> employees) {

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

