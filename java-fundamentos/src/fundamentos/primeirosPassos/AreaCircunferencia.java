package fundamentos.primeirosPassos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		/**
		 * final - uma vez que setei um valor ele não pode mudar é uma constante
		 */
		
		double raio = 3;
		final double PI=3.14159;
		
		double area = PI*raio*raio;
		
		System.out.println(" Area ="+area+" m2.");
		
		
		raio = 10;
		area = PI *raio * raio;
		System.out.println(" Area ="+area+" m2.");
		
		
	}

}
