package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {


		Queue<String> fila= new LinkedList<String>();
		
		
		//offer e add -: adicionam elementos na fila
		//difereença é o comportamento quando a fila está cheia
		
		//função adicionar add
		fila.add("Ana");//retorna false qdo a fila esta vazia
		//método offer ele adiciona , ele retorna  falso caso não consiga adicionar
		fila.offer("Bia");
		fila.offer("João");//lança uma exceção se a fila estiver vazia
		fila.offer("Fernando");
		fila.offer("Maria");
		fila.offer("José");
		
		
		//Peek e element-> obter o próximo elemnto da fila(sem remover)
		//diferença é o comportamento 
		//quando a fila está vazia
		System.out.println(fila.peek());//retorna false
		System.out.println(fila.element());//lança uma exceção
	
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		
		//pool e remove -> obtem o proximo elemento da fila e remove
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		
		
		
	}

}
