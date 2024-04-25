import java.util.*;

public class Variables {
	public static void main (String[] args) {
		Scanner teclat = new Scanner(System.in);
		String nom;
		
		//Li preguntem a l'usuari el seu nom
		System.out.println("Com et dius?");
		nom = teclat.nextLine();
		
		//Imprimim en pantalla el nom de l'usuari
		System.out.print("Et dius " + nom + ".");
	}
}
