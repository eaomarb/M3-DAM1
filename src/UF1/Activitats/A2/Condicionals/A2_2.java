//2. Escriu un programa que demani un número i digui si és parell o senar.

import java.util.*;

public class A2_2 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		int num;

		System.out.println("Introdueix un nombre enter: ");
		num = teclat.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " és parell.");
		} else {
			System.out.println(num + " és senar.");
		}
	}
}
