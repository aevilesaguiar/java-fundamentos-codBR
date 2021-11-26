package fundamentos.primeirosPassos;

public class Notacao {

	public static void main(String[] args) {

		//TUDO QUE É DEFINIDO EM ROXO SÃO PALAVRAS RESERVADAS OU tipo
		//Tipos que não são priitivos usamos "."

		String s = " Bom dia X";
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s =s.replace("X","Senhora");
		System.out.println(s);
		
		s =s.concat("!!!!");
		System.out.println(s);
		
		System.out.println("Aeviles".toUpperCase());
		
		
		String y = "Bom dia X".replace("X", "Aeviles.").toUpperCase().concat(" Seja Feliz");
		System.out.println(y);
		
		//tIPOS PRIMITIVS NÃO TEM O OPERADOR "."

	}

}
