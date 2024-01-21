//Ens entren un número per teclat, dir si és múltiple de 10.

import java.util.Scanner;

public class A4_3 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix un numero: ");
		int num1 = teclat.nextInt();

		teclat.close();

		if (num1 % 10 == 0) {
			System.out.println(("El número: ") + num1 + (", es multiple de 10"));
		}

		else {
			System.out.println(("El número: ") + num1 + (", no es multiple de 10"));
		}

	}

}
