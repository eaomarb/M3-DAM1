/*
 1. Fer un programa que ens demani per una hora concreta, la temperatura i
 	els litres de pluja d'una població i segons això resoldre aquests petits problemes. 
 	Cadascun que guardi el resultat en una variable booleana diferent i mostri el valor per pantalla. 
    - Construeix una expressió que retorni cert si fa bon dia per sortir.
      O sigui, si la temperatura és superior a 20 i els litres de pluja són inferiors a 2.
    - Construeix una expressió que retorni fals en el cas que 
      siguin més tard de les 22 h o si la temperatura és inferior a 5 graus.
    - Construeix una expressió que ens digui que podem sortir en bici si
      són abans de les 21 h o si la temperatura és superior a 20 graus i la pluja inferior a 0,5 litres.
 */

import java.util.*;

public class A5_2 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Quina hora és?");
		int hora = teclat.nextInt();
		System.out.println("Quina temperatura fa?");
		int temperatura = teclat.nextInt();
		System.out.println("Quants litres de pluja han caigut?");
		double litres = teclat.nextDouble();

		boolean bonDia = (temperatura > 20 && litres < 2);
		boolean malDia = false;
		boolean diaBici = (hora < 21 || temperatura > 20 && litres < 0.5);

		System.out.println(bonDia);

		if (hora > 22 || temperatura < 5) {
			System.out.println(malDia);
		} else {
			malDia = true;
			System.out.println(malDia);
		}

		if (diaBici == true) {
			System.out.println("Pots sortir en bici :)");
		} else {
			System.out.println("No pots sortir en bici :(");
		}

	}

}
