package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		//Pilha - LI FO
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		//metodos que adiciona na pilha
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println("Iniciar for");
		
		
		//for each
		for(String livro:livros) {
			System.out.println(livro);
		}
		
		System.out.println("Finalizar for");
		//metodos que remove da pilha
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
		System.out.println(livros.size());
			livros.clear();
			
		//verifica se está vazio	
		System.out.println(livros.isEmpty());


	}

}
