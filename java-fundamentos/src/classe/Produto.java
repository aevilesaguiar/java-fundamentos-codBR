package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto=0.25;
	
	
	
	//construtor=metodo especial
	
	//3 formas de construir um construtor
	Produto(){
		
	}
	Produto(String nomeInicial){
		nome =nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		
		nome = nomeInicial;
		preco = precoInicial;

	}
	
	
	
	//não preciso receber parametros, pois os atributos já estão na Classe
	
	//dois métodos com o mesmo nome, em java isso é possivel
	double PrecoComDesconto( double descontoGerente ) {
		
		
		return (preco*(1-(desconto +descontoGerente)));
	
	
	}
	
	
 static double Produto( double precoInicial) {
		
		return (precoInicial*(1-(desconto)));
	
	
	}
 

}
