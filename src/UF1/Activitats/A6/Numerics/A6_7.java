/* Donats el primer número, la diferència i el nombre de números d'una
	 progressió aritmètica, escriu els seus elements, la seva suma i la seva
	 mitjana aritmètica. ℹ️ En una progressió aritmètica cada número és igual a
	 l'anterior més la diferència. 
*/

import java.util.Scanner;

public class A6_7 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix un nombre enter: ");
		int n1 = teclat.nextInt();
		System.out.println("Introdueix la diferència: ");
		int diferencia = teclat.nextInt();
		System.out.println("Introdueix el nombre de números: ");
		int numeros = teclat.nextInt();

		teclat.close();

		int i = 0;
		int element = n1 + i * diferencia;
		while (i < numeros) {
			System.out.print(element + " ");
			i++;
		}
		
		while (i < numeros) {
			System.out.print(element);
		}
	}
}
