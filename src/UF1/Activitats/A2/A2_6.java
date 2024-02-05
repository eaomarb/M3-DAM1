//Escriu un programa que demani 3 números
//i digui si el tercer correspon a la suma del primer i el segon.

import java.util.*;

public class A2_6 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.print("Número 1: ");
		int n1 = teclat.nextInt();
		System.out.print("Número 2: ");
		int n2 = teclat.nextInt();
		System.out.print("Número 3: ");
		int n3 = teclat.nextInt();
		
		if (n3 == n1 + n2) {
			System.out.println(n3 + " correspon a " + n1 + " + " + n2);
		} else {
			System.out.println(n3 + " no correspon a " + n1 + " + " + n2);
		}
	}
}
