//Donats dos nombres enters n1 i n2 amb n1 < n2, calcula quants parells hi ha dins de l’interval [n1 , n2].

import java.util.Scanner;

public class A6_5 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix el primer número: ");
		int n1 = teclat.nextInt();
		System.out.println("Introdueix el segon número: ");
		int n2 = teclat.nextInt();

		int comptador = 0; // Comptador de parells

		while (n1 <= n2) {
			if (n1 % 2 == 0) {
				comptador++;
			}
			n1++;
		}

		System.out.println("Hi ha " + comptador + " parells dins de l'interval [" + n1 + ", " + n2 + "].");
	}
}
