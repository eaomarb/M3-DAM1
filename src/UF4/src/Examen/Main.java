package Examen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclat = new Scanner(System.in);
        /*Llegim el nombre del fitxer*/
        System.out.println("Introdueix el nom del fitxer");
        String nomFitxer = teclat.nextLine();

        /*Instanciem una nova habitacio i 2 poombes mes*/
        Habitacio habitacio = new Habitacio(nomFitxer, 1);
        habitacio.afegirPoomba(new Poomba(habitacio, "o", 1, 0));
        habitacio.afegirPoomba(new Poomba(habitacio, "n", 0, 2));

        boolean[][] mapa = habitacio.getMapa();

        System.out.println(habitacio);
    }
}
