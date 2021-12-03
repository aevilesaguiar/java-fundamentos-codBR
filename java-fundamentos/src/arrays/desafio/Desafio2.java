package arrays.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Quantidade de Alunos:");
		int qtdeAlunos=scanner.nextInt();
		
		System.out.println("Notas por aluno Aluno:");
		int qtdeNotas=scanner.nextInt();
		
		
		double[][] notasDaTurma= new double[qtdeAlunos][qtdeNotas];
		
		double total=0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.println("Informe a nota "+i+ "do aluno "+j);
				notasDaTurma[i][j]=scanner.nextDouble();
			total+=notasDaTurma[i][j];
			
			}
			
		}
		
		double media = total/(qtdeAlunos*qtdeNotas);
		
		System.out.println("Media da Turma é: "+media);
		
		
		for (double [] notasDoAlunos:notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAlunos));
		}
		
	
		
		scanner.close();

	}

}
