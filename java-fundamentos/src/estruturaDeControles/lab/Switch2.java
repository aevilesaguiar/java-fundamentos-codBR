package estruturaDeControles.lab;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String conceito="";
		
		System.out.println("Informe a nota:");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito="A";
			break;
			
		case 8: 
			conceito="B";
			break;
			
			
		case 7: case 6:
			conceito="C";
			break;
			
		case 5: case 4:
			conceito="D";
			break;
		case 3: case 2:case 1:
			conceito="E";
			break;
			
		default:
			conceito="Não onformado";
		}
		
				System.out.println("Conceito é:"+conceito);
				entrada.close();
	}

}
