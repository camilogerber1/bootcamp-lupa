
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main (String[] args) {
		double catetoOp;
		double catetoAd;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la longitud del cateto opuesto ");
		catetoOp = entrada.nextFloat();
		
		System.out.print("Ingese la longitud del cateto adyacente ");
		catetoAd = entrada.nextFloat();
		
		double hipotenusa= (Math.pow(catetoOp, 2.00)) + (Math.pow(catetoAd, 2.00));
		System.out.print("La hipotenusa es: "+Math.sqrt(hipotenusa));

	}
}

