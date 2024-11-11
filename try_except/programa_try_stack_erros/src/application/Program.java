package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		method1();

	}
	
	public static void method1() {
		
		System.out.println("***METHOD1 START***");
		
		method2();
		
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		
		System.out.println("***METHOD2 START***");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] array = sc.nextLine().split(" ");
			
			int index = sc.nextInt();
			
			System.out.printf("Array[%d]: %s\n",index,array[index]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
			
		}catch(InputMismatchException e){
			
			System.out.println("Invalid input!");
		}
		
		
		System.out.println("***METHOD2 END***");
		
		System.out.println("End of program!");
		sc.close();
		
		
		
	}

}