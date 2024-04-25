//Es demana un nombre enter positiu per teclat i s'ha de dir si el número té 1, 2, 3, 4 o més dígits

import java.util.*;

public class A4_6 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix un número enter positiu.");
		int n1 = teclat.nextInt();

		if (n1 / 10 < 1) {
			System.out.println("1 dígit");
		} else if (n1 / 10 <= 10) {
			System.out.println("2 dígits");
		} else if (n1 / 10 <= 100) {
			System.out.println("3 dígits");
		} else if (n1 / 10 <= 1000) {
			System.out.println("4 dígits");
		} else {
			System.out.println("El número és major de 4 dígits");
		}

	}

}
