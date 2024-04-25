
/*Fer un programa que triï a l'atzar un número entre 0 i 100.
	Un cop el tingui anirà demanant valors a l'usuari i li donarà pistes si el número és major o menor,
	fins que l'usuari encerti el número o es cansi, per això li preguntarem si vol seguir concursant cada vegada que falli.
*/
import java.util.*;

public class A6_17 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		double random = Math.round(Math.random() * 100);

		System.out.println(random);

		System.out.println("Digues un número: ");
		int numero = teclat.nextInt();
		
		if (numero == random) {
			System.out.println("Molt bé, has encertat el número!");
		}
		
		while (numero != random) {
			if (numero > random) {
				System.out.println("El número aleatori és més petit que " + numero + "\nDigues un altre número: ");
				numero = teclat.nextInt();
			} else if (numero < random) {
				System.out.println("El número aleatori és més gran que " + numero + "\nDigues un altre número: ");
				numero = teclat.nextInt();
			} 
		}
	}
}
