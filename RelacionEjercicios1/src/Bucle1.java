import java.util.Scanner;

public class Bucle1 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// variables
		int numeroVeces;
		
		System.out.println("¿Cuántas veces quieres que te salude?");
		numeroVeces = Integer.parseInt(teclado.nextLine());
		
		while(numeroVeces>0) {
			System.out.println("Hola");
			numeroVeces=numeroVeces - 1;
		}

	}

}
