package estruturaDeControles.lab;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva um numero:");
		int numero = scanner.nextInt();
		
		if(numero>=0 && numero<=10) {
			
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
			} else {
				System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
			}
		}else {
			System.out.println("O numero " + numero + " não está entre 0 e 10.");
		}
		
		
		
		scanner.close();

	}

}
