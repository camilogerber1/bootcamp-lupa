import java.util.Scanner;


public class Ejercicio6{
	
	public static void main (String[] args) {
		int arr[] = {2,5,1,435,4576,4,2,6,7,123,431,12,64,21,1,3,6,1,35,6,7,10,55,32,66,76,123,544,223,459,2};
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int numero= entrada.nextInt();
		
		int cont= 0;
		String posicion= "";
		
		for (int i= 0; i < arr.length; i++){
			if ( arr[i] == numero){
				cont++;
				posicion += i+",";
				}
			}
		if (cont !=0){
			System.out.println("El numero se encuentra en el arreglo");
			System.out.print("El numero aparece en el arreglo "+ cont +" veces, ");
			System.out.println("en las posiciones :" +posicion);
		}else {
				System.out.println("El numero no se encuentra en el arreglo");
				}
	
}
}

