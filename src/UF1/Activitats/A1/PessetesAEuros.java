import java.util.*;

public class PessetesAEuros {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		//Demanem la quantitat de pessetes
		System.out.print("Introdueix la quantitat de pessetes: ");
		double pessetes = teclat.nextDouble();
		
		//Calculem els euros
		double euros = pessetes/166.368;
		
		//Mostrem en pantalla la conversió a euros
		System.out.print(pessetes + " pessetes són: " + euros + "€.");
	}
}
