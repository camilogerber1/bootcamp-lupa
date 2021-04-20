import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {
	
	public static void main (String[] args) {
		List <Integer> numeros = new ArrayList<>();
		List <Integer> random = new ArrayList<>();
		
		Random aleatorio = new Random();
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		int n2;
		
		System.out.print("Introduzca un numero entre 1 y 49: ");
		
		for (int i=0; i<4; i++){
			System.out.print("Elije un numero: ");
			n = entrada.nextInt();
			if (n != numeros.get(i)){
				numeros.add(n);
			}else {
				System.out.println("El numero ya a sido ingresado");
			}
			
			n2 = 1 + aleatorio.nextInt(49);
			random.add(n2);
		}
		System.out.println(numeros);
		System.out.println(random);
		
	}
}
