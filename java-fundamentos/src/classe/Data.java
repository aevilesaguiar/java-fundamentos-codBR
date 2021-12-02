package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	
	//construtor padrão
	Data(){
				//dia=1;
				//mes=1;
				//ano=1970;
		
		//this(dia, mes,ano);
		this(1, 2,202);
		
	}
	
	//construtor com parametros
	Data(int inicialDia, int inicialMes, int inicialAno){
		
		this.dia = inicialDia;
		this.mes=inicialMes;
		this.ano=inicialAno;
	}
	
	
	Data(int inicialDia){
		
		this.dia = inicialDia;

	}
	
	

	String obterDataFormatada() {
		return  String.format(this.dia+"/"+this.mes+"/"+this.ano);
			
	}
	
}
