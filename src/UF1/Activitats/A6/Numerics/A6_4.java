//Donat un nombre enter positiu, escriu els seus divisors positius.

import java.util.*;

public class A6_4 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix un nombre enter: ");
		int num = teclat.nextInt();
		
		int i = 1;

		while (i <= num) {
			if (num % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
