package fundamentos.labs;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura Celsius:");
		
		double tempC= scanner.nextDouble();
		
		double convF=(tempC*1.8)+32;
		
		System.out.printf("A temperatura em Farenheit é: %.2f",convF);
		
		scanner.close();
		
		
	}

}
