package fundamentos.conversao;

public class ConversaoTiposPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1;//conversao impl�cita
		System.out.println(a);
		
		float b = (float) 1.9999625555;//explic�ta (CAST)
		
		System.out.println(b);
		
		
		//java n�o olha valores ele olha os tipos
		float c = 4;
		byte d= (byte) c;
		System.out.println(d);
		
		
	}

}
