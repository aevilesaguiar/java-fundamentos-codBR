package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2"=="2");
		
		String s = new String("2");
		System.out.println("2"==s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner (System.in);
		
		String s2=entrada.next();//next tira os espa�os em branco next line n�o
		System.out.println("2"== s2.trim());//trim remove espa�os em branco
		System.out.println("2".equalsIgnoreCase(s2));
		
		
		//comparar string � com equals
		entrada.close();
		
	}

}
