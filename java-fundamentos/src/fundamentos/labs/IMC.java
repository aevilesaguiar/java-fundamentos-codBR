package fundamentos.labs;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		/** 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC. */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu peso");
		double peso = scanner.nextDouble();
		
		System.out.println("Informe sua altura:");
		double altura = scanner.nextDouble();
		
		double imc = peso/(Math.pow(altura, 2));
		
		System.out.printf("O seu IMC é: %.2f",imc);
		
		scanner.close();
	}

}
