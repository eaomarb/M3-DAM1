package A10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Preguntem per les dades de la persona 1*/
        System.out.println("Introdueix el nom de la persona 1:");
        String nom = scanner.nextLine();
        System.out.println("Introdueix el dia:");
        int dia = scanner.nextInt();
        System.out.println("Introdueix el mes:");
        int mes = scanner.nextInt();
        System.out.println("Introdueix l'any:");
        int any = scanner.nextInt();
        System.out.println("Introdueix el número de NIF:");
        int numeroNif = scanner.nextInt();

        /*
         * Es crea un objecte (persona1) de la classe Persona
         * S'assigna a la persona 1 les dades corresponents amb el constructor de la classe Persona
         */
        Persona persona1 = new Persona(nom, dia, mes, any, numeroNif);

        /*Si la data és incorrecta, es segueix demanant a l'usuari la data fins que sigui correcta*/
        while (dia != persona1.getData().getDia() || mes != persona1.getData().getMes()) {
            System.out.println("La data es incorrecta, torna a posar una data que sigui correcta!");
            System.out.println("Introdueix el dia:");
            dia = scanner.nextInt();
            System.out.println("Introdueix el mes:");
            mes = scanner.nextInt();
            System.out.println("Introdueix l'any:");
            any = scanner.nextInt();

            persona1.setData(new Data(dia, mes, any));
        }

        System.out.println("Introdueix el nom de la persona 2:");
        scanner.nextLine();
        nom = scanner.nextLine();
        System.out.println("Introdueix el dia:");
        dia = scanner.nextInt();
        System.out.println("Introdueix el mes:");
        mes = scanner.nextInt();
        System.out.println("Introdueix l'any:");
        any = scanner.nextInt();
        System.out.println("Introdueix el número de NIF:");
        numeroNif = scanner.nextInt();

        Persona persona2 = new Persona(nom, dia, mes, any, numeroNif);

        while (dia != persona2.getData().getDia() || mes != persona2.getData().getMes()) {
            System.out.println("La data es incorrecta, torna a posar una data que sigui correcta!");
            System.out.println("Introdueix el dia:");
            dia = scanner.nextInt();
            System.out.println("Introdueix el mes:");
            mes = scanner.nextInt();
            System.out.println("Introdueix l'any:");
            any = scanner.nextInt();

            persona2.setData(new Data(dia, mes, any));
        }

        System.out.println("Introdueix el nom de la persona 3:");
        scanner.nextLine();
        nom = scanner.nextLine();
        System.out.println("Introdueix el dia:");
        dia = scanner.nextInt();
        System.out.println("Introdueix el mes:");
        mes = scanner.nextInt();
        System.out.println("Introdueix l'any:");
        any = scanner.nextInt();
        System.out.println("Introdueix el número de NIF:");
        numeroNif = scanner.nextInt();

        Persona persona3 = new Persona(nom, dia, mes, any, numeroNif);

        while (dia != persona3.getData().getDia() || mes != persona3.getData().getMes()) {
            System.out.println("La data es incorrecta, torna a posar una data que sigui correcta!");
            System.out.println("Introdueix el dia:");
            dia = scanner.nextInt();
            System.out.println("Introdueix el mes:");
            mes = scanner.nextInt();
            System.out.println("Introdueix l'any:");
            any = scanner.nextInt();

            persona3.setData(new Data(dia, mes, any));
        }

        /*Es mostra per pantalla les dades de cada persona */
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}