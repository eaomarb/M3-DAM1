//5. Escriu un programa que demani 3 número
//i els mostri ordenats de major a menor.

import java.util.*;

public class A2_5 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.print("Número 1: ");
		int n1 = teclat.nextInt();
		System.out.print("Número 2: ");
		int n2 = teclat.nextInt();
		System.out.print("Número 3: ");
		int n3 = teclat.nextInt();

		if (n1 > n2) {
			if (n1 > n3) {
				if (n2 > n3) {
					System.out.println(n1 + ", " + n2 + ", " + n3);
				} else {
					System.out.println(n1 + ", " + n3 + ", " + n2);
				}
			} else {
				System.out.println(n3 + ", " + n1 + ", " + n2);
			}
		} else {
			if (n1 < n3) {
				if (n2 < n3) {
					System.out.println(n3 + ", " + n2 + ", " + n1);
				} else {
					System.out.println(n2 + ", " + n3 + ", " + n1);
				}
			} else {
				System.out.println(n2 + ", " + n1 + ", " + n3);
			}
		}
	}
}
