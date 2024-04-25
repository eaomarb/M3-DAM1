import java.util.Scanner;

public class T7_Strings {

	public static void main(String[] args) {

		// Els Strings son un tipus de variable
		// que ens permet treballar amb texts.
		// Per llegir-los de la consola, fem servir
		// .nextLine()
		
		// Com comparem Strings?
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Nom:");
		String nom = teclat.nextLine();
		
		// Per comparar Strings farem servir: 
		// .equals() -> És sensible a majuscules i minuscules
		// .equalsIgnoreCase() -> No té en compte majuscules y minuscules
		
		if (nom.equalsIgnoreCase("David")) {
			System.out.println("Et dius com jo.");
		} else {
			System.out.println("No et dius com jo.");
		}
		
		
		// Hi ha un altre tipus de dades que serveix per
		// desar caràcters -> char
		
		char lletra = 'c';
		
		// Si volem llegir un únic caràcter per consola
		// cal llegir tot el text amb .nextLine() o .next()
		// i quedar-nos amb el primer caràcter, utilitzant .charAt(0)

		System.out.println("Inicial:");
		char inicial = teclat.nextLine().charAt(0);
		
		if (inicial == 'D') {
			System.out.println("El meu nom comença per la mateixa lletra");
		}
		
		// Si en lloc de llegir tot el text entrat per consola volem llegir
		// de paraula en paraula, fem servir el .next()
		System.out.println(teclat.nextLine());
		System.out.println(teclat.next());
		System.out.println(teclat.next());
	}

}
