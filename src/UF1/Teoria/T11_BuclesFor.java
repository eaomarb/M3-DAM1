public class BuclesFor {

	public static void main(String[] args) {

		// Per als casos en que el número d'iteracions sigui
		// conegut, podem fer servir l'estructura FOR

		// Els bucles s'executaran durant un nombre determinat de voltes


		// SINTAXI
		// for (int i = valorInicial; i <= valorFinal; i++) {
		//
		//		Instruccions que s'executaran dins el bucle
		// }

		// Per exemple utilitzant un while, del 1 al 10

		// INICIALIZACIÓ
		int i = 1;
		// CONDICIÓ
		while (i <= 10) {
			System.out.println(i);
			// CANVI DE VALOR
			i++;
		}

		// Utilitzant un FOR
		// for (INICIALIZACIÓ; CONDICIÓ; CANVI)
		
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

		// O al revés
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

	}
}
