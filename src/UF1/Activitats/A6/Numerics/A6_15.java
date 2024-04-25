//Donats dos nombres enters n1 i n2 amb n1 < n2 i un nombre enter x,
//escriu x nombres enters aleatoris dins l’interval [n1 , n2]. 

import java.util.*;

public class A6_15 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix el primer número: ");
		int n1 = teclat.nextInt();
		System.out.println("Introdueix el segon número: ");
		int n2 = teclat.nextInt();

		System.out.println("Quants nombres aleatoris vols?");
		int nombres = teclat.nextInt();

		teclat.close();
		
		int i = 1;
		
		while (i <= nombres) {
			System.out.println(Math.round((Math.random() * (n2 - n1)) + n1));
			i++;
		}
	}
}
