/* Demana l'edat a l'usuari i crea una expressió (**booleana**)
   que emmagatzemi si la persona pot entrar a la discoteca.
   Pot entrar si té almenys 18 anys.
 
 */

import java.util.Scanner;

public class A5_1 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Quina és la teva edat?");
		int edat = teclat.nextInt();

		boolean major = (edat >= 18);

		System.out.print(major);
	}
}
