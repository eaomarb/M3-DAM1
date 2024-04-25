import java.util.Scanner;

public class AA1 {
	public static void main(String[] args) {
		// Inicialitzem variables
		Scanner teclat 			  = new Scanner(System.in);
		int 	numMaterial       = 1;
		int 	numVegadesPaper   = 0;
		int 	numVegadesPlastic = 0;
		int 	numVegadesVidre   = 0;
		double 	kilosTotalPaper   = 0;
		double 	kilosTotalPlastic = 0;
		double 	kilosTotalVidre   = 0;
		String 	material 		  = "";
				
		// Mentres vulgui seguir
		while (!material.equalsIgnoreCase("fi")) {
			// Demanem el tipus de material
			System.out.println("Material " + numMaterial + " (paper / plàstic / vidre / fi):");
			material = teclat.next();
			
			// Comprovem que sigui un tipus correcte
			while (!material.equals("paper") 
					&& !material.equals("plàstic")
					&& !material.equals("vidre")
					&& !material.equalsIgnoreCase("fi")) {
				
				System.out.println("ERROR! - Material " + numMaterial + " (paper / plàstic / vidre / fi):");
				material = teclat.next();
			}
		
			// Si no vol acabar, demanem el pes
			if (!material.equalsIgnoreCase("fi")) {
				System.out.println("Pes material " + numMaterial +": ");
				double kilosMaterial = teclat.nextDouble();
				
				// Comprovem que el pes estigui dins els limits
				if (material.equals("paper") && kilosMaterial > 0 && kilosMaterial <= 10 
					|| (material.equals("plàstic") || material.equals("vidre")) && kilosMaterial > 0 && kilosMaterial <= 50) {
					
					// Si està bé, imprimim el resum
					System.out.println(material + ": " + kilosMaterial * 1000 + "g.");
					
					// Actualitzem totals
					if (material.equals("paper")) {
						numVegadesPaper++;
						kilosTotalPaper += kilosMaterial;
					} else if (material.equals("plàstic")) {
						numVegadesPlastic++;
						kilosTotalPlastic += kilosMaterial;
					} else {
						numVegadesVidre++;
						kilosTotalVidre += kilosMaterial;
					}
					numMaterial++;	
				} else {  // Si passem de pes, avisem i no incrementem el nombre de material
					System.out.println("No es poden introduir tants quilograms de " + material + ".");
				}
			}
		}
		teclat.close();
	
		// Mostrem els totals, només si tenim alguna cosa
//		if (numVegadesPaper + numVegadesPlastic + numVegadesVidre == 0) {
		if (numMaterial == 1) {
			System.out.println("No s'ha introduït cap material.");
		} else {
			if (numVegadesPlastic == 0) {
				System.out.println("Pes mitjà de plàstic: No s'ha introduït plàstic.");
			} else {
				System.out.println("Pes mitjà de plàstic: " + kilosTotalPlastic / numVegadesPlastic + "kg.");
			}

			if (numVegadesPaper == 0) {
				System.out.println("Pes mitjà de paper: No s'ha introduït paper.");
			} else {
				System.out.println("Pes mitjà de paper: " + kilosTotalPaper / numVegadesPaper + "kg.");
			}

			if (numVegadesVidre == 0) {
				System.out.println("Pes mitjà de vidre: No s'ha introduït vidre.");
			} else {
				System.out.println("Pes mitjà de vidre: " + kilosTotalVidre / numVegadesVidre + "kg.");
			}

			// Diners acumulats
			double dinersAcumulats = kilosTotalPlastic * 0.45 
									+ kilosTotalPaper  * 1.23 
									+ kilosTotalVidre  * 0.98;

			System.out.println("Quantitat de diners acumulats: " + dinersAcumulats + "€");

			// Percentatges de cada material
			double kilosTotals = kilosTotalPaper + kilosTotalPlastic + kilosTotalVidre;

			double percentatgePlastic = kilosTotalPlastic / kilosTotals * 100;
			System.out.println("El percentatge de plàstic sobre el total és: " + percentatgePlastic + "%");

			double percentatgePaper = kilosTotalPaper / kilosTotals * 100;
			System.out.println("El percentatge de paper sobre el total és: " + percentatgePaper + "%");

			double percentatgeVidre = kilosTotalVidre / kilosTotals * 100;
			System.out.println("El percentatge de vidre sobre el total és: " + percentatgeVidre + "%");
		}
	}
}