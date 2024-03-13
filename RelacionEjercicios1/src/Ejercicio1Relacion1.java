/*
 * Realizar un programa que lea un número entero por teclado e informe de si el número es par o impar
(el cero se considera par).
 */

import java.util.Scanner;

public class Ejercicio1Relacion1 {

	
	private static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//variables
		
		int numero;
		
		System.out.println("Introduzca un numero: ");
		numero = Integer.parseInt(teclado.nextLine());
		
		if (numero%2==0) {
			System.out.println("El número "+numero+" es par");
	}
		else {
			System.out.println("El número "+numero+" es impar");
		}
 }
}