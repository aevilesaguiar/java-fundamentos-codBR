package fundamentos.primeirosPassos;

public class Inferencia {

	public static void main(String[] args) {

		/*
		 * A inferência de tipos é uma técnica usada por linguagens tipadas estaticamente, 
		 * em que os tipos de variáveis podem ser inferidos do contexto pelo compilador. 
		 * As linguagens variam no uso e interpretação da inferência de tipos, que geralmente 
		 * fornece ao programador uma opção, não uma obrigação. Somos livres para escolher entre
		 * tipos manifestos e tipos inferidos, e devemos fazer essa escolha com responsabilidade,
		 * usando a inferência de tipos nas situações que melhora a legibilidade e evitá-la onde
		 * possa criar confusão.
		 * Você pode deixar o java descobrir o tipo (inferencia) ou definir o tipo
		 */

		double a  = 4.5;
		System.out.println(a);

		
		var b=4.5;
		System.out.println(b);
		
		var c="tEXTO";
		System.out.println(c);
	
	
	}

}
