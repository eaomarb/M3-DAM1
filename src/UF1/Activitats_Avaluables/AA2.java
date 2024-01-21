import java.util.Scanner;

public class AA2 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix quants personatges guardarem a la nostra aplicació: ");
        int quantitatPersonatges = teclat.nextInt();

        // Comprovem que l'usuari ha posat més 1 o més personatges
        while (quantitatPersonatges <= 0) {
            System.out.println("Introdueix al menys un personatge: ");
            quantitatPersonatges = teclat.nextInt();
        }

        String nomsPersonatges[] = new String[quantitatPersonatges];
        Double energiesPersonatges[] = new Double[quantitatPersonatges];

        // Afegim als arrays els personatges que ha demanat l'usuari
        for (int i = 0; i < quantitatPersonatges; i++) {
            System.out.println("Personatge " + (i + 1));
            System.out.println("Introdueix el nom: ");
            nomsPersonatges[i] = teclat.next();
            System.out.println("Introdueix el seu nivell d'energia (1-99): ");
            double energia = teclat.nextDouble();

            // Ens assegurem que els nivells d'energia siguins els correctes [1-99]
            while (energia < 1 || energia > 99) {
                System.out.println("El nivell d'energia ha d'estar entre 1 i 99, ambdós inclosos.");
                System.out.println("Introdueix el seu nivell d'energia: ");
                energia = teclat.nextDouble();
            }

            energiesPersonatges[i] = energia;
        }

        // Imprimim un menú per pantalla i comprovem que l'usuari hagi escollit una
        // opció vàlida amb el while
        System.out.println("Que vols fer?\nC - Consultar les dades d'un personatge\nF - Fusionar dos personatges\nB - Fer que dos personatges barallin\nS - Sortir");
        String menu = teclat.next();

        while (!menu.equalsIgnoreCase("c") && !menu.equalsIgnoreCase("f") && !menu.equalsIgnoreCase("b") && !menu.equalsIgnoreCase("s")) {
            System.out.println(menu + " no és una opció vàlida. Introdueix una opció vàlida (C,F,B,S): ");
            menu = teclat.next();
        }

        // Si l'usuari no ha escollit la opció "S" (sortir) executem el programa l'opció
        // escollida
        if (!menu.equalsIgnoreCase("S")) {
            while (menu.equalsIgnoreCase("C")) {
                System.out.println("Opció escollida: C");

                boolean personatgeTrobat = false; // Inicialitzem aquesta variable per canviarla a true
                // quan hi trobem al personatge més endavant

                while (!personatgeTrobat) {
                    System.out.println("Introdueix el personatge que vols trobar: ");
                    String personatgeATrobar = teclat.next();

                    // Recorrem l'array per trobar el personatge
                    for (int i = 0; i < nomsPersonatges.length; i++) {
                        if (personatgeATrobar.equalsIgnoreCase(nomsPersonatges[i])) {
                            personatgeTrobat = true; // Una vegada trobat establim la variable a true
                            System.out.println("Nom: " + nomsPersonatges[i]);
                            System.out.println("Nivell: " + energiesPersonatges[i]);
                        }
                    }

                    if (!personatgeTrobat) {
                        System.out.println("Aquest personatge no existeix.");
                    }
                }

                System.out.println("Que vols fer?\nC - Consultar les dades d'un personatge\nF - Fusionar dos personatges\nB - Fer que dos personatges barallin\nS - Sortir");
                menu = teclat.next();
            }

            while (menu.equalsIgnoreCase("F")) {
                System.out.println("Opció escollida: F");

                System.out.println("Introdueix el personatge que vols fusionar: ");
                String personatge1 = teclat.next();

                System.out.println("Introdueix amb qui ho voleu fusionar: ");
                String personatge2 = teclat.next();

                boolean personatge1Trobat = false;
                boolean personatge2Trobat = false;
                double energiaPersonatge1 = 0;
                double energiaPersonatge2 = 0;

                for (int i = 0; i < nomsPersonatges.length; i++) {
                    if (personatge1.equalsIgnoreCase(nomsPersonatges[i])) {
                        personatge1Trobat = true;
                        energiaPersonatge1 = energiesPersonatges[i];
                    }

                    if (personatge2.equalsIgnoreCase(nomsPersonatges[i])) {
                        personatge2Trobat = true;
                        energiaPersonatge2 = energiesPersonatges[i];
                    }
                }

                if (personatge1Trobat && personatge2Trobat) {
                    String nomFusionat = personatge1 + "-" + personatge2;
                    double energiaFusionada = energiaPersonatge1 + energiaPersonatge2;

                    System.out.println("Personatge resultat fusionat: ");
                    System.out.println("Nom: " + nomFusionat);
                    System.out.println("Nivell Energia: " + energiaFusionada);

                    System.out.println("Que vols fer?\nC - Consultar les dades d'un personatge\nF - Fusionar dos personatges\nB - Fer que dos personatges barallin\nS - Sortir");
                    menu = teclat.next();
                } else {
                    System.out.println("Algun dels personatges no existeix.");
                }
                while (!menu.equalsIgnoreCase("c") && !menu.equalsIgnoreCase("f") && !menu.equalsIgnoreCase("b") && !menu.equalsIgnoreCase("s")) {
                    System.out.println(menu + " no és una opció vàlida. Introdueix una opció vàlida (C,F,B,S): ");
                    menu = teclat.next();
                }
            }

            while (menu.equalsIgnoreCase("B")) {
                System.out.println("Opció escollida: B");

                System.out.println("Introdueix el personatge A: ");
                String personatge1 = teclat.next();

                System.out.println("Introdueix el personatge B: ");
                String personatge2 = teclat.next();

                boolean personatge1Trobat = false;
                boolean personatge2Trobat = false;
                double energiaPersonatge1 = 0;
                double energiaPersonatge2 = 0;

                for (int i = 0; i < nomsPersonatges.length; i++) {
                    if (personatge1.equalsIgnoreCase(nomsPersonatges[i])) {
                        personatge1Trobat = true;
                        energiaPersonatge1 = energiesPersonatges[i];
                    } else {
                        System.out.println("Aquest personatge no existeix.");
                    }

                    if (personatge2.equalsIgnoreCase(nomsPersonatges[i])) {
                        personatge2Trobat = true;
                        energiaPersonatge2 = energiesPersonatges[i];
                    } else {
                        System.out.println("Aquest personatge no existeix.");
                    }

                    if (personatge1Trobat && personatge2Trobat) {
                        if (energiaPersonatge1 == energiaPersonatge2) {
                            System.out.println("Els 2 personatges tenen la mateixa energia. Empat.");
                            System.out.println("Que vols fer?\nC - Consultar les dades d'un personatge\nF - Fusionar dos personatges\nB - Fer que dos personatges barallin\nS - Sortir");
                            menu = teclat.next();
                        } else if (energiaPersonatge1 > energiaPersonatge2) {
                            System.out.println("Personatge guanyador: " + personatge1);
                            System.out.println("Que vols fer?\nC - Consultar les dades d'un personatge\nF - Fusionar dos personatges\nB - Fer que dos personatges barallin\nS - Sortir");
                            menu = teclat.next();
                        } else if (energiaPersonatge1 < energiaPersonatge2) {
                            System.out.println("Personatge guanyador: " + personatge2);
                            System.out.println("Que vols fer?\nC - Consultar les dades d'un personatge\nF - Fusionar dos personatges\nB - Fer que dos personatges barallin\nS - Sortir");
                            menu = teclat.next();
                        }
                    }
                }

                while (!menu.equalsIgnoreCase("c") && !menu.equalsIgnoreCase("f") && !menu.equalsIgnoreCase("b") && !menu.equalsIgnoreCase("s")) {
                    System.out.println(menu + " no és una opció vàlida. Introdueix una opció vàlida (C,F,B,S): ");
                    menu = teclat.next();
                }
            }
        }
        teclat.close();

    }
}