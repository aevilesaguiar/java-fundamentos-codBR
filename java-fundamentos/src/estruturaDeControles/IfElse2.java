package estruturaDeControles;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digita a nota");
		double nota =scanner.nextDouble();
		
		if(nota>10 || nota <0) {
			System.out.println("Nota invalida");
		}else {
			
			if (nota>=9 && nota<=10) {
				System.out.println("Conceito A");
			}else if(nota >=7&&nota<=9) {
				System.out.println("Conceito B");
			}else if(nota >=6 && nota<7) {
				System.out.println("Conceito C");
			}else{
				System.out.println("reprovado");
			}
			
		}
		
		scanner.close();
	}

}
