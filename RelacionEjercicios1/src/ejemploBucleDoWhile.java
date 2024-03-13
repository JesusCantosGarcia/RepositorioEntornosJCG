import java.util.Scanner;

public class ejemploBucleDoWhile {

	private static Scanner teclado = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		// variables
		
		int edad;
		
		do {
			System.out.println("Introduce la edad: ");
			edad = Integer.parseInt(teclado.nextLine());
		} while(edad <=0 || edad> 100);

		if (edad>=18) {
			System.out.println("Mayor de edad");
		}
		else {
			System.out.println("Menor de edad ");
		}
	}

}
