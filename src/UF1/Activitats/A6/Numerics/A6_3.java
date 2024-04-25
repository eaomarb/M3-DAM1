
//Donats dos nombres enters positius n1 i n2 amb n1 < n2,
//escriu tots els nombres enters que són múltiples de n1 més petits o iguals a n2 en ordre creixent.
import java.util.*;

public class A6_3 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Introdueix el primer número: ");
		int n1 = teclat.nextInt();
		System.out.println("Introdueix el segon número: ");
		int n2 = teclat.nextInt();

		int multiple = n1;
		int i = 1;

		while (multiple <= n2) {
			System.out.println(multiple);
			i++;
			multiple = n1 * i;
		}
	}
}
