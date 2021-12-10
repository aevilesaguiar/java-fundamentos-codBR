package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {


		Queue<String> fila= new LinkedList<String>();
		
		
		//offer e add -: adicionam elementos na fila
		//difereen�a � o comportamento quando a fila est� cheia
		
		//fun��o adicionar add
		fila.add("Ana");//retorna false qdo a fila esta vazia
		//m�todo offer ele adiciona , ele retorna  falso caso n�o consiga adicionar
		fila.offer("Bia");
		fila.offer("Jo�o");//lan�a uma exce��o se a fila estiver vazia
		fila.offer("Fernando");
		fila.offer("Maria");
		fila.offer("Jos�");
		
		
		//Peek e element-> obter o pr�ximo elemnto da fila(sem remover)
		//diferen�a � o comportamento 
		//quando a fila est� vazia
		System.out.println(fila.peek());//retorna false
		System.out.println(fila.element());//lan�a uma exce��o
	
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		
		//pool e remove -> obtem o proximo elemento da fila e remove
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		
		
		
	}

}
