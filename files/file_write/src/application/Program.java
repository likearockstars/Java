package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning","Good Afternoon","Good night"};
		
		String path = "C:\\program-java\\files\\file_write\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)) ) {
			
			for(String line: lines) {
				
				// Escreve a sequência de caracteres no arquivo
				bw.write(line);
				// Adiciona um caractere especial de quebra de linha
				bw.newLine();
			}
			
		}catch(IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
	}

}
