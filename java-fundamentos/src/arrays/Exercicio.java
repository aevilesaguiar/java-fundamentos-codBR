package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		//array - tamanho fixo, conjunto de dados anexados , que s�o acessados por �ndice, estrutura homog�nea com os dados do mesmo tipo
		
		double [] notasAlunoA= new double[4];
		
		notasAlunoA[0]=7.9;
		notasAlunoA[1]=8;
		notasAlunoA[2]=6.7;
		notasAlunoA[3]=9.7;
	
		//imprimindo os valores do array
	System.out.println(Arrays.toString(notasAlunoA));	
	
	//percorrendo o array
	
	double total=0;
	
	for(int i=0; i<notasAlunoA.length;i++) {
		total+=notasAlunoA[i];
	}
	
	System.out.println("Media: "+total/4);
	
	
	
	
	//OUTRA FORMA DE DEFINIR UM ARRAY
	//definindo com formas literais, n�o � muito usado
	
	double [] notasAlunoB= {6.9,8.9,5.5,10};//DADOS HOMOG�NEO, E ELEMENTOS PRE DEFINIDOS
	
	double totalNota=0;
	
	for (int i = 0; i < notasAlunoB.length; i++) {
			totalNota+=notasAlunoB[i];
	}
	
	
	System.out.println("Media:"+totalNota/4);
	
	
	
	
	}
	
	
	
	
	

}
