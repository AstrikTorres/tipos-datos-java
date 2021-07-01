
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Tipos de datos en Java.
		 * Numericos: byte, short, int, long, float, double
		 * Booleanos (verdadero, falso): boolean
		 * Caracteres: char
		 * Cadenas: String
		 */
		
		/* Conversion de datos numericos
		   byte -> short -> int -> long -> float -> double 
		   Esta conversion no se puede hacer a la inversa  */
		
		/*
		 * byte = 8 bits
		 * short = 16 bits
		 * int = 32 bits
		 * long = 64 bits
		 */
		
		byte numeroPequeno = 122;
		byte otroNumeroPequeno = 122;
		int suma = numeroPequeno + otroNumeroPequeno;
		
		int numero1 = 1000;
		long numero2 = numero1;
		float numero3 = numero2;
				
		System.out.println(numero1);
		System.out.println(numero2);	
		System.out.println(numero3);	
		System.out.println(suma);
	}

}
