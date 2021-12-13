package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Compra compra1=new Compra();
		compra1.adicionarItem("Caneta",  100,9.67);
		compra1.adicionarItem(new Produto("Notebook", 3000), 2);
		
		Compra compra2=new Compra();
		compra2.adicionarItem("Caderno",  90,19.67);
		compra2.adicionarItem(new Produto("Impressora", 10), 200);
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
		
		
		
		System.out.println(cliente.obterValorTotal());
	}

}
