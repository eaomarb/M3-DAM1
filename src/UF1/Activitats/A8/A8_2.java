// Programa Java que llegeixi 10 nombres enters per teclat i els guardi en un array.
// Calcula i mostra la mitjana dels nombres que estiguin en les posicions parells del array. 

import java.util.*;

public class A8_2 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		int[] array = new int[10];
		int suma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introdueix el número " + i + ".");
			array[i] = teclat.nextInt();
			suma += array[i];
		}
		System.out.println(Arrays.toString(array));	
		System.out.println("Mitjana: " + suma/10);

	}

}
