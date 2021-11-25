package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		//Informações do Funcionário
		
		//diferença capacidade de armazenamento
		//valores literais
		
		//Tipos numericos inteiros
		byte anosDeEmpresa= 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 99_134_845_223L;//é usado o underline para facilitar a leitura. O "L"quer dizer literal tipo long e não inteiro

		
		
		//Tipos numericos Reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo Caractere
		char status = 'A';
		
		
		//Dias de empresa
		
		System.out.println("Dias em que trabalhou na empresa:"+anosDeEmpresa*365);
		
		//Numero de Viagens
		
		System.out.println("Numero de Viagens: "+ numeroDeVoos/2);
		
		//Pontos por real
		
		System.out.println("Quantos pontos ele ganhou por vendas:"+pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + "ganha ->"+salario );
		System.out.println("Ferias? "+estaDeFerias);
		System.out.println("Status"+status);
		
		
	}

}
