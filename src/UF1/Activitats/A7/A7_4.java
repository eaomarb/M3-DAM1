/*El següent programa consisteix a controlar les notes d'M3 de la nostra classe.
 * Cada alumne ens dirà la seva nota de la UF1 amb format numèric.
 * El programa ens ha de dir com a resultat:
 * El nombre d'alumnes que la seva puntuació correspon a cadascuna de les valoracions;
    Excel·lent, Notable, Bé, Suficient i Insuficient.
 * La nota mitjana de la classe
 * El percentatge d'alumnes de classe que ha tret Excel·lent o Notable, el percentatge d'alumnes que han tret
    Bé o Suficient i el percentatge d'alumnes suspesos.
 * Consideracions:
	Controlar que les notes que em donen són correctes.
	Les notes són amb decimals.
 */

import java.util.Scanner;

public class A7_4 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		int alumne = 1;
		boolean nouAlumne = true;
		double nota = 0;
		double notesTotals = 0;
		double suspesos = 0;
		double suficient = 0;
		double be = 0;
		double notable = 0;
		double excelent = 0;

		while (nouAlumne == true) {
			System.out.println("Quina nota has tret?");
			nota = teclat.nextDouble();

			while (nota < 0 || nota > 10) {
				System.out.println("Aquesta nota és incorrecta, torna a introduir la teva nota.");

				System.out.println("Quina nota has tret?");
				nota = teclat.nextDouble();
			}

			notesTotals = notesTotals + nota;

			if (nota < 5) {
				System.out.println("Insuficient");
				suspesos++;
			} else if (nota < 6) {
				System.out.println("Suficient");
				suficient++;
			} else if (nota < 7) {
				System.out.println("Bé");
				be++;
			} else if (nota < 9) {
				System.out.println("Notable");
				notable++;
			} else {
				System.out.println("Excel·lent");
				excelent++;
			}

			System.out.println("Ets un altre alumne? (true/false)");
			nouAlumne = teclat.nextBoolean();
			if (nouAlumne == false) {
				double percentatgeExcelentNotable = ((excelent + notable) / alumne) * 100;
				double percentatgeBeSuficient = ((be + suficient) / alumne) * 100;
				double percentatgeSuspesos = (suspesos / alumne) * 100;

				System.out.println("Nota mitjana: " + notesTotals / alumne);
				System.out.println(
						"Percentatge d'alumnes que han tret excel·lent o notable: " + percentatgeExcelentNotable + "%");
				System.out
						.println("Percentatge d'alumnes que han tret bé o suficient: " + percentatgeBeSuficient + "%");
				System.out.println("Percentatge d'alumnes que han suspès: " + percentatgeSuspesos + "%");
			}
			
			alumne++;

		}
	}

}
