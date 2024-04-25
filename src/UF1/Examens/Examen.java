import java.util.Scanner;

public class Examen {
	public static void main(String[] args) {
		// Inicialitzem el teclat
		Scanner teclat = new Scanner(System.in);

		// Demanem els equips que hi participen
		System.out.println("Quants equips participen?");
		int equips = teclat.nextInt();

		// Li diem al usuari que el mínim d'equips són 2
		while (equips <= 1) {
			System.out.println("Ha d'haver al menys dos equips. Torna a introduir el nombre d'equips: ");
			equips = teclat.nextInt();
		}

		// Inicialitzem variables i arrays
		String nom[] = new String[equips];
		int victories[] = new int[equips];
		int empats[] = new int[equips];
		int derrotes[] = new int[equips];
		int punts[] = new int[equips];

		int victoriesEquip = 0;
		int empatsEquip = 0;
		int derrotesEquip = 0;

		int totalPartitsEquip = 0;

		int partitsPerJugar = 2 * (equips - 1); // Es calcula els partits que ha de jugar cada equip

		int maximPunts = 0;
		String nomGuanyador = "";

		int minimPunts = 999999999;
		String nomPerdedor = "";

		int maximDerrotes = 0;
		String nomMaximDerrotes = "";

		// Començem a demanar les dades de l'equip
		for (int i = 0; i < equips; i++) {
			System.out.println("Equip " + (i + 1));
			System.out.println("Nom: ");
			nom[i] = teclat.next();
			System.out.println("Victories: ");
			victoriesEquip = teclat.nextInt();
			victories[i] = victoriesEquip;
			System.out.println("Empats: ");
			empatsEquip = teclat.nextInt();
			empats[i] = empatsEquip;
			System.out.println("Derrotes: ");
			derrotesEquip = teclat.nextInt();
			derrotes[i] = derrotesEquip;

			// Calculem el total de partits que ha jugat cada equip per comprovar si són els
			// correctes
			totalPartitsEquip = victoriesEquip + empatsEquip + derrotesEquip;

			// Tornem a demanar les dades de l'equip en cas de que l'usuari no hi hagi posat
			// els partits correctes
			while (totalPartitsEquip != partitsPerJugar) {
				System.out.println("Nombre de partits incorrecte! (" + partitsPerJugar + ")");
				System.out.println("Equip " + (i + 1));
				System.out.println("Victories: ");
				victoriesEquip = teclat.nextInt();
				victories[i] = victoriesEquip;
				System.out.println("Empats: ");
				empatsEquip = teclat.nextInt();
				empats[i] = empatsEquip;
				System.out.println("Derrotes: ");
				derrotesEquip = teclat.nextInt();
				derrotes[i] = derrotesEquip;

				totalPartitsEquip = victoriesEquip + empatsEquip + derrotesEquip;
			}
		}

		// Mostrem els resultats dels equips
		System.out.println("Equips");
		for (int i = 0; i < equips; i++) {
			punts[i] = (victories[i] * 3) + (empats[i] * 1) + (derrotes[i] * 0);

			System.out.print(nom[i] + " · ");
			System.out.print(victories[i] + " V · ");
			System.out.print(empats[i] + " E · ");
			System.out.print(derrotes[i] + " D · ");
			System.out.print(punts[i] + " punts\n");
		}

		System.out.println("\nPrimer classificat");

		// Es comprova quin equip ha obtingut la màxima puntuació
		for (int i = 0; i < equips; i++) {
			if (punts[i] > maximPunts) {
				maximPunts = punts[i];
				nomGuanyador = nom[i];
			}
		}
		System.out.println(nomGuanyador + " · " + maximPunts + "\n");

		System.out.println("Darrer classificat");

		// Es comprova quin equip ha obtingut la mínima puntuació
		for (int i = 0; i < equips; i++) {
			if (punts[i] < minimPunts) {
				minimPunts = punts[i];
				nomPerdedor = nom[i];
			}
		}
		System.out.println(nomPerdedor + " · " + minimPunts + "\n");

		// Es comprova quin equip ha obtingut les máximes derrotes
		System.out.println("Més derrotes");
		for (int i = 0; i < equips; i++) {
			if (derrotes[i] > maximDerrotes) {
				maximDerrotes = derrotes[i];
				nomMaximDerrotes = nom[i];
			}
		}

		System.out.println(nomMaximDerrotes + " · " + maximDerrotes + "\n");

		// Demanem a l'usuari el nombre de derrotes per mostrar tots els equips amb aquestes derrotes
		System.out.println("Número de derrotes?");
		int numeroDerrotes = teclat.nextInt();
		
		// Aviem a l'usuari de que les derrotes han de ser com a mínim 1
		while (numeroDerrotes < 0) {
			System.out.println("El número de derrotes ha de de ser 1 o més");
			numeroDerrotes = teclat.nextInt();
		}
		
		teclat.close(); // Tanquem el teclat
		
		// Comprovem quins equips tenen el mateix nombre de derrotes i els mostrem
		for (int i = 0; i < equips; i++) {
			if (derrotes[i] == numeroDerrotes) {
				System.out.println(nom[i]);
			}
		}
	}
}
