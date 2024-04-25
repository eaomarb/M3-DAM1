/*  En un casino de jocs, es vol mostrar un missatge un cop tirats tres daus:
    Els tres daus són 6 → Excel·lent.
    Dos daus són 6 → Molt bé.
    Un dau és 6 → Regular.
    Cap dau és 6 → Malament.
*/

import java.util.*;

public class A4_8 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Valor dau 1: ");
		int dau1 = teclat.nextInt();
		System.out.println("Valor dau 2: ");
		int dau2 = teclat.nextInt();
		System.out.println("Valor dau 3: ");
		int dau3 = teclat.nextInt();
		
		if (dau1 == 6 && dau2 == 6 && dau3 == 6) {
			System.out.println("Excel·lent!");
		} else if (dau1 == 6 && dau2 == 6 || dau1 == 6 && dau3 == 6 || dau2 == 6 && dau3 ==6) {
			System.out.println("Molt bé");
		} else if (dau1 == 6 || dau2 == 6 || dau3 == 6) {
			System.out.println("Regular");
		} else {
			System.out.println("Malament");
		}
	}

}
