// Ens entren una edat per teclat, dir si és major que 16 i menor que 21.

import java.util.Scanner;

public class A4_4 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix un numero: ");
		int num = teclat.nextInt();

		teclat.close();

		if (num >= 16 && num <= 21) {
			System.out.println("Es major que 16 i menor que 21");
		}

		else {
			System.out.println("Es menor que 16 o major que 21");
		}

	}

}
