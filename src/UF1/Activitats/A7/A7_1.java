//Llegir nombres enters per teclat, fins que llegim un 0 i comptar la quantitat de nombres positius i negatius llegits.


import java.util.Scanner;

public class A7_1 {

	public static void main(String[] args) {

		Scanner teclat = new Scanner(System.in);

		int numPositiu = 0;
		int numNegatiu = 0;

		for (;;) {
			System.out.print("Escriu numero (0 per acabar): ");

			int numero = teclat.nextInt();

			if (numero == 0) {
				break;
			} else if (numero > 0) {
				numPositiu++;
			} else {
				numNegatiu++;
			}
		}

		System.out.println("Numeros positius: " + numPositiu);
		System.out.println("Numeros negatius: " + numNegatiu);
	}
}