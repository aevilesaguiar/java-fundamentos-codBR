package fundamentos.conversao;

import java.util.Scanner;


public class DesafioConversao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3 salarios do funcionario:");
		String salario1=scanner.nextLine().replace(",", ".");//se o usuario digitar virgula ele substitui para ponto
		String salario2=scanner.nextLine().replace(",", ".");
		String salario3=scanner.nextLine().replace(",", ".");
		
		
		double sal1=Double.parseDouble(salario1);
		double sal2=Double.parseDouble(salario2);
		double sal3=Double.parseDouble(salario3);
		
		double mediasal = (sal1 + sal2+sal3)/3;
		System.out.println("Media salarial: "+mediasal);
		
		
		
		
		
		
		
		
		

	}

}
