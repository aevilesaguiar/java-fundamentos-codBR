package fundamentos.operadores.labs;

public class DesafioLogico {

	public static void main(String[] args) {
		//Trabalho na ter�a(v || f)
		//Trabalho na quinta(v || f)
		
		//se os 2 trabalhos forem true = televis�o 50"
		//se apenas 1 trabalho der certo comprara televis�o de 32"
		//se compra 32 ou 50 vai tomar sorvete
		//se nenhum trabalho deu certo n�o tem sorvete ficar em casa
		
		boolean trabalho1 = !true;
		boolean trabalho2 = !true;
		
		if(trabalho1==true && trabalho2==true) {
			System.out.println("Comprar tv 50 polegadas e tomar sorvete");
		}else if(trabalho1==true && trabalho2==!true || trabalho1==!true && trabalho2==true) {
			System.out.println("Comprar televis�o de 32 polegadas e tomar sorvete");
			
		}else {
			System.out.println("Ficar em casa!");
		}
		
		
			
	}

}
