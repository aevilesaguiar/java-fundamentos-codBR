package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o numero");
		double num1 = scanner.nextDouble();
		
		System.out.println("Insira o numero");
		double num2 = scanner.nextDouble();
		
		System.out.println("Informe a operação:");
		String op = scanner.next();
		
		
		//lógica
		
		double resultado ="+".equals(op)?num1+num2:0;
		resultado ="-".equals(op)?num1-num2:resultado;
		resultado ="*".equals(op)?num1*num2:resultado;
		resultado ="/".equals(op)?num1/num2:resultado;
		
		System.out.printf("%.2f %s %.2f =%.2f", num1, op, num2, resultado);
		
		scanner.close();
		
		

	}

}
