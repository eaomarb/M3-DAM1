import java.util.*;

public class PerimetreRectangle {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		//Preguntem per l'alçada
		System.out.print("Quina és l'alçada? ");
		double alcada = teclat.nextDouble();
		//Preguntem per l'amplada
		System.out.print("Quina és l'amplada? ");
		double amplada = teclat.nextDouble();
		
		//Calculem el perimetre
		double perimetre = 2*alcada + 2*amplada;
		
		//Es mostra el resultat en pantalla
		System.out.print("El perimetre del rectangle és: " + perimetre);
		
	}
}
