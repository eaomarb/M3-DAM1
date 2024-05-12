package A12;

import A10.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        String nom;
        int dia;
        int mes;
        int any;
        int numeroNif;

        System.out.println("Quantes persones vols que hi hagin al fitxer?");
        int numeroPersones = teclat.nextInt();
        teclat.nextLine();

        Persona[] persones = new Persona[numeroPersones];

        int comptador = 0;
        while (comptador < numeroPersones) {
            System.out.println("Introdueix el nom de la persona:");
            nom = teclat.nextLine();
            System.out.println("Introdueix el dia:");
            dia = teclat.nextInt();
            System.out.println("Introdueix el mes:");
            mes = teclat.nextInt();
            System.out.println("Introdueix l'any:");
            any = teclat.nextInt();
            System.out.println("Introdueix el número de NIF:");
            numeroNif = teclat.nextInt();
            teclat.nextLine();

            persones[comptador] = new Persona(nom, dia, mes, any, numeroNif);
            comptador++;
        }

        for (int i = 0; i < persones.length; i++) {
            System.out.println(persones[i]);
        }
    }
}
