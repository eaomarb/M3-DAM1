/* Programa per llegir l'alçada de N persones i calcular l'alçada mitjana.
 * Calcular quantes persones tenen una alçada superior a la mitjana i
 *  quantes tenen una alçada inferior a la mitjana. 
 * El valor de N es demana per teclat i ha de ser enter positiu.
 */

import java.util.*;

public class A8_3 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Introdueix el número de persones: ");
		int n = teclat.nextInt();
		
		double [] heights = new double[n];
		double heightSum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Introdueix l'alçada " + i + ": ");
			double height = teclat.nextDouble();
			heightSum = heightSum + height;
			heights[i] = height;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(heights[i] + ", ");
		}
		
		double mitjana = heightSum/n;
		System.out.println("Mitjana: " + mitjana);
		
		int superiors = 0;
		int inferiors = 0;
		
		for (int i = 0; i < heights.length; i++) {
			
			if (heights[i] < mitjana) {
				inferiors++;
			} else if (heights[i] > mitjana) {
				superiors++;
			}
		}
		System.out.println("El número de persones amb alçada superior a la mitjana és: " + superiors);
		System.out.println("El número de persones amb alçada inferior a la mitjana és: " + inferiors);

	}

}
