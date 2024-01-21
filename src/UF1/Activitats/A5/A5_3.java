/*
1.  En un museu hi ha un programa que demana unes dades al visitant per comprovar
	si pot entrar gratuïtament o no. 
    El visitant podrà entrar sense pagar en el cas que sigui estudiant i tingui menys de 25 anys,
    o sigui professor i vagi amb el grup classe. 
    1. Demana a l'usuari si és estudiant o no
    2. Demana a l'usuari si és professor o no i en cas de ser professor demana si va amb el grup
    classe o no. A més a més en qualsevol dels casos ha de demanar l'edat que té l'usuari.
    3. Crea una expressió a partir de les condicions d'entrada gratuïta al museu i desa-la
    en una variable booleana anomenada potEntrarSensePagar.
    4. Crea una estructura de control condicional utilitzant la variable booleana
    potEntrarSensePagar i fes que en la part de l'**if** digui a l'usuari que no pot entrar
    i en la part de l'**else** digui a l'usuari que sí que pot entrar.
    5. Copia l'estructura de l'apartat anterior i enganxa-la a sota,
    substitueix en l'estructura de control condicional nova la variable booleana potEntrarSensePagar
    per l'expressió que li has assignat, i fes l'expressió el més simple possible.

*/

import java.util.*;

public class A5_3 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		boolean esProfessor = false;
		boolean grupClasse = false;

		System.out.print("Ets estudiant? (true/false) ");
		boolean esEstudiant = teclat.nextBoolean();

		if (esEstudiant == false) {
			System.out.println("Ets professor? (true/false)");
			esProfessor = teclat.nextBoolean();

			if (esProfessor == true) {
				System.out.println("Vas amb el grup classe? (true/false)");
				grupClasse = teclat.nextBoolean();
			}
		}
		System.out.println("Quina es la teva edat?");
		int edat = teclat.nextInt();

		boolean potEntrarSensePagar = (esEstudiant == true && edat < 25 || esProfessor == true && grupClasse == true);

		if (potEntrarSensePagar == false) {
			System.out.print("No pots entrar sense pagar.");
		} else {
			System.out.print("Pots entrar gratuitament.");
		}
	}
}
