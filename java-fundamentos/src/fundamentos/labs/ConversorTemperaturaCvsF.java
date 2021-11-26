package fundamentos.labs;

import java.util.Scanner;

public class ConversorTemperaturaCvsF {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura Farenheit:");
		
		double tempF= scanner.nextDouble();
		
		double convFC=(tempF-32)/1.8;
		
		System.out.printf("A temperatura em Celcius é: %.2f",convFC);
		
		scanner.close();
		
		
	}

}
