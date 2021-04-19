/*
 * Ej1.java
 * 
 * Copyright 2021  <pi@raspberrypi>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Ej1 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.print("Por favor ingrese un numero: "); //si se ingresa -1 como primer valor, el programa no finalizara.
		numero = entrada.nextInt();
		ArrayList lista = new ArrayList();
		int numMen= numero, numMay= numero, sumTotal= 1, sumaP= 0, sumaN= 0, promedio= 0, cont= 0;
		
		do {
			if (numero > numMay){
				numMay= numero;}
			if (numero <  numMen){
				numMen= numero;}
			if (numero > 0){
				sumaP += numero;}
			if (numero < 0){
				sumaN += numero;}
			lista.add(numero);
			System.out.print("Por favor ingrese otro numero: ");
			numero= entrada.nextInt();
			sumTotal += numero;
			cont++;
			
		}while (numero != -1);
		
		promedio= sumTotal / cont;
		
			
		System.out.print("El numero mayor es: " + numMay + 
		"\n El numero menor es: " + numMen + 
		"\n La suma total es: " + sumTotal + 
		"\n La suma de los numeros positivos es: " + sumaP +
		"\n La suma de numeros negativos es :" +sumaN + 
		"\n El promedio es: " + promedio);
}
}





