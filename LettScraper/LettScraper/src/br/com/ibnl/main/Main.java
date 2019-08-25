package br.com.ibnl.main;

import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import br.com.ibnl.classes.Produto;

/*
 * A classe foi instanciada para que os dados possam ser inseridos
 * 
 * Foi utilizada a classe Scanner para receber a url que ter� os dados extraidos.
 *
 */

public class Main {

	public static void main(String[] args) {
		
		String url = "";
		String title = "";
		String aVista = "";
		String parcelado = "";
		String boleto = "";

		Produto processadores = new Produto(title, aVista, parcelado, boleto);
		
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
					
		
		System.out.println("Digite a URL para extrair os dados ou Y para sair. ");
		url = input.nextLine();
		
		if (url.equalsIgnoreCase("Y")){
			System.out.println("saindo...");
			break;
			
		}
		
		try {
			Document doc =Jsoup.connect(url).get();
			title = doc.title();
			processadores.setTitle(title);	
			
			aVista  = doc.getElementsByClass("preco_normal").text();
			processadores.setaVista(aVista);
			
			parcelado = doc.getElementsByClass("12x").text();
			processadores.setParcelado(parcelado);
						
			boleto = doc.getElementsByClass("preco_desconto").text();
			processadores.setBoleto(boleto);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		System.out.println(String.format("**Dados extraidos**\n"
				+"Produto: %s \n"
				+"Pre�o a vista: %s \n"
				+"Parcelado: %s \n"
				+"No boleto: %s", processadores.getTitle(), processadores.getaVista(),
				processadores.getParcelado(), processadores.getBoleto()));
		
		}
		
	
		
	}
}
