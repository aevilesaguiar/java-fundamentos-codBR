package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	
	//n�o preciso receber parametros, pois os atributos j� est�o na Classe
	
	//dois m�todos com o mesmo nome, em java isso � possivel
	double PrecoComDesconto( double descontoGerente ) {
		
		
		return (preco*(1-(desconto +descontoGerente)));
	
	
	}
	
	
double PrecoComDesconto( ) {
		
		
		return (preco*(1-(desconto)));
	
	
	}
}
