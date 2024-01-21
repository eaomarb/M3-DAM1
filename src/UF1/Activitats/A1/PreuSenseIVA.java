import java.util.*;

public class PreuSenseIVA {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		// Producte 1
		// Demanem el preu d'una unitat
		System.out.println("Quant val el primer producte? (sense IVA)");
		float producte1 = teclat.nextFloat();
		// Demanem la quantitat d'unitats
		System.out.println("Quantes unitats vols comprar?");
		int unitats1 = teclat.nextInt();
		
		//Producte 2
		System.out.println("Quant val el segon producte? (sense IVA)");
		float producte2 = teclat.nextFloat();
		System.out.println("Quantes unitats vols comprar?");
		int unitats2 = teclat.nextInt();
		
		//Producte 3
		System.out.println("Quant val el tercer producte? (sense IVA)");
		float producte3 = teclat.nextFloat();
		System.out.println("Quantes unitats vols comprar?");
		int unitats3 = teclat.nextInt();
		
		//Mostrem el preu total per producte amb IVA
		System.out.println("Preu total Producte 1 amb IVA: " + 1.21*(producte1*unitats1));
		System.out.println("Preu total Producte 2 amb IVA: " + 1.21*(producte2*unitats2));
		System.out.println("Preu total Producte 3 amb IVA: " + 1.21*(producte3*unitats3));
		
		//Mostrem el preu total de la comanda amb i sense IVA
		System.out.println("Preu total comanda sense IVA: " + ((producte1*unitats1)+(producte2*unitats2)+(producte3*unitats3)));
		System.out.println("Preu total comanda amb IVA: " + 1.21*(producte1*unitats1+producte2*unitats2+producte3*unitats3));

	}
}
