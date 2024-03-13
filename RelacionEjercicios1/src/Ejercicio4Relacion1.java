/*
 * Realizar un programa que lea la edad de una persona menor a 100 años e informe de si es un niño (0-
12 años), un adolescente (13-17), un joven (18-29) o un adulto.
 */

import java.util.Scanner;

public class Ejercicio4Relacion1 {
	
//	constantes
	private static final int LIMITE_NINNO = 12;
	private static final int LIMITE_ADOLESCENTE = 17;
	private static final int LIMITE_JOVEN = 29;
	private static final int EDAD_MAXIMA = 99;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// variables
		int edad;
		
		System.out.println("Introduce la edad, máximo " +EDAD_MAXIMA);
		edad = Integer.parseInt(teclado.nextLine());
		
		if (edad<0 || edad>EDAD_MAXIMA) {
			System.out.println("Edad incorrecta ");
		}
		else {
			if (edad<= LIMITE_NINNO) {
				System.out.println("Es un niño ");
			}
			else {
				if (edad<= LIMITE_ADOLESCENTE) {
					System.out.println("Es un adolescente ");
				}
				else {
					if(edad<=LIMITE_JOVEN) {
						System.out.println("Es un joven");
					}
					else {
						System.out.println("Es un adulto ");
					}
				}
			}
		}

	}

}
