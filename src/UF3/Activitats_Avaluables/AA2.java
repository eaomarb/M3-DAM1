import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class AA2 {
    /**
     * Aquesta funció retorna la quantitat de jocs que hi ha en un determinat fitxer
     *
     * @param nomFitxer nom o ruta del fitxer
     * @return Quantitat de jocs que hi ha al fitxer
     * @throws Exception
     */
    public static int obtenirQuantitatVideojocs(String nomFitxer) throws Exception {
        File fitxer = new File(nomFitxer); // Inicialitzem un nou fitxer amb la clase File
        Scanner scFitxer = new Scanner(fitxer); // Llegim el fitxer amb Scanner

        return scFitxer.nextInt(); // Retornem el primer Int que hi ha al fitxer, el primer numero indica el numero de jocs totals
    }

    /**
     * Aquesta funció mostra per consola els jocs que hi ha en un determinat fitxer
     *
     * @param nomFitxer nom o ruta del fitxer
     * @throws Exception
     */
    public static void mostrarVidejocs(String nomFitxer) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);

        int quantitatVidejocs = obtenirQuantitatVideojocs(nomFitxer); // Utilitzem la funció anterior per obtenir el numero de jocs
        // Inicialitzem els arrays on es guarda la informació dels jocs
        String[] nomsJocs = new String[quantitatVidejocs];
        String[] plataformes = new String[quantitatVidejocs];
        String[] preus = new String[quantitatVidejocs];
        String[] unitats = new String[quantitatVidejocs];

        // Saltem la seguent linia per agafar correctament els jocs segons la estructura del fitxer
        scFitxer.nextLine();

        for (int i = 0; i < quantitatVidejocs; i++) {
            // Saltem la seguent linia per agafar correctament els jocs segons la estructura del fitxer
            scFitxer.nextLine();

            // Assignem cada linia nova a un array
            nomsJocs[i] = scFitxer.nextLine();
            plataformes[i] = scFitxer.nextLine();
            preus[i] = scFitxer.nextLine();
            unitats[i] = scFitxer.nextLine();
        }

        scFitxer.close(); // Tanquem el Scanner

        // Mostrem per consola els jocs
        System.out.println("-------");
        System.out.println(quantitatVidejocs + " jocs");
        System.out.println("-------");

        for (int i = 0; i < quantitatVidejocs; i++) {
            System.out.print(nomsJocs[i] + " · " + plataformes[i] + " · " + preus[i] + "€ · ");
            // Es té en compte si a l'estoc hi ha només una unitat o més
            if (!unitats[i].equalsIgnoreCase("1")) {
                System.out.print(unitats[i] + " unitats");
            } else {
                System.out.print(unitats[i] + " unitat");
            }
            System.out.println();
        }
    }

    /**
     * Aquesta funció suma els preus de tot l'estoc del fitxer
     *
     * @param nomFitxer nom o ruta del fitxer
     * @return preu de l'estoc total
     * @throws Exception
     */
    public static double preuEstoc(String nomFitxer) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);

        double preuEstoc = 0; // Inicialitzem el preu de l'estoc
        int quantitatVidejocs = obtenirQuantitatVideojocs(nomFitxer);

        scFitxer.nextLine(); // Ignorem la linia en blanc del fitxer
        for (int i = 0; i < quantitatVidejocs; i++) {
            // Mirem si queda alguna cosa al fitxer
            if (scFitxer.hasNext()) {
                // Ignorem totes les linies que no siguin el preu del joc
                scFitxer.nextLine();
                scFitxer.nextLine();
                scFitxer.nextLine();

                // Convertim la linia String a un double i actualitzem el preu de l'estoc
                preuEstoc = preuEstoc + Double.parseDouble(scFitxer.nextLine());

                scFitxer.nextLine(); // Tornem a saltar la linia
            }
        }

        scFitxer.close(); // Tanquem el Scanner

        return preuEstoc;
    }

    /**
     * Aquesta funció escriu al fitxer tots els jocs que li passa l'usuari
     *
     * @param nomFitxer     nom o ruta del fitxer
     * @param quantitatJocs el nombre total de jocs que hi haura al fitxer
     * @param nomsJocs      tots els noms dels jocs
     * @param plataformes   les plataformes que hi corresponen a cada joc
     * @param preus         els preus de cada joc
     * @param unitats       les unitats de cada joc
     * @throws Exception
     */
    public static void emmagatzemarDades(String nomFitxer, int quantitatJocs, String[] nomsJocs, String[] plataformes, double[] preus, int[] unitats) throws Exception {
        File fitxer = new File(nomFitxer);
        PrintWriter printWriter = new PrintWriter(new FileWriter(fitxer)); // Inicialitzem PrintWriter amb FileWriter per sobreescriure tot el fitxer

        // Escrivim al fitxer les dades corresponents
        printWriter.println(quantitatJocs);
        for (int i = 0; i < quantitatJocs; i++) {
            printWriter.println();
            printWriter.println(nomsJocs[i]);
            printWriter.println(plataformes[i]);
            printWriter.println(preus[i]);
            printWriter.println(unitats[i]);
        }
        printWriter.close(); // Tanquem PrintWriter
    }

    /**
     * Aquesta funció afegeix al fitxer el joc que li passa l'usuari, pot ser un de nou o un ja existent
     *
     * @param nomFitxer  nom o ruta del fitxer
     * @param nomJoc     el nom del joc
     * @param plataforma la plataforma del joc
     * @param preu       el preu del joc
     * @param unitats    les unitats que hi ha a l'estoc del joc
     * @return el nombre total de jocs després d'afegir el joc
     * @throws Exception
     */
    public static int afegirJoc(String nomFitxer, String nomJoc, String plataforma, String preu, String unitats) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);

        int quantitatJocs = Integer.parseInt(scFitxer.nextLine()) + 1; // Agafem la primera linia i la convertim a un Integer

        // Inicialitzem els arrays de les dades dels jocs
        String[] nomsJocs = new String[quantitatJocs];
        String[] plataformes = new String[quantitatJocs];
        String[] preus = new String[quantitatJocs];
        String[] unitatsJocs = new String[quantitatJocs];

        // Mirem al fitxer tots els jocs i guardem les dades als arrays
        for (int i = 0; i <= quantitatJocs - 1; i++) {
            if (scFitxer.hasNextLine()) {
                scFitxer.nextLine(); // Fem un nextLine per seguir la estructura del fitxer i aixi poder llegir correctament el fitxer
                nomsJocs[i] = scFitxer.nextLine();
                plataformes[i] = scFitxer.nextLine();
                preus[i] = scFitxer.nextLine();
                unitatsJocs[i] = scFitxer.nextLine();
            }
        }

        boolean jocTrobat = false; // Incialitzem la variable per trobar el joc que l'usuari vol afegir

        for (int i = 0; i < quantitatJocs; i++) {
            /*
             * Actualitza un joc que ja existeix si troba el nom del joc i la plataforma
             * Si no troba cap joc amb el mateix nom i plataforma, el bucle no modifica res
             */
            if (!jocTrobat && nomJoc.equalsIgnoreCase(nomsJocs[i]) && plataforma.equalsIgnoreCase(plataformes[i])) {
                nomsJocs[i] = nomJoc;
                plataformes[i] = plataforma;
                preus[i] = preu;
                unitatsJocs[i] = unitats;

                jocTrobat = true;
            }
        }

        /*
         * Una vegada que no s'ha trobat el joc, s'afegeix el joc al final dels arrays i s'incrementa la quantitat de jocs +1.
         * També comprovem que el màxim sigui 20 jocs per botiga
         */
        if (quantitatJocs - 1 < 20) {
            if (!jocTrobat) {
                int j = quantitatJocs - 1;
                nomsJocs[j] = nomJoc;
                plataformes[j] = plataforma;
                preus[j] = preu;
                unitatsJocs[j] = unitats;
                quantitatJocs++;
            }
        } else {
            System.out.println("Hi ha 20 jocs ja");
        }

        PrintWriter printWriter = new PrintWriter(fitxer); // Inicialitzem PrintWriter sense FileWriter per només sobreescriure el que volem

        printWriter.println(quantitatJocs - 1); // Afegim a la primera linia del fitxer la quantitat de jocs que hi hauran

        // Afegim les dades dels jocs
        for (int i = 0; i < quantitatJocs - 1; i++) {
            printWriter.println();
            printWriter.println(nomsJocs[i]);
            printWriter.println(plataformes[i]);
            printWriter.println(preus[i]);
            printWriter.println(unitatsJocs[i]);

        }

        // Tanquem Scanner i PrintWriter
        scFitxer.close();
        printWriter.close();
        return quantitatJocs - 1;
    }

    public static void main(String[] args) throws Exception {
        String fitxer = "jocs.txt";

        // Definim els jocs que volem
        int quantitatJocs = 6;

        String[] nomsJocs = {
                "Super Mario Odyssey",
                "The Last of Us Part II",
                "Final Fantasy VII Remake",
                "The Legend of Zelda: Breath of the Wild",
                "Call of Duty: Warzone",
                "Minecraft"
        };
        String[] plataformes = {
                "Nintendo Switch",
                "PlayStation 5",
                "PlayStation 4",
                "Nintendo Switch",
                "PC",
                "Xbox One"
        };
        double[] preus = {49.99, 59.99, 59.99, 59.99, 10.00, 19.99};
        int[] unitats = {10, 1, 7, 8, 3, 15};


        emmagatzemarDades(fitxer, quantitatJocs, nomsJocs, plataformes, preus, unitats);
        System.out.println("Total jocs: " + afegirJoc(fitxer, "The Witcher 3", "PC", "29.99", "9"));
        System.out.println("\nQuantitat de jocs: " + obtenirQuantitatVideojocs(fitxer) + "\n");
        mostrarVidejocs(fitxer);
        System.out.println("\nPreu total de l'estoc: " + preuEstoc(fitxer) + "€");
    }
}