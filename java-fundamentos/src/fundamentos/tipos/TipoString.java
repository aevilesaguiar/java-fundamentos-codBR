package fundamentos.tipos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá pessoal".charAt(0));
	
		String s= "Boa tarde";
		System.out.println(s.toUpperCase());

		System.out.println(s.concat("!!"));
		
		System.out.println(s+"!!!");
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Boa "));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
	}

}
