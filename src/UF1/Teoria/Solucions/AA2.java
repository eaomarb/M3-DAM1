import java.util.Scanner;

public class AA2 {

	public static void main(String[] args) {

		Scanner teclat = new Scanner(System.in);

		// Demanem els personatges
		System.out.println("Núm personatges:");
		int numPersonatges = teclat.nextInt();
		teclat.nextLine();

		// Creem els arrays de la mida corresponent
		double[] arrayEnergies = new double[numPersonatges];
		String[] arrayNoms = new String[numPersonatges];

		for (int i = 0; i < arrayNoms.length; i++) {
			// Demanem l'energia
			System.out.println("Energia (1-99) - " + (i + 1));
			arrayEnergies[i] = teclat.nextDouble();

			// Comprovem que estigui entre 1 i 99
			while (arrayEnergies[i] < 1 || arrayEnergies[i] > 99) {
				System.out.println("Error: Energia (1-99) - " + (i + 1));
				arrayEnergies[i] = teclat.nextDouble();
			}
			teclat.nextLine();

			// Demanem el nom
			System.out.println("Nom " + (i + 1));
			arrayNoms[i] = teclat.nextLine();
		}

		// Comprovem
		for (int i = 0; i < arrayNoms.length; i++) {
			System.out.println(arrayNoms[i] + " - " + arrayEnergies[i]);
		}

		// Mostrem el menú
		System.out.println("********************************\n" +
						   "******** QUE VOLS FER **********\n" +
						   "********************************\n" + 
						   "C - Consultar les dades d'un personatge\n" +
						   "F - Fusionar dos personatges\n" + 
						   "B - Fer que dos personatges barallin\n" + 
						   "S - Sortir");

		String opcio = teclat.nextLine();

		// Mentres no vulgui sortir
		while (!opcio.equalsIgnoreCase("S")) {

			/////////////////////////////////////////////////////////////////
			// CONSULTAR ////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////////
			if (opcio.equalsIgnoreCase("C")) {
				System.out.println("Personatge a consultar:");
				String personatge = teclat.nextLine();
				boolean personatgeTrobat = false;
				// Mentres no trobem el personatge, seguim buscant
				int i = 0;
				while (!personatgeTrobat && i < arrayNoms.length) {
//				for (int i = 0; i < arrayNombres.length; i++) {
					if (arrayNoms[i].equalsIgnoreCase(personatge)) {
						System.out.println(arrayNoms[i] + " - " + arrayEnergies[i]);
						personatgeTrobat = true;
					}
					i++;
				}

				// Si hem arribat al final sense trobar-lo, error
				if (!personatgeTrobat) {
					System.out.println("ERROR - No existeix");
				}
			/////////////////////////////////////////////////////////////////
			// FUSSSSSSSIONAR
			} else if (opcio.equalsIgnoreCase("F")) {

				System.out.println("Personatge 1 a consultar:");
				String personatge1 = teclat.nextLine();

				System.out.println("Personatge 2 a consultar:");
				String personatge2 = teclat.nextLine();

				int iPersonatge1 = -1;
				int iPersonatge2 = -1;

				int i = 0;

				// Mentres no s'acabi i no hagi trobat els 2 personatges, busco
				while (i < arrayNoms.length && (iPersonatge1 == -1 || iPersonatge2 == -1)) {

					if (arrayNoms[i].equalsIgnoreCase(personatge1)) {
						iPersonatge1 = i;
					} else if (arrayNoms[i].equalsIgnoreCase(personatge2)) {
						iPersonatge2 = i;
					}

					i++;
				}

				// Fussionem
				if (iPersonatge1 != -1 && iPersonatge2 != -1) {
					System.out.println(arrayNoms[iPersonatge1] + "-" + arrayNoms[iPersonatge2]);
					System.out.println(arrayEnergies[iPersonatge1] + arrayEnergies[iPersonatge2]);
				} else {
					System.out.println("ERROR - No els he pogut trobar");
				}

			// BARALLAR
			} else if (opcio.equalsIgnoreCase("B")) {
				System.out.println("Personatge 1 a consultar:");
				String personatge1 = teclat.nextLine();

				System.out.println("Personatge 2 a consultar:");
				String personatge2 = teclat.nextLine();

				int iPersonatge1 = -1;
				int iPersonatge2 = -1;

				int i = 0;

				// Mentres no s'acabi i no hagi trobat els 2 personatges, busco
				while (i < arrayNoms.length && (iPersonatge1 == -1 || iPersonatge2 == -1)) {
					if (arrayNoms[i].equalsIgnoreCase(personatge1)) {
						iPersonatge1 = i;
					} else if (arrayNoms[i].equalsIgnoreCase(personatge2)) {
						iPersonatge2 = i;
					}
					i++;
				}

				// Els fem barallar
				if (iPersonatge1 != -1 && iPersonatge2 != -1) {
					if (arrayEnergies[iPersonatge1] > arrayEnergies[iPersonatge2]) {
						System.out.println("Guanya " + arrayNoms[iPersonatge1]);
					} else if (arrayEnergies[iPersonatge1] < arrayEnergies[iPersonatge2]) {
						System.out.println("Guanya " + arrayNoms[iPersonatge2]);
					} else {
						System.out.println("Empat");
					}
				} else {
					System.out.println("ERROR - Algun no existeix");
				}
			}

			System.out.println("********************************\n" + 
							   "******** QUE VOLS FER **********\n" +
							   "********************************\n" + 
							   "C - Consultar les dades d'un personatge\n" +
							   "F - Fusionar dos personatges\n" +
							   "B - Fer que dos personatges barallin\n" +
							   "S - Sortir");
			opcio = teclat.nextLine();
		}
		teclat.close();
	}
}