package estruturaDeControles.lab;

import java.util.Scanner;


public class Semana {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do dia da semana");
		String dia=scanner.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia)){
			System.out.println(2);
		}else if("ter�a".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}else if("sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}
		
		scanner.close();
			
	}

}
