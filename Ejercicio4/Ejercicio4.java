/*
 * Ejercicio4.java
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

public class Ejercicio4 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		float velocidad;
		float conversion;
		System.out.print("Ingrese los Km/h para convertirlos a m/s: "); 
		velocidad = entrada.nextFloat();
		
		conversion= velocidad / 3.6f;
		
		System.out.print(velocidad + " Km/h son " + conversion + " m/s");
		
	}
}

