package classe;

public class DataTeste {

	public static void main(String[] args) {
	 
		Data d1=new Data();
		
		d1.dia=7;
		d1.ano=2021;
		d1.mes=06;
		
		
		var d2=new Data();
	
		
		
		d2.dia=15;
		d2.ano=2025;
		d2.mes=02;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
	}

}
