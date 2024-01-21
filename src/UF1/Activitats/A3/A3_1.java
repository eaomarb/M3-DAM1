// 1. Escriu un programa que demani 2 números i digui si els dos són parells,
// o un o els dos són senars.

import java.util.Scanner;

public class A3_1 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		// Demanem els els 2 números
		System.out.println("Introdueix el primer número: ");
		int n1 = teclat.nextInt();
		System.out.println("Introdueix el segon número: ");
		int n2 = teclat.nextInt();

		if (n1 % 2 == 0 && n2 % 2 == 0) {
			System.out.println("Els dos números són parells.");
		} else if (n1 % 2 == 0 || n2 % 2 == 0) {
			System.out.println("Un dels números és parell i l'altre és senar.");
		} else {
			System.out.println("Tots dos números són senars.");
		}
	}
}