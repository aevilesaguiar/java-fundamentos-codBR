package fundamentos.tipos;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		// Math.pow(a,3);

		double x = (6*(3+2));
		double y=Math.pow(x, 2);
		double z =y/(3*2);
		
		double a = (((1-5)*(2-7))/2);
		double b = Math.pow(a, 2);
		
		double xyzab=z-b;
		double xyzabt=Math.pow(xyzab, 3);
		double den=Math.pow(10, 3);
		double total = xyzabt/den;
		
		
		System.out.println(total);
	}

}
