import java.util.Scanner;

public class T5_Condicionals {

	public static void main(String[] args) {
		/*
		 * CONDICIONALS
		 */
		
		//SINTAXI CONDICIONAL SIMPLE
		/*
		 * if (condicio) {
		 * 		Accions si es compleix la condició
		 * }
		 */
		
		// SINTAXI CONDICIONAL COMPOST
		/*
		 * if (condicio) {
		 * 		Accions si es compleix la condició
		 * } else {
		 * 		Acciones si NO es compleix la condició
		 * }
		 */
		
		// CONDICIONAL COMPOST ANIUAT
		/*
		 * if (condicio A) {
		 * 		SI ES COMPLEIX LA CONDICIO A
		 * 		S'EXECUTEN LES ACCIONS DINS D'AQUESTES CLAUS
		 * } else if (condicio B) {
		 * 		SI NO ES COMPLEIX LA CONDICIO A... PERO SI ES COMPLEIX LA CONDICIO B
		 * } else if (condicio C) {
		 * 		SI NO ES COMPLEIX NI LA CONDICIO A NI LA B... PERO SI ES COMPLEIX LA CONDICIO C
		 * }
		 * .
		 * .
		 * .
		 * } else {
		 * 		SI NO SE COMPLEIX CAP DE LES CONDICIONS ANTERIORS
		 * }
		 */
		
		/*
		 * OPERADORS RELACIONALS
		 * 
		 * < MENOR QUE
		 * > MAJOR QUE
		 * <= MENOR O IGUAL QUE
		 * >= MAJOR O IGUAL QUE
		 * == IGUAL
		 * != DIFERENT
		 */
		
		Scanner teclat = new Scanner(System.in);
		//System.out.println("Introdueix el teu sou:");
		
		//double sou = teclat.nextDouble();
		
		/*if (sou > 2000) {
			System.out.println("Et toca pagar!");
		} else {
			if (sou > 1000) {
				System.out.println("Et toca fer un bizum");
			} else {
				System.out.println("Et convidem");
			}
		}
		
		if (sou > 2000) {
			System.out.println("Et toca pagar!");
		} else if (sou > 1000) {
			System.out.println("Et toca fer un bizum");
		} else {
			System.out.println("Et convidem");
		}*/
		
		int nota = 0;
		
		System.out.println("Introdueix la nota de M3 (sense decimals): ");
		nota = teclat.nextInt();
		
		if (nota < 0) { 
			// NOTA NEGATIVA
			System.out.println("Nota incorrecta");
		} else if (nota < 5) { 
			// NOTA ENTRE 0 i 4.9999
			System.out.println("SUSPES");
		} else if (nota < 7) { 
			// NOTA ENTRE 5 i 6.9999
			System.out.println("APROVAT");
		} else if (nota < 9) { 
			// NOTA ENTRE 7 i 8.9999
			System.out.println("NOTABLE");
		} else if (nota <= 10) { 
			// NOTA ENTRE 9 i 10
			System.out.println("EXCEL·LENT");
		} else { 
			// NOTA MAJOR QUE 10
			System.out.println("Nota incorrecta");
		}

	}
}
