/*
 * Realizar un programa que solicite dos números por teclado e imprima en pantalla si son iguales, el
primero mayor que el segundo o el primero más pequeño que el segundo.
 */

import java.util.Scanner;

public class Ejercicio2Relacion1 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// variables
		float numero1;
		float numero2;
		
		System.out.println("Introduce el primero de los numeros: ");
		numero1 = Float.parseFloat(teclado.nextLine());
		System.out.println("Introduce el segundo de los numeros: ");
		numero2 = Float.parseFloat(teclado.nextLine());
		
		if(numero1==numero2) {
			System.out.println("Ambos numeros son iguales");
		}
		else {
			if(numero1>numero2) {
				System.out.println("El numero "+numero1+ " es mayor que el numero "+numero2);
			}
			else {
				System.out.println("El numero "+numero1+ " es menor que el numero "+numero2);
			}
		}
	}

}
