package fundamentos;

public class Notacao {

	public static void main(String[] args) {

		//TUDO QUE � DEFINIDO EM ROXO S�O PALAVRAS RESERVADAS OU tipo
		//Tipos que n�o s�o priitivos usamos "."

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
		
		//tIPOS PRIMITIVS N�O TEM O OPERADOR "."

	}

}
