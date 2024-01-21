/*
 Fer un programa d'una gasolinera. En una gasolinera es registra per cada cotxe que entra,
 el tipus de combustible (gasoil o gasolina), i litres que carrega al cotxe.
 Al final del dia, es vol recollir la informació de tipus de combustible i la quantitat de litres totals del combustible.
 Controlarem que és final del dia i no entren més cotxes, per l'hora (horari de 9h a 21h).
 Controlar cadascú que entra si vol carregar combustible
 Preguntar si entra un cotxe, en el cas que entri cotxe preguntar l'hora,
 i preguntar tipus de combustible (gasolina o gasoil) i quantitat de litres.
 */

import java.util.*;

public class A6_19 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		int nCotxes = 0;
		int nGasolina = 0;
		int nGasoil = 0;
		int litresGasolina = 0;
		int litresGasoil = 0;

		System.out.println("Entres amb un cotxe? (true/false)");
		boolean cotxe = teclat.nextBoolean();

		if (cotxe == false) {
			System.out.println("Necessites entrar amb un cotxe.");
					
			System.out.println("Entres amb un cotxe? (true/false)");
			cotxe = teclat.nextBoolean();
			
			System.out.println("Quina hora és?");
			int hora = teclat.nextInt();
			
			while (hora >= 9 && hora <= 21) {
				System.out.println("Vols carregar combustible? (true/false)");
				boolean combustible = teclat.nextBoolean();
				if (combustible == true) {
					System.out.println("Quin tipus de combustible vols carregar? (Gasolina/Gasoil)");
					String tipusCombustible = teclat.next();
					if (tipusCombustible.equalsIgnoreCase("Gasolina")) {
						nGasolina++;
					} else if (tipusCombustible.equalsIgnoreCase("Gasoil")) {
						nGasoil++;
					}
					System.out.println("Introdueix la quantitat de litres: ");
					int litres = teclat.nextInt();
					if (tipusCombustible.equalsIgnoreCase("Gasolina")) {
						litresGasolina = litresGasolina + litres;
						nCotxes++;
					} else if (tipusCombustible.equalsIgnoreCase("Gasoil")) {
						litresGasoil = litresGasoil + litres;
						nCotxes++;
					}
				}
				System.out.println("Quina hora és?");
				hora = teclat.nextInt();
				if (hora < 9 || hora > 21) {
					cotxe = false;
					System.out.println("Esta tancada la gasolinera. Resultat del dia:");
					System.out.println("Total de cotxes: " + nCotxes);
					System.out.println("Cotxes de gasolina : " + nGasolina);
					System.out.println("Cotxes de gasoil: " + nGasoil);
					System.out.println("Litres de gasolina: " + litresGasolina);
					System.out.println("Litres de gasoil: " + litresGasoil);
					System.out.println("Litres totals: " + (litresGasolina + litresGasoil));
				}
		}
		}
		
		
	}
}
