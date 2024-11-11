package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] array = sc.nextLine().split(" ");
			
			int index = sc.nextInt();
			
			System.out.printf("Array[%d]: %s",index,array[index]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid position!");
			
		}catch(InputMismatchException e){
			
			System.out.println("Invalid input!");
		}
		
		
		sc.close();
		
	}

}
