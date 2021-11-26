package fundamentos.labs;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor da base");
		double base = scanner.nextDouble();
		System.out.println("Informe o valor da altura");
		double altura = scanner.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.println("A area é: "+area);
		scanner.close();

	}

}
