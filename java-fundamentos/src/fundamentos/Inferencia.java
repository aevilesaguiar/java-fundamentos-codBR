package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		/*
		 * A infer�ncia de tipos � uma t�cnica usada por linguagens tipadas estaticamente, 
		 * em que os tipos de vari�veis podem ser inferidos do contexto pelo compilador. 
		 * As linguagens variam no uso e interpreta��o da infer�ncia de tipos, que geralmente 
		 * fornece ao programador uma op��o, n�o uma obriga��o. Somos livres para escolher entre
		 * tipos manifestos e tipos inferidos, e devemos fazer essa escolha com responsabilidade,
		 * usando a infer�ncia de tipos nas situa��es que melhora a legibilidade e evit�-la onde
		 * possa criar confus�o.
		 * Voc� pode deixar o java descobrir o tipo (inferencia) ou definir o tipo
		 */

		double a  = 4.5;
		System.out.println(a);

		
		var b=4.5;
		System.out.println(b);
		
		var c="tEXTO";
		System.out.println(c);
	
	
	}

}
