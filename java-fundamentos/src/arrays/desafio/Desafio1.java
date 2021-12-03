package arrays.desafio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas notas :");
		
		int qtdeNotas=scanner.nextInt();
			
		double [] notasAluno= new double[qtdeNotas];
		
		
		
		for(int i=0; i<notasAluno.length;i++) {
			System.out.println("Informe a nota "+(i+1)+":");
			notasAluno[i]=scanner.nextInt();
			
		}
		double totalNotas=0;
		for (double nota : notasAluno) {
			totalNotas+=nota;
		}
		
		
		System.out.println("Media notas:"+totalNotas/qtdeNotas);
		
		scanner.close();

	}

}
