package estruturaDeControles;

import java.util.Scanner;

public class EstruturaDeControle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = scanner.nextDouble();
		
		if(media>=7 && media<=10) {
			System.out.println("Aluno Aprovado \nParabéns!");
		}else if(media >10) {
			System.out.println("Insira um numero de 0 a 10");
		}else {
			System.out.println("Aluno Reprovado");
		}
		
		
		scanner.close();
		
		
		


	}

}
