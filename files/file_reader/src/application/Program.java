package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		
		String path = "C:\\hi.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			// é utilizado para ler caracteres de um arquivo.
			// A variável path contém o arquivo que você deseja ler
			// fr = new FileReader(path);
			
			// é uma classe que permite ler o texto de maneira eficiente, linha por linha.
			// br = new BufferedReader(fr);
			
			//  lê uma linha do arquivo e retorna como uma String. Se o arquivo estiver vazio, ele retorna null.
			String line = br.readLine();
			
			while(line != null) {
				
				System.out.println(line);
				line = br.readLine();
			}	
		}catch(IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
