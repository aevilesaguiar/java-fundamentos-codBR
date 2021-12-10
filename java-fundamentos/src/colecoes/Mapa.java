package colecoes;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Mapa {

	public static void main(String[] args) {


		HashMap<Integer, String> usuarios = new HashMap<Integer,String>();
		//map não usa o método adicionar  add e sim put, put adiciona e substitui caso já exista
		//put significa colocar
		usuarios.put(1,"Robert");//adicionou
		usuarios.put(1,"Ricardo");//alterou chave que já existe
		usuarios.put(20,"Rebeca");//alterou chave que já existe
		usuarios.put(13,"Ana");//alterou chave que já existe
		usuarios.put(4,"Fernanda");//alterou chave que já existe
		
		
		
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());//conjunto das chaves
		System.out.println(usuarios.values());//pega os valores
		System.out.println(usuarios.entrySet());//pega chave e valor ao mesmo tempo
		
		System.out.println(usuarios.containsKey(13));//ele verifica se tem a chave 13
		System.out.println(usuarios.containsValue("Ana"));//ele verifica se tem o valor
		
		System.out.println(usuarios.get(4));//mostra o valor da chave 4
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		

	
		
	}

}
