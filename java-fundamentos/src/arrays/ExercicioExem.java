package arrays;

import java.util.Arrays;

import fundamentos.primeirosPassos.Main;

public class ExercicioExem {
	
	public static void main(String[] args) {
		//array - tamanho fixo, conjunto de dados anexados , que são acessados por índice, estrutura homogênea com os dados do mesmo tipo
		
		double [] notasAlunoA= new double[4];
		
		notasAlunoA[0]=7.9;
		notasAlunoA[1]=8;
		notasAlunoA[2]=6.7;
		notasAlunoA[3]=9.7;
	
		//imprimindo os valores do array
	System.out.println(Arrays.toString(notasAlunoA));	
	
	//percorrendo o array
	
	double total=0;
	
	System.out.println("aqui foreach");
	
	for (double nota:notasAlunoA) {
		
		total+=nota;
	}
	
	System.out.println("media:"+total/4);
		
	
	//OUTRA FORMA DE DEFINIR UM ARRAY
	//definindo com formas literais, não é muito usado
	
	double [] notasAlunoB= {6.9,8.9,5.5,10};//DADOS HOMOGÊNEO, E ELEMENTOS PRE DEFINIDOS
	
	double totalNota=0;
	
	for (int i = 0; i < notasAlunoB.length; i++) {
			totalNota+=notasAlunoB[i];
	}
	
	
	System.out.println("Media:"+totalNota/4);
	

	
	
	}
	
	
	

	

}
