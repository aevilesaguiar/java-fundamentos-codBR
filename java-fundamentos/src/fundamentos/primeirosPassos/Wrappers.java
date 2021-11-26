package fundamentos.primeirosPassos;

public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrappers versão orientada para objetos dos tipos primitivos

		Byte b = 100;
		Short s = 100;
		Integer i = 100;
		Long l = 1000000000L;
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		
		Float f = 123.0F;
		System.out.println(f);
		
		
		Double d = 123.456798;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
	}

}
