import java.util.Scanner;

public class MaquinaCafe {
	// Constantes

			private static final float PRECIO_BASE = 1;
			private static final float SUPLEMENTO_LECHE = 0.3f;
			private static final float SUPLEMENTO_AZUCAR = 0.1f;

		
		private static Scanner teclado = new Scanner(System.in);
		
	public static void main(String[] args) {
		// variables
		float precio;
		char respuesta;
		
		System.out.println("Bienvenido a la máquina: ");
		precio= PRECIO_BASE;
		System.out.println("¿Deseas incluirle leche(S/N)? ");
		respuesta = teclado.next().charAt(0);
		
		if(respuesta== 'S') {
			precio = precio + SUPLEMENTO_LECHE;
		}
		
		System.out.println("¿Deseas incluirle azucar(S/N)? ");
		respuesta = teclado.next().charAt(0);
		
		if(respuesta== 'S') {
			precio = precio + SUPLEMENTO_AZUCAR;
		}
		
		
		System.out.println("El precio es: " +precio);
	}

}
