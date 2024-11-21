package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String namePath = sc.nextLine();
		
		File path = new File(namePath);
		
		// Pega o nome do arquivo
		System.out.println("Name: " + path.getName());
		// Pega o caminho do diretório pai
		System.out.println("Path: " + path.getParent());
		// Pega o path completo
		System.out.println("Path complete: " + path.getPath());
		
		sc.close();
		
	}

}
