/*
 * Realizar un programa que lea un número por teclado. El programa debe imprimir en pantalla un
mensaje con “El número xx es múltiplo de 2” o un mensaje con “El número xx es múltiplo de 3”. Si es
múltiplo de 2 y de 3 deben aparecer los dos mensajes. Si no es múltiplo de ninguno de los dos el
programa finaliza sin mostrar ningún mensaje.
 */

import java.util.Scanner;

public class Ejercicio3Relacion1 {
	
	// Constantes

		private static final int DIVISOR_1 = 2;
		private static final int DIVISOR_2 = 3;

	
	private static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// variables
		
		int numero;
		System.out.println("Introduzca un numero: ");
		numero = Integer.parseInt(teclado.nextLine());
		
		if (numero%DIVISOR_1==0) {
			System.out.println("El número "+numero+ " es divisor de "+DIVISOR_1);
		}
		if (numero%DIVISOR_2==0) {
			System.out.println("El número "+numero+ " es divisor de "+DIVISOR_2);
		}
	}


}
