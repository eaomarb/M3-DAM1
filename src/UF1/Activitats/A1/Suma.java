import java.util.*;

public class Suma {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		double n1;
		double n2;
		
		//Preguntem a l'usuari els nombres decimals per fer la suma
		System.out.println("Introdueix un nombre decimal:");
		n1 = teclat.nextDouble();
		System.out.println("Introdueix l'altre nombre decimal:");
		n2 = teclat.nextDouble();
		
		//Imprimim en pantalla el resultat de la suma
		System.out.print(n1 + n2);
	}
}
