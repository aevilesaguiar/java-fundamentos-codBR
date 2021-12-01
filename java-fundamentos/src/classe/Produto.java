package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	
	//não preciso receber parametros, pois os atributos já estão na Classe
	
	//dois métodos com o mesmo nome, em java isso é possivel
	double PrecoComDesconto( double descontoGerente ) {
		
		
		return (preco*(1-(desconto +descontoGerente)));
	
	
	}
	
	
double PrecoComDesconto( ) {
		
		
		return (preco*(1-(desconto)));
	
	
	}
}
