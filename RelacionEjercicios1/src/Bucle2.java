import java.util.Scanner;

public class Bucle2 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		//variables
		
		int numeroVeces;
		int contador;
		
		System.out.println("¿Cuántas veces quieres que te salude?");
		numeroVeces = Integer.parseInt(teclado.nextLine());
		
		contador = 1;
		
		while(contador<=numeroVeces) {
			System.out.println("Hola");
			contador=contador + 1;
		}
	}

}
