package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


public class Program {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Client
		System.out.println("Enter cliente data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email =  sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate date = LocalDate.parse(sc.next(),dtf);
		
		Client client = new Client(name,email,date);
		
		System.out.println();
		
		// Order
		System.out.println("Enter order data:");
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(LocalDateTime.now(),status,client);
		
		System.out.println();
		
		// Add items
		
		System.out.print("How many items to this order? ");
		int quantityOfItems = sc.nextInt();
		
		for(int i = 0; i < quantityOfItems; i++) {
			
			System.out.println("Enter #" + (i+1) + " item data:");
			
			System.out.print("Product name: ");
			sc.next();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			// Produto que será usado como atributo para o pedido do item
			Product product = new Product(productName,productPrice);
			
			// Pedido do item
			OrderItem item = new OrderItem(quantity,productPrice,product);
			
			order.addItem(item);
			
			System.out.println();
			
		}
		
		System.out.println(order.toString());
		
		sc.close();
	}

}
