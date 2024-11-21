package applicaiton;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
		
	public static void main(String[] args) {
		
		// Referência que aponta para o caminho do arquivo!
		File file = new File("C:\\program-java\\files\\file\\hello.txt");
		Scanner sc = null;
		
		
		try {
			
			// Inicializa o objeto Scanner usando o arquivo file. isso significa que agora o scanner
			// Pode ser usado para ler o conteúdo do arquivo.
			sc = new Scanner(file);
			
			// Esse loop continua enquanto o Scanner encontra uma próxima linha
			while(sc.hasNextLine()) {
				
				String line =  sc.nextLine();
				
				// Teste de encontrar string
				if(line.equals("Good Morning")){
					
					System.out.println("Teste");
				}
				
				// Pega a próxima linha 
				System.out.println(line);
			}
			
		}catch(IOException e) {
			
			System.out.println("Error in scanner: " + e.getMessage());
		}
		// O bloco finally é executado independentemente de o try ser concluído com sucesso ou resultar em uma exceção.
		finally {
			
			// Verifica se o scanner é diferente de (null) para fecha o arquivo.
			if(sc != null) {
				sc.close();
			}
			
		}
		
		
	}
}
