package classe;

public class ProdutoTeste  {
	public static void main(String[] args) {
		
		
		Produto p1= new Produto();
		p1.nome="Notebook";
		p1.preco=4356.89;
		p1.desconto=0.25;
		
		
		var p2= new Produto();
		p2.nome="Caneta Preta";
		p2.preco=12.56;
		p2.desconto=0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		
		double precoFinal1=p1.PrecoComDesconto(0.1);
		double precoFinal2=p2.PrecoComDesconto();
		
	
		
		System.out.println("Desconto Normal Pre�o1:"+ precoFinal1);
	
		
		
		System.out.println("Desconto Normal Pre�o2:"+ precoFinal2);
		
		
		double mediaCarrinho=(precoFinal1+precoFinal2)/2;
		System.out.println("Media do carrinho pre�o normal= R$ "+mediaCarrinho);

		
		
		
	}
}
