package classe;

public class ProdutoTeste  {
	public static void main(String[] args) {
		
		
		Produto p1= new Produto("Notebook", 4356.89);

		
		var p2= new Produto();
		p2.nome="Caneta Preta";
		p2.preco=12.56;
		p2.preco=0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		
		double precoFinal1=p1.PrecoComDesconto(0.1);
		double precoFinal2=p2.PrecoComDesconto(0.15);
		
	
		
		System.out.println("Desconto Normal Preço1:"+ precoFinal1);
	
		
		
		System.out.println("Desconto Normal Preço2:"+ precoFinal2);
		
		
		double mediaCarrinho=(precoFinal1+precoFinal2)/2;
		System.out.println("Media do carrinho preço normal= R$ "+mediaCarrinho);

		
		
		
	}
}
