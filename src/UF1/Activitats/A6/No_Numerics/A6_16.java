/*Fer un programa en el qual l'usuari vagi inserint números i cada vegada que insereix un número demani
 * si en vol inserir més. Quan l'usuari acabi d'inserir els números, mostrar la suma de tots els números inserits.
 */

import java.util.*;

public class A6_16 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Escriu un número: ");
		int num = teclat.nextInt();

		System.out.println("Vols continuar? (S/N)");
		String continuar = teclat.next();

		int suma = num;

		while (continuar.equalsIgnoreCase("S")) {
			System.out.println("Escriu un número: ");
			num = teclat.nextInt();
			suma = suma + num;
			System.out.println("Vols continuar? (S/N)");
			continuar = teclat.next();
		}
		if  (continuar.equalsIgnoreCase("N")) {
			System.out.println(suma);
		}
		if (!continuar.equalsIgnoreCase("S") || !continuar.equalsIgnoreCase("N")) {
			System.out.println("Això no és una resposta valida.");
		}
	}
}
