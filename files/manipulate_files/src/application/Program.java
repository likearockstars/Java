package application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		// Nome do diretório
		String namePath= sc.nextLine();
		
		// Instância uma refência do diretório.
		File path = new File(namePath);
		
		// Faz um array com todas as pastas
		File[] folders  = path.listFiles(File::isDirectory);
		
		
		// Faz um array com todos os arquivos
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FOLDERS:");
		
		
		// Imprime todas as pastas
		for(File folder: folders) {
			
			System.out.println(folder);
		}
		
		System.out.println();
		
		// Imprime todos os arquivos
		for(File file: files) {
			
			System.out.println(file);
		}
		
		// Criando uma pasta no diretório específicado.
		// boolean sucess = new File(namePath + "\\teste").mkdir();
		
		
		
		sc.close();
	}
}
 