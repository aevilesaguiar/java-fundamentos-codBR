package fundamentos.primeirosPassos;

public class Temperatura {

	public static void main(String[] args) {

		//(° F -32)x 5/9=°C
		
		final double FATOR = 5.0/9.0;
		
		final double AJUSTE = 32;
		
		double farenheite = 86;
		
		double celcius = (farenheite-AJUSTE)*(FATOR);
		
		System.out.println("O resultado é : "+ celcius+"° C");
		
		
		
	}

}
