package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {


		HashSet conjunto = new HashSet();
		
		//conversão automática, collection não aceita numeros primitivos, converte automaticamente 
		conjunto.add(1.2); //double-> Double
		conjunto.add(true);//boolean->Boolean
		conjunto.add("Teste");//String
		conjunto.add(1);//int-> Integer
		conjunto.add('x');//char-> caractere
		
		//quantidade de elementos do conjunto
		System.out.println(conjunto.size());
		
		conjunto.add("teste");

		System.out.println(conjunto.size());
		conjunto.add("Teste"); //Ele não conta pois esse elemento já existe
		System.out.println("O tamanho é:"+conjunto.size());
	
		//remover elementos do conjunto
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("O tamanho é:"+conjunto.size());
		
		//verifica se determinado elemento está contido no elemento
		System.out.println(conjunto.contains(1.2));
		
		
		//variavel do tipo Set
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		//collection implemeta e mostra como array
		System.out.println(nums);
		System.out.println(conjunto);
		
		
		//união dos conjuntos
		conjunto.addAll(nums);//união entre dois conjuntos
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}

}
