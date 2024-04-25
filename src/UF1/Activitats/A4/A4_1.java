// Siguin dues dates donades per dia1, mes1, any1 i dia2, mes2, any2,
// respectivament.
// Escriviu una expressió lògica el valor de la qual sigui cert si la primera
// data és igual
// o anterior a la segona, i fals si és posterior.
// Demanem la primera data:	

import java.util.Scanner;

public class A4_1 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix el 1r dia: ");
		int dia1 = teclat.nextInt();

		System.out.println("Introdueix el 1r mes:  ");
		int mes1 = teclat.nextInt();

		System.out.println("Introdueix el 1r any: ");
		int any1 = teclat.nextInt();

		// Demanem la segona data:

		System.out.println("Introdueix el 2n dia: ");
		int dia2 = teclat.nextInt();

		System.out.println("Introdueix el 2n mes: ");
		int mes2 = teclat.nextInt();

		System.out.println("Introdueix el 2n any: ");
		int any2 = teclat.nextInt();

		teclat.close();

		if (any1 > any2 || (any1 == any2 && (mes1 > mes2 || dia1 > dia2))) {
			System.out.println("La data 1, es major que la data2");
		} else if (any1 == any2 && mes1 == mes2 && dia1 == dia2) {
			System.out.println("Són iguals les dues dates");
		} else {
			System.out.println("La segona data és major que la primera.");
		}

	}

}
