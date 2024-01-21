import java.util.Scanner;

// Programa que llegeixi el nom i el sou de 20 empleats/des 
// i mostri el nom i el sou de l'empleat/da que més guanya.
public class A8_6 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		// Creem dos arrays
		String[] arrayNoms = new String[20];
		double[] arraySous = new double[20];
		
		// Llegim els noms i sous
		for (int i = 0; i < arraySous.length; i++) {
			System.out.println("Empleat " + (i + 1));
			// Demanem el nom
			System.out.println("Nom:");
			arrayNoms[i] = teclat.nextLine();
			// Demanem el sou
			System.out.println("Sou:");
			arraySous[i] = teclat.nextDouble();
			teclat.nextLine();
			System.out.println();
		}
		teclat.close();
			
		// Podem comprovar l'array
//		for (int i = 0; i < arraySous.length; i++) {
//			System.out.println(arrayNoms[i] + " - " + arraySous[i]);
//		}
		
		// Busquem el sou màxim
		double souMaxim = Double.MIN_VALUE;
		String nomSouMaxim = "";
//		int posSouMaxim = 0;
		
		for (int i = 0; i < arraySous.length; i++) {
			if (arraySous[i] > souMaxim) {
				souMaxim = arraySous[i];
				nomSouMaxim = arrayNoms[i];
//				posSouMaxim = i;
			}
		}
		
		// Mostrem el resultat
		System.out.println(nomSouMaxim + " " + souMaxim + "€");
//		System.out.println(arrayNoms[posSouMaxim] + " " + arraySous[posSouMaxim] + "€");		
	}
}