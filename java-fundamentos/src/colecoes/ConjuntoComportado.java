package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Usamos dados homog�neos
		
		//TreeSet respeita a ordem de se��o, ele faz part do SortedSet que s�o conjuntos ordenados
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}

		//HashSet n�o respeita a ordem de se��o
		//Set<String> listaAprovados = new HashSet<>();
				System.out.println("=======================================");
		Set<Integer> listaAprovados1 = new HashSet<>();
		
		listaAprovados1.add(1);
		listaAprovados1.add(2);
		listaAprovados1.add(120);
		listaAprovados1.add(6);
		
		for(Integer num: listaAprovados1) {
			System.out.println(num);
		}
		
		
		
		
		
	}

}
