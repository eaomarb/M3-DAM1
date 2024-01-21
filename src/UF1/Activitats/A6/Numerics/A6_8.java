//3. Donat un nombre enter positiu, calcula el nombre de xifres que té.

import java.util.*;

public class A6_8 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		int nombre;
		int i = 10;
		int xifres = 1;

		System.out.println("Introdueix un nombre: ");
		nombre = teclat.nextInt();

		while (i <= nombre) {
			i *= 10;
			xifres++;
		}

		System.out.println("El nombre " + nombre + " te " + xifres + " xifres");
	}
}
