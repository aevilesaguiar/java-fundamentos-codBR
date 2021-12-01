package estruturaDeControles.lab;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String texto="";
		
		while(!texto.equalsIgnoreCase("sair")) {
			System.out.println("Informe o texto");
			 texto=scanner.nextLine();
		}	
		scanner.close();

	}

}
