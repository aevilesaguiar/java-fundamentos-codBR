package classe;

public class AreaCirc {
	
	double raio;
	static final double PI=3.1415;// com o agora o valor de pi está associado diretamente a classe e não a instancia
	//static final para definir uma constante
	
	
	
	AreaCirc(double raioInicial){
		
		raio = raioInicial;
	}
	
	double area() {
		return PI*Math.pow(raio, 2);
	}
	
	
	static double area (double raio) {
		return PI*Math.pow(raio, 2);
	}

}
