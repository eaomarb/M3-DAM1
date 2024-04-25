//En una classe de 15 alumnes, cada alumne està matriculat de 3 mòduls.
//Per cada avaluació d’un alumne entrem una nota per cada mòdul.
//Cal calcular la nota final de cada mòdul, sent la nota final la mitja de les 3 avaluacions

import java.util.Scanner;

public class A7_3 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		// notes modul 1 avaluacio
		double notaModul1 = 0;
		double notaModul2 = 0;
		double notaModul3 = 0;

		// notes modul 2 avaluacio
		double notaModul12 = 0;
		double notaModul22 = 0;
		double notaModul32 = 0;

		// notes modul 3 avaluacio
		double notaModul13 = 0;
		double notaModul23 = 0;
		double notaModul33 = 0;

		for (int alumne = 1; alumne <= 3; alumne++) {
			System.out.println("Alumne " + alumne + "\nPrimera avaluació");
			System.out.println("Nota Mòdul 1: ");
			notaModul1 = teclat.nextDouble();
			System.out.println("Nota Mòdul 2: ");
			notaModul2 = teclat.nextDouble();
			System.out.println("Nota Mòdul 3: ");
			notaModul3 = teclat.nextDouble();

			System.out.println("Segona avaluació");
			System.out.println("Nota Mòdul 1: ");
			notaModul12 = teclat.nextDouble();
			System.out.println("Nota Mòdul 2: ");
			notaModul22 = teclat.nextDouble();
			System.out.println("Nota Mòdul 3: ");
			notaModul32 = teclat.nextDouble();

			System.out.println("Tercera avaluació");
			System.out.println("Nota Mòdul 1: ");
			notaModul13 = teclat.nextDouble();
			System.out.println("Nota Mòdul 2: ");
			notaModul23 = teclat.nextDouble();
			System.out.println("Nota Mòdul 3: ");
			notaModul33 = teclat.nextDouble();

			System.out.println("Nota mòdul 1: " + (notaModul1 + notaModul12 + notaModul13) / 3);
			System.out.println("Nota mòdul 2: " + (notaModul2 + notaModul22 + notaModul23) / 3);
			System.out.println("Nota mòdul 3: " + (notaModul3 + notaModul32 + notaModul33) / 3 + "\n");
		}
	}

}
