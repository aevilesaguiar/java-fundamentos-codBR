package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {


		double a =2;
		double b = a;//atribui��o por valor (tipo primitivo)

		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);

		
		Data d1 = new Data(1,6,2021);
		
		d1.dia=31;
		d1.ano=2025;
		
		System.out.println(d1.obterDataFormatada());
		
		
		
		
		
	}
	

}
