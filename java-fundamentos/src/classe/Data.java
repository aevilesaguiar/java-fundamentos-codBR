package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	
	String obterDataFormatada() {
		return  String.format(dia+"/"+mes+"/"+ano);
			
	}
	
}
