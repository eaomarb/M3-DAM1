//4. Escriu un programa que demani un número i digui a quin dia de la setmana correspon 

import java.util.*;

public class A2_4 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		int num;

		System.out.println("Introdueix un número de la setmana: ");
		num = teclat.nextInt();

		if (num == 1) {
			System.out.println(num + " Dilluns");
		} else if (num == 2) {
			System.out.println(num + " Dimarts");
		} else if (num == 3) {
			System.out.println(num + " Dimecres");
		} else if (num == 4) {
			System.out.println(num + " Dijous");
		} else if (num == 5) {
			System.out.println(num + " Divendres");
		} else if (num == 6) {
			System.out.println(num + " Dissabte");
		} else if (num == 7) {
			System.out.println(num + " Diumenge");
		} else {
			System.out.println(num + " no pot ser un número de la setmana.");
		}
	}
}
