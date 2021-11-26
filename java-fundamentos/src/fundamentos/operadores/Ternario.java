package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

			double media = 3.6;
			//String resultadoParcial = media>=5.0? "Em recuperacao":"Reprovado";
			//String resultado = media>=7.0 ? "Aprovado":resultadoParcial;
			
			String resultadoFinal = media>=7.0? "aprovado": "em recuperação";
			
			
			System.out.println(resultadoFinal);
			
			
			double nota = 9.9;
			boolean bomComportamento = true;
			boolean passouPorMedia = nota>=7;
			boolean temDesconto= bomComportamento && passouPorMedia;
			String resultado = temDesconto ? "Sim.":"Não.";
			System.out.printf("Tem desconto ? %s", resultado);

	}

}
