/*
 * Una pastelería nos ha pedido realizar un programa que calcule el presupuesto de las tartas que
fabrica.
◦ El programa preguntará primero de qué tipo quiere la tarta (M- Manzana, F-Fresa o C-Chocolate).
La tarta de manzana vale 12 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate, el
programa debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14
euros y la segunda 15.
◦ Por último, en cualquiera de los tipos de tarta, se pregunta si se añade nata y si se personaliza con
un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
◦ Para simplificar el ejercicio, puede suponerse que los datos de entrada son correctos, es decir, no
debe validarse ningún dato de entrada.
 */

import java.util.Scanner;

public class Ejercicio10Relacion1 {
	
	//constantes
	private static final float PRECIO_NATA = 2.5f;
	private static final float PRECIO_NOMBRE = 2.75f;
	private static final float PRECIO_MANZANA = 12;
	private static final float PRECIO_FRESA = 16;
	private static final float PRECIO_CHOCOLATE_BLANCO= 15;
	private static final float PRECIO_CHOCOLATE_NEGRO= 14;
	
	
	private static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// variables
		
		char respuesta; 
		float coste;
		char seleccionChocolate;
		char respuestaNata;
		char respuestaNombre;
		coste = 0;
		
		System.out.println("Bienvenido escoja el sabor de su tarta( M- Manzana, F-Fresa o C-Chocolate): ");
		respuesta = teclado.next().charAt(0);
		
		
		switch (respuesta ) {
			case 'M':
				System.out.println( " Has seleccionado la tarta de manzana, el precio es  "+PRECIO_MANZANA+ " euros");
				coste = PRECIO_MANZANA;
				break;
			case 'F':
				System.out.println( " Has seleccionado la tarta de fresa, el precio es  "+PRECIO_FRESA+ " euros");
				coste = PRECIO_FRESA;
				break;
			case 'C':
				System.out.println(" Has seleccionado la tarta de chocolate escoja entre chocolate negro o blanco(N o B)");
				seleccionChocolate = teclado.next().charAt(0);
				if (seleccionChocolate == 'N') {
					System.out.println(" Selección de la tarta de chocolate negro , el precio es de: "+PRECIO_CHOCOLATE_NEGRO+ " euros");
					coste = PRECIO_CHOCOLATE_NEGRO;
				}
				else {
					System.out.println(" Selección de la tarta de chocolate blanco , el precio es de: "+PRECIO_CHOCOLATE_BLANCO+ " euros");
					coste = PRECIO_CHOCOLATE_BLANCO;
		}
				break;
	}
		System.out.println("Quiere añadir nata a su tarta (SI='S', NO='N'): ");
		respuestaNata = teclado.next().charAt(0);
		
		if (respuestaNata== 'S') {
			System.out.println(" Se añadirá nata , tiene un coste adicional de "+PRECIO_NATA+ " euros");
			coste = coste + PRECIO_NATA;
		}
		System.out.println("Quiere añadir su nombre en su tarta (SI='S', NO='N'): ");
		respuestaNombre = teclado.next().charAt(0);
		
		if (respuestaNombre=='S') {
			System.out.println(" Se añadirá su nombre , tiene un coste adicional de "+PRECIO_NOMBRE+ " euros");
			coste = coste + PRECIO_NOMBRE;
		}
		System.out.println( " Su tarta tendrá un coste final de: " +coste+ " euros");
	}
}

