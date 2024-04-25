//Donats dos nombres enters n1 i n2 amb n1 < n2 ,
//escriu tots els nombres enters dins l’interval [n1, n2] en ordre decreixent.

import java.util.*;

public class A6_1 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Introdueix el primer número: ");
		int n1 = teclat.nextInt();
		
		System.out.println("Introdueix el segon número: ");
		int n2 = teclat.nextInt();
		
		System.out.println("Interval:");
		while (n1 <= n2) {
			System.out.println(n2--);
		}
	}
}
