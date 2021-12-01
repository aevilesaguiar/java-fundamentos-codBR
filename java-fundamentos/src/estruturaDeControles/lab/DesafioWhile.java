package estruturaDeControles.lab;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		//nota valida 10 a 0
		//quando digitar a nota acrescentar a uma variavel total
		//e toda nova nota for acrescentada ele armazena
		//mostrar a nédia
		//e quando digitar -1 ele sai do programa
		
		
		Scanner scanner = new Scanner(System.in);
		
		int quantidadeDeNotas=0;
		
		double total =0;
						
		double nota = 0;
		
		while(nota != -1) {
			
			System.out.println("Informe a nota:");
			nota=scanner.nextDouble();
			
			if(nota<=10 && nota>=0) {
			total+=nota;
			quantidadeDeNotas++;
			} else {
				System.out.println("Nota Inválida!");
			}
		}

		double media = total / quantidadeDeNotas;
		System.out.println("Media ="+media);
		
		
		scanner.close();


	}

}
