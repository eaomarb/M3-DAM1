/*10. Escriu un programa que demani una nota numèrica i digui a quin rang de nota es troba.
Insuficient < 5
Suficient < 6
Be < 7
Notable < 9
Excel·lent < 10
MH = 10
*/

import java.util.*;

public class A2_10 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Quina és la teva nota? ");
		double nota = teclat.nextDouble();
		
		if (nota == 10) {
			System.out.println(nota + " Matrícula d'honor");
		} else if (nota < 10) {
			System.out.println(nota + " Excel·lent");
		} else if (nota < 9) {
			System.out.println(nota + " Notable");
		} else if (nota < 7) {
			System.out.println(nota + " Bé");
		} else if (nota < 6) {
			System.out.println(nota + " Suficient");
		} else if (nota < 5) {
			System.out.println(nota + " Insuficient");
		} else if (nota < 0) {
			System.out.println("La nota no és vàlida");
		} else {
			System.out.println("La nota no és vàlida");
		}
	}
}
