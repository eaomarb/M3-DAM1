//8. Escriu un programa que demani un import sense impostos,
//i ens digui l'import aplicant els impostos,
//si és major de 15000 se li aplicarà un 16% d’impostos,
//en cas contrari un 10%.

import java.util.*;

public class A2_8 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix l'import: ");
		double importSenseImpostos = teclat.nextDouble();

		if (importSenseImpostos > 15000) {
			System.out.println("Import amb impostos: " + importSenseImpostos * 1.16);
		} else {
			System.out.println("Import amb impostos: " + importSenseImpostos * 1.10);
		}
	}
}
