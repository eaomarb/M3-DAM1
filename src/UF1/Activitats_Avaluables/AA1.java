import java.util.Scanner;

public class AA1 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		int contadorMaterials = 1; // Declarem la variable com a contador dels materials que l'usuari introdueixi

		// Inicialitzem els contadors dels materials per poder fer els càlculs
		int contadorVidre = 0;
		int contadorPaper = 0;
		int contadorPlastic = 0;

		// Inicialitzem els pesos dels materials
		double pesVidre = 0;
		double pesPaper = 0;
		double pesPlastic = 0;

		System.out.println("Material " + contadorMaterials + ": ");
		String material = teclat.next(); // Guardem el primer material a la variable "material"

		// Li avisem al usuari de que no es permet el tipus de material que ha introduït
		while (!material.equalsIgnoreCase("fi") && !material.equalsIgnoreCase("vidre")
				&& !material.equalsIgnoreCase("paper") && !material.equalsIgnoreCase("plàstic")) {
			System.out.println("No es permet aquest tipus de material.");
			System.out.println("Material " + contadorMaterials + ": ");
			material = teclat.next();
		}

		while (!material.equalsIgnoreCase("fi")) {
			System.out.println("Pes material " + contadorMaterials + " en quilograms: ");
			double pesMaterial = teclat.nextDouble();

			// En el cas de que el pes superi els 50kg, li avisem al usuari de que no pot introduïr tants quilograms
			if ((material.equalsIgnoreCase("plàstic") || material.equalsIgnoreCase("vidre")) && pesMaterial > 50) {
				System.out.println(material + ": " + pesMaterial * 1000 + "g.");
				System.out.println("No es poden introduïr tants quilograms de  " + material + ".");
			} else if (material.equalsIgnoreCase("vidre") && pesMaterial <= 50) {
				System.out.println("Vidre: " + pesMaterial * 1000 + "g.");
				pesVidre = pesVidre + pesMaterial; // Actualitzem el pes total del vidre
				contadorMaterials++; // Actualitzem el contador dels materials
				contadorVidre++; // Actualitzem el contador del vidre
			} else if (material.equalsIgnoreCase("plàstic") && pesMaterial <= 50) {
				System.out.println("Plàstic: " + pesMaterial * 1000 + "g.");
				pesPlastic = pesPlastic + pesMaterial; // Actualitzem el pes total del plàstic
				contadorMaterials++; // Actualitzem el contador dels materials
				contadorPlastic++; // Actualitzem el contador del plastic
			} else if (material.equalsIgnoreCase("paper") && pesMaterial > 10) {
				System.out.println("No es poden introduïr tants quilograms de  paper.");
			} else if (material.equalsIgnoreCase("paper") && pesMaterial <= 10) {
				System.out.println("Paper: " + pesMaterial * 1000 + "g.");
				pesPaper = pesPaper + pesMaterial; // Actualitzem el pes total del paper
				contadorMaterials++; // Actualitzem el contador dels materials
				contadorPaper++; // Actualitzem el contador del paper
			}

			// Preguntem pel següent material
			System.out.println("Material " + contadorMaterials + ": ");
			material = teclat.next();
		}

		double pesTotal = pesPaper + pesVidre + pesPlastic;

		// Realitzem els càlculs per mostrar en pantalla
		if (contadorMaterials > 1 && material.equalsIgnoreCase("fi")) {
			double preuPaper = 1.23; // Preu paper: 1,23€/kg
			double preuVidre = 0.98; // Preu vidre: 0,98€/kg
			double preuPlastic = 0.45; // Preu plàstic 0,45€/kg

			if (pesTotal > 0) {
				double pesMitjaPaper = pesPaper / contadorPaper;
				double pesMitjaVidre = pesVidre / contadorVidre;
				double pesMitjaPlastic = pesPlastic / contadorPlastic;

				System.out.println("Pes mitjà de plàstic: " + pesMitjaPlastic + " kg.");
				System.out.println("Pes mitjà de paper: " + pesMitjaPaper + " kg.");
				System.out.println("Pes mitjà de vidre: " + pesMitjaVidre + " kg.");

				double diners = pesMitjaPaper * preuPaper + pesMitjaVidre * preuVidre + pesMitjaPlastic * preuPlastic;
				System.out.println("Quantitat de diners acumulats: " + diners + "€");

				double percentatgePlastic = (pesMitjaPlastic / pesTotal) * 100;
				double percentatgePaper = (pesMitjaPaper / pesTotal) * 100;
				double percentatgeVidre = (pesMitjaVidre / pesTotal) * 100;

				System.out.println("El percentatge de plàstic sobre el total és: " + percentatgePlastic + "%");
				System.out.println("El percentatge de paper sobre el total és: " + percentatgePaper + "%");
				System.out.println("El percentatge de vidre sobre el total és: " + percentatgeVidre + "%");
			} else {
				System.out.println("No s'ha introduït cap pes.");
			}
		} else {
			System.out.println("No s'ha introduït cap material.");
		}

		teclat.close();
	}
}
