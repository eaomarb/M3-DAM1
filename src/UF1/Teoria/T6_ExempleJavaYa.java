import java.util.Scanner;

public class T6_ExempleJavaYa {
	
	/*
	 * Realitzar un programa que llegeixi per teclat dos números:
	 *  - Si el primer és major que el segon calcular la seva suma i diferencia, 
	 *  - En cas contrari informar el producte i la divisió 
	 * 			del primer respecte al segon.
	 */

	public static void main(String[] args) {
		// VARIABLES
		int a = 0;
		int b = 0;
		
		// Demanem els numeros a l'usuari
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix un numero: ");
		a = teclat.nextInt();
		
		System.out.println("Introdueix un altre numero: ");
		b = teclat.nextInt();
		
		// si el primer és major que el segon informar la suma i diferencia 
		if (a > b) {
			System.out.println("La suma: " + (a+b));
			System.out.println("La diferencia: " + (a-b));
		} else { // en cas contrari el producte i la divisio
			System.out.println("El producte: " + (a*b));
			System.out.println("La divisio: " + (a/b));
		}
	}
}