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

        int numeroPersones = 0;

        System.out.println("Vols afegir una nova persona? (S/N)");
        String afegirPersona = teclat.next();

        while (afegirPersona.equalsIgnoreCase("S")) {
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


        }

        Persona[] persones = new Persona[1];
        
        System.out.println(persones[0]);
    }
}
