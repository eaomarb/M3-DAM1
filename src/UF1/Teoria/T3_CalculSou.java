import java.util.Scanner;

// Calcula el sou mensual a partir d'hores treballades
// i sou per hora

public class T3_CalculSou {

	public static void main(String[] args) {
			
		// Demanem les dades a l'usuari
		// int horesTreballades = 45;
		// double souHora = 13.6;

		// L'eina Scanner permet que l'usuari pugui introduir
		// dades a través de la consola
		Scanner teclat = new Scanner(System.in);
				
		// Demanem el nom de l'usuari
		System.out.println("Com et dius?");
		String nom = teclat.nextLine();
		
		// Demanem les dades per fer el càlcul
		System.out.println("Quantes hores has treballat aquest mes?");
		int horesTreballades = teclat.nextInt();
		System.out.println("Quant cobres per hora?");
		double souHora = teclat.nextDouble();
		
		// Realitzem el càlcul del sou mensual
		double souMensual = horesTreballades * souHora;
		
		
		// Mostrem el resultat per pantalla
// System.out.print("El sou mensual és: ");
// System.out.print(souMensual);
// System.out.println("€");
		
		// El println fa un salt de línia després d'escriure
		// i el print no	
		
		System.out.println("Hola " + nom);
		
		// Podem concatenar textos amb el símbol "+"
		System.out.println("El sou mensual es: " + souMensual + "€");
		
		
	}

}
