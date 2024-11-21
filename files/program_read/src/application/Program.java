package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;


/*
 
 	Fazer um programa para ler o caminho de um arquivo .csv
	contendo os dados de itens vendidos. Cada item possui um
	nome, preço unitário e quantidade, separados por vírgula. Você
	deve gerar um novo arquivo chamado "summary.csv", localizado
	em uma subpasta chamada "out" a partir da pasta original do
	arquivo de origem, contendo apenas o nome e o valor total para
	aquele item (preço unitário multiplicado pela quantidade),
	conforme exemplo.
 */

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Instânciamos uma lista de produto
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		// Pedindo o diretório que iremos manipualr
		String sourceFileStr = sc.nextLine();
		
		// Instânciando uma referência que aponta para esse diretório
		// File sourceFile = new File(sourceFileStr);
		
		// Cria uma subpasta chamada out
		boolean sucess = new File(sourceFileStr + "\\out").mkdir();
		System.out.println("Create paste: " + sucess);
		
		// Diretório onde iremos escrever os dados dos produtos
		String targetFileStr = sourceFileStr + "\\out\\summary.csv";
		
		
		try(	
				// Instância o leitor de arquivos é fecha automaticamente após a leitura de todo o arquivo.
				BufferedReader br = new BufferedReader( new FileReader(sourceFileStr + "\\products.txt"))
				){
			
				
				// Pega a primeira linha do arquivo.
				String itemCsv = br.readLine();
				
				// Enquanto tiver linhas no arquivo.
				while(itemCsv != null) {
					
					// Retorna para o array elementos (String) usando separador ","
					String[] fields = itemCsv.split(",");
					
					String name = fields[0];
					// System.out.println("Debugging name: " + name);
					
					// casting para (Double)
					Double price = Double.parseDouble(fields[1]);
					// System.out.println("Debugging price: " + price);
					
					// casting para (Integer)
					Integer quantity = Integer.parseInt(fields[2]);
					// System.out.println("Debugging quantity: " + quantity);
					
					// Instância um novo produto
					Product product = new Product(name,quantity,price);
					
					// pega a próxima linha.
					itemCsv = br.readLine();
					
					// Adiciona o produto na lista
					list.add(product);
				}
			
		}catch(IOException e) {
			
			System.out.println("Error writing file: " + e.getMessage());
			e.printStackTrace();
		}
		
		// 2- Instânciamos uma referência para escrever no arquivo.
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr)) 
				){
				
			// Percorremos os produtos
				for(Product product : list) {
					
					// Escrevendo dados do produto
					bw.write("Name: " + product.getName() + ", total price: " + String.format("%.2f", product.total())
					);
					// Adicionando uma nova linha
					bw.newLine();
				}
			
			
		}catch(IOException e) {
			
			System.out.println("Error reading file: " + e.getMessage());
			e.printStackTrace();
		}
		
		
		sc.close();
		
	}

}
