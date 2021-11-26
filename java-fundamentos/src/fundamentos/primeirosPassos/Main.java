package fundamentos.primeirosPassos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			System.out.println();
			System.out.printf("Megasena: %d %d %d %d %d %d", 1,2,2,3,5,5);
			System.out.println();
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite o seu nome:");
			String nome = entrada.nextLine();
			
			System.out.println("Digite o seu sobrenome: ");
			String sobrenome=entrada.nextLine();
			
			
			System.out.println("Digite a sua idade:");
			int idade = entrada.nextInt();
			
			System.out.println("\n\nNome = "+ nome +" "+sobrenome+ "\n Idade:"+idade);
			
			//toda vez que eu abro o scanner eu tenho que fechar paa ele não usar os recursos da máquina
			entrada.close();
	}

}
