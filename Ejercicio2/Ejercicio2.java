
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		
		int cont= 0;
		
		List<Integer> lista1;
		lista1 = new ArrayList<>();
		
		List<Integer> lista2;
		lista2 = new ArrayList<>();
		
		List<Integer> lista3;
		lista3 = new ArrayList<>();
		
		Random aleatorio = new Random();
		int largo1 = 4 + aleatorio.nextInt(10);
		int largo2 = 9 + aleatorio.nextInt(10);
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println(largo1);
		System.out.println(largo2);
		
		while (cont <= largo1){
			cont ++;
			System.out.println("Ingresá un numero entre 50 y 550: ");
			numero= entrada.nextInt();
				if ((numero >=50)  && (numero <= 550)) {
					lista1.add(numero);
				}
				else { System.out.println("El número no esta en el rango esperado.");}
			}
			System.out.println(lista1);
			
				while (cont <= largo2){  //Creo otro while porque sino los elementos coinciden si o si.
			cont ++;
			System.out.print("Ingresá un numero entre 50 y 550: ");
			numero= entrada.nextInt();
				if ((numero >=50)  && (numero <= 550)) {
					lista2.add(numero);
				}
				else { System.out.println("El número no esta en el rango esperado.");}
			}
			System.out.print(lista2);
			
			for (int i=0; i <= cont; i++){
				 if (lista1.get(i) == lista2.get(i)){
					 lista3.add(i);
					 }
				}

			
			System.out.print(lista3);
			
	
		
		
	}
}

