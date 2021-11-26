package fundamentos.labs;

import java.util.Scanner;

public class ResultCuboQuadrado {

	public static void main(String[] args) {
		/** 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */

		Scanner scanner = new Scanner(System.in);
		
		double numero= scanner.nextDouble();
		
		double cubo=Math.pow(numero, 3);
		double quadrado=Math.pow(numero, 2);
		
		System.out.println("O numero "+numero+ " ao quadrado é: "+quadrado + " e ao cubo é:"+cubo );
		
		scanner.close();
	}

}
