import java.util.*;

public class CalculAreaTriangle {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		//Preguntem per la base
		System.out.print("Quina és la base? ");
		int base = teclat.nextInt();

		//Preguntem per l'alçada
		System.out.print("Quina és l'alçada? ");
		int alcada = teclat.nextInt();
		
		double area = (base*alcada)/2;

		//Imprimim en pantalla l'àrea del triangle
		System.out.println("L'àrea del triangle és " + area);
	}
}