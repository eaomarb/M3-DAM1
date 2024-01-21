/*Entrar dades d’alumnat d’un centre demanant per teclat:
 · Nom
 · Curs
 · Sexe
 Després ha de preguntar "Vols entrar més dades? (s/n)"
 S'han de validar les dades:
 El curs ha d'estar entre 1 i 3.
 El sexe ha de ser "H" o "M".
 */

import java.util.*;

public class A7_2 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Vols entrar un alumne? (S/N)");
		String entrar = teclat.next();

		int alumne = 1;
		String nom;
		int curs = 0;
		String sexe;

		while (entrar.equalsIgnoreCase("S")) {
			System.out.println("Alumne " + alumne);
			
			System.out.println("Nom: ");
			nom = teclat.next();
			
			System.out.println("Curs: ");
			curs = teclat.nextInt();
			
			while (curs < 1 || curs > 3) {
				System.out.println("El curs ha d'estar entre 1 i 3");
				System.out.println("Curs: ");
				curs = teclat.nextInt();
			}

			System.out.println("Sexe: (H/M)");
			sexe = teclat.next();

			if (!sexe.equalsIgnoreCase("H") && !sexe.equalsIgnoreCase("M")) {
				System.out.println("El sexe ha de ser H o M");
			}

			alumne++;
			System.out.println("Vols entrar un alumne? (S/N)");
			entrar = teclat.next();
		}

		if (entrar.equalsIgnoreCase("N")) {
			System.out.println("Total alumnes: " + (alumne - 1));
		}
	}
}
