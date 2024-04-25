import java.util.Scanner;

public class T2_Variables {

	public static void main(String[] args) {
		// VARIABLES: "Lloc" on emmagatzemar
		// dades dins un programa

		// Hi ha diferents tipus de variables en funció
		// de les dades que vulguem emmagatzemar
		// Números sencers o decimals, textos, sí/no

		// DECLARAR UNA VARIABLE és indicar-li a l'Eclipse
		// que l'utilitzarem per emmagatzemar un cert
		// tipus de dades i que tindrà un cert nom

		// SÍNTAXI:
		// tipusDeDades nomDeLaVariable = valorInicial;
		// tipusDeDades nomDeLaVariable;

		// Números enters -> int
		// Nombre decimals -> double
		// Textos -> String
		// Sí/No -> boolean
		// ...

		// Pel que fa al nom de la variable:
		// - SEMPRE comença en minúscules
		// - Nom ni molt llarg ni
		//     molt curt i autoexplicatiu
		// - No poden començar per números
		// - Tècnica del camell per separar paraules
		// - No podeu utilitzar paraules reservades
		
		int edatAlumne;
		double souProfe = 3000.50;
		String nomAlumne = ""; // o bé String nomAlumne = new String();
		
		
		// L'eina Scanner permet que l'usuari pugui introduir
		// dades a través de la consola
		Scanner teclat = new Scanner(System.in);
		
		// El Scanner tens diferents instruccions depenent
		// del tipus de dades que vulguem llegir
		// - nextLine() -> Llegeix línies
		// - nextInt() -> Llegeix sencers
		// - nextDouble() -> Llegeix decimals
		
		System.out.print("Introdueix el teu nom: ");
		nomAlumne = teclat.nextLine();
		
		System.out.print("Introdueix l'edat del alumne: ");
		edatAlumne = teclat.nextInt();
		
		System.out.print("Introdueix el sou imaginari del profe: ");
		souProfe = teclat.nextDouble();
		
		// El println fa un salt de línia després d'escriure
		// i el print no
		// Podem concatenar textos amb el símbol "+"
		System.out.print("El nom de l'alumne es: " + nomAlumne);
		System.out.println(" i la seva edat es: " + edatAlumne);
		System.out.println("El sou del profe es: " + souProfe  + "€");
	}

}
