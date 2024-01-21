//3. Escriu un programa que demani un nombre enter i determini si és múltiple de 2 i/o de 5.

import java.util.*;

public class A2_3 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Número: ");
		int num = teclat.nextInt();
		teclat.close();

		if (num % 5 == 0) {
			if (num % 2 == 0) {
				System.out.println("Múltiple de 5 i de 2.");
			} else {
				System.out.println("Múltiple de 5");
			}
		} else if (num % 2 == 0) {
			System.out.println("Múltiple de 2");
		} else {
			System.out.println("No és múltiple ni de 2 ni de 5.");
		}
	}
}
