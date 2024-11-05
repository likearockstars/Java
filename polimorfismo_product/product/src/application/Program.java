package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int quantityOfProduct = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < quantityOfProduct; i++) {
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(typeProduct == 'i') {
				
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name,price,customFee);
				
				products.add(product);
			}
			else if (typeProduct == 'u') {
				
				System.out.print("Date (dd/mm/yyyy): ");
				LocalDate date = LocalDate.parse(sc.next(),dtf);
				
				UsedProduct product = new UsedProduct(name,price,date);
				
				products.add(product);
			}else {
				
				Product product = new Product(name,price);
				
				products.add(product);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Price tags:");
		showProducts(products);
		
		sc.close();
		
	}
	
	public static void showProducts(List<Product> products) {
		
		
		for(Product product: products) {
			
			System.out.println(product.priceTag());
		}
	}

}
