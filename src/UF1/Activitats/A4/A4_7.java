// Un treballador necessita calcular el seu salari, demanar les hores treballades.
// Si ha treballat més de 40h se li paga 16€ per les primeres 40h i 20€ per la resta.

import java.util.*;

public class A4_7 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Quantes hores has treballat?");
		int hores = teclat.nextInt();
		
		if (hores > 0 && hores < 40) {
			System.out.print("Salari: " + hores*16);
		} else if (hores > 40) {
			System.out.println("Salari: " + hores*20);
		} else {
			System.out.println("Error.");
		}
	}

}
