/*9. Escriu un programa que demani els anys treballats d’un treballador
que cobra 40.000 euros anuals i digui el sou que li correspon
segons els següents criteris:

A. Si porta treballant 10 anys o més → augment del 10%
B. Si porta treballant menys de 10 anys, però 5 o més → augment del 7%
C. Si porta treballant menys de 5 anys, però 3 o més → augment del 5%
D. Si porta menys de 3 anys → augment del 3%
*/

import java.util.*;

public class A2_9 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		int souInicial = 40000;

		System.out.println("Quants anys portes treballant? ");
		int anys = teclat.nextInt();

		if (anys >= 10) {
			System.out.println("El teu nou sou és de: " + souInicial * 1.10);
		} else if (anys < 3) {
			System.out.println("El teu nou sou és de: " + souInicial * 1.03);
		} else if (anys < 5) {
			if (anys >= 3) {
				System.out.println("El teu nou sou és de: " + souInicial * 1.05);
			}
		}
		if (anys < 10) {
			if (anys >= 5) {
				System.out.println("El teu nou sou és de: " + souInicial * 1.07);
			}
		}
	}
}
