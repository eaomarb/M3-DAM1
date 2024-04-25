/*1. Escriu un programa que demani tres números per pantalla
i desi el número més gran en una variable anomenada **gran**
i el més petit en una variable anomenada **petit**.*/

import java.util.*;

public class A2_1 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix el primer número: ");
		int n1 = teclat.nextInt();

		System.out.print("Introdueix el segon número: ");
		int n2 = teclat.nextInt();

		System.out.println("Introdueix el tecer número: ");
		int n3 = teclat.nextInt();

		int gran = 0;
		int petit = 0;

		// Mirem el número més gran
		// Comparem n1 amb n2 i n3
		if (n1 > n2) {
			if (n1 > n3) {
				gran = n1;
			}
		} else if (n2 > n1) {
			if (n2 > n3) {
				gran = n2;
			}
		}
		// Si n1 és més petit que n2 i n3 comparem n3 amb n1 i n2
		if (n3 > n1) {
			if (n3 > n2) {
				gran = n3;
			}
		}

		// Mirem el número més petit
		// Comparem n1 amb n2 i n3
		if (n1 < n2) {
			if (n1 < n3) {
				petit = n1;
			}
		} else if (n2 < n1) {
			if (n2 < n3) {
				petit = n2;
			}
		}
		// Si n1 és més gran que n2 i n3 comparem n3 amb n1 i n2
		if (n3 < n1) {
			if (n3 < n2) {
				petit = n3;
			}
		}

		System.out.println("Gran: " + gran);
		System.out.println("Petit: " + petit);
	}
}