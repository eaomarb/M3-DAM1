//1. Escriviu un programa que mostri un menú amb diverses opcions: 
//    - Calcular l'àrea d’un rectangle.
//    - Calcular l’àrea d’un triangle.
//    - Calcular l’àrea d’un cercle.

import java.util.Scanner;

public class A4_2 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		// Calcular l'àrea d’un rectangle.
		System.out.println("Introdueix la base d'un rectangle: ");
		int baseR = teclat.nextInt();

		System.out.println("Introdueix l'altura d'un rectangle: ");
		int alturaR = teclat.nextInt();

		int area1 = baseR * alturaR;
		System.out.println("L'area del rectangles es: " + area1);

		// Calcular l’àrea d’un triangle.

		System.out.println("Introdueix la base d'un triangle");
		int baseT = teclat.nextInt();

		System.out.println("Introdueix l'altura d'un triangle");
		int alturaT = teclat.nextInt();

		int area2 = (baseT * alturaT) * 2;
		System.out.println("L'altura del triangles es: " + area2);

		// Calcular l’àrea d’un cercle

		System.out.println("Introdueix el radi: ");
		double radi = teclat.nextDouble();

		double area3 = Math.PI * Math.pow(radi, 2);
		System.out.println("L'area del cercle es: " + area3);

		teclat.close();
	}

}
