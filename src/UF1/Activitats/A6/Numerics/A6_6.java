//Donats dos nombres enters positius a i b, calcula el resultat de realitzar la seva multiplicació a partir de sumes.

import java.util.*;

public class A6_6 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introduex el 1r número: ");
		int a = teclat.nextInt();
		System.out.println("Introdueix el 2n número: ");
		int b = teclat.nextInt();

		// a * b = a + a + a + … + a (a sumat b vegades) //
		int resultat = 0;

		while (b > 0) {
			resultat += a;
			b--;
		}

		System.out.println("El resultat de la multiplicacio es: " + resultat);
	}
}
