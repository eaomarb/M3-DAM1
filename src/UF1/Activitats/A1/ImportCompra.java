import java.util.*;

public class ImportCompra {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		//Demanem el cost d'una unitat
		System.out.print("Introdueix el cost d'una unitat: ");
		double preuUnitat = teclat.nextDouble();
		//Demanem la quantitat d'unitats
		System.out.println("Quantes unitats vols comprar?");
		int unitats = teclat.nextInt();
		
		//
		System.out.print("Import de la compra: " + (preuUnitat*unitats));
		
	}
}
