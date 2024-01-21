import java.util.*;

public class CalculSou {
	public static void main (String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		//Demanem el nom de l'usuari
		System.out.println("Com et dius?");
		String nom = teclat.nextLine();
		
		//Demanem les dades per fer el càlcul
		System.out.println("Quantes hores has treballat aquest mes?");
		int horesTreballades = teclat.nextInt();
		System.out.println("Quant cobres per hora?");
		double souHora = teclat.nextDouble();
		
		//Realitzem el càlcul del sou mensual
		double souMensual = horesTreballades * souHora;
		
		//Mostrem el resultat per pantalla
		System.out.print("Hola " + nom + ", el teu sou mensual és de " + souMensual + "€.");
	}
}
