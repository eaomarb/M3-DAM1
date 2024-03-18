import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Fitxers {

	public static void main(String[] args) throws FileNotFoundException  {
		
		// Els FITXERS ens serviran per poder emmagatzemar o llegir dades
		// directament en disc -> PESTISTENCIA DE DADES
		
		// ESCRIPTURA
		// Per a l'escriptura en fitxers utilitzarem la classe PrintWriter
		// Primer indicarem el fitxer en el que volem escriure
		// i després escriurem amb les instruccions print() / println()
		
		// SINTAXI
		// PrintWriter nombVariable = new PrintWriter(new File("nomFitxer"));
		
		File fitxer = new File("prova.txt");
		PrintWriter fitxerSortida = new PrintWriter(fitxer);
		
		// Per escriure en el fitxer, farem servir les instruccions que ja 
		// coneixem: print() o println()
		fitxerSortida.println("Hola, em dic David.");
		fitxerSortida.println("Adeu!");
	
		
		// A l'acabar d'escriure en un fitxer l'hem de tancar per a que es
		// desin els canvis, fent .close()
		fitxerSortida.close();
		
		// Quan creem el PrintWriter es substitueix el contingut del fitxer.
		// Si volem afegir text nou, sense perdre l'anterior (append),
		// haurem d'utilitzar alternatives.

		// LECTURA
		// Per a la lectura de dades des d'un fitxer, utilitzarem un Scanner, però 
		// de forma lleugerament diferent del que hem fet fins ara.
		
		// SINTAXI
		
		// Obrim el fitxer en mode lectura
		// Scanner fitxerEntrada = new Scanner(nomFitxer);
		
		Scanner fitxerEntrada = new Scanner(new File("prova.txt"));
		
		// Per a llegir, fem servir les mateixes instruccions que des del teclat
		// nextInt(), nextLine()...
		// Pero hi ha una diferencia, quan llegims des d'un fitxer, per evitar
		// una excepció, cal COMPROVAR abans de llegir.
		
		// Per a comprovar que queda alguna cosa a llegir en el fitxer s'utilitzen
		// les instruccions de tipus hasNextInt(), hasNextLine()

		while (fitxerEntrada.hasNextLine()) {
			
			System.out.println(fitxerEntrada.nextLine());
		}
	}

}
