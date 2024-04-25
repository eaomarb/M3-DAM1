// 1. En una cadena de supermercats, s'aplica un descompte sobre el preu final
// depenent de certes
// condicions, que són acumulables.
// - Si el preu final és superior a 500€ s'aplica un 10% de descompte
// - Si el mitjà de pagament és efectiu s'aplica un 10% de descompte
// - Si él client és soci i som dilluns, s'aplica un 10% de descompte

// Necessitaràs variables per guardar l'import total, si el pagament és en
// efectiu o no etc...

import java.util.Scanner;

public class A4_5 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix el preu de la compra: ");
		double preu = teclat.nextInt();

		System.out.println("El medi de pagagament es en efectiu? (True o False)");
		boolean mediP = teclat.nextBoolean();

		System.out.println("El client es soci? (true o false)");
		boolean esSoci = teclat.nextBoolean();

		System.out.println("Introdueix el dia de la setmana: ");
		String dia = teclat.next();

		double descompte = 0.0;

		if (preu > 500) {
			descompte += 0.10;
		}

		if (mediP) {
			descompte += 0.10;
		}

		if (esSoci && dia.equals("Dilluns")) {
			descompte += 0.10;
		}

		double importTotal = preu - (preu * descompte);

		System.out.println("Preu Final: " + preu);
		System.out.println("Descompte aplicat: " + (descompte * 100) + "%");
		System.out.println("Import Total: " + importTotal);

		teclat.close();
	}

}
