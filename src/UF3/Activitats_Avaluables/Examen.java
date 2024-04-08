import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Examen {
    public static int quantitatTemes(String nomFitxer) throws Exception {
        /*
        Inicialitzem un nou fitxer amb File.
        nomFitxer ha de ser la ruta del fitxer o bé el nom d'aquest
        */
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer); //  Inicialitzem Scanner per poder llegir el fitxer

        int quantitatTemes = 0; //  Inicialitzem la quantiat de temes

        //  Anem llegint el fitxer mentre hi hagi una següent linia
        while (scFitxer.hasNextLine()) {
            scFitxer.nextLine(); // Saltem una linia
            quantitatTemes++; // Afegim un tema més a la quantitat total
            scFitxer.nextLine();
        }
        scFitxer.close(); //    Tanquem el Scanner
        return quantitatTemes; //   Retornem la quantitat total de temes que hi ha al fitxer
    }

    public static int quantitatAnys(String nomFitxer) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);

        int quantitatAnys = 0;


        while (scFitxer.hasNextLine()) {
            scFitxer.nextLine();
            /*
             Saltem una linia i mirem si hi ha una linia més al fitxer
             Si hi ha una linia més i mentre hi hagi un enter a aquesta linia el sumem a quantitatAnys
             */

            if (scFitxer.hasNextLine()) {
                while (scFitxer.hasNextInt()) {
                    quantitatAnys++;
                    scFitxer.nextInt();
                }
            }

        }
        scFitxer.close();
        return quantitatAnys; //    Retornem la quantitat total de anys que té el fitxer, és a dir, tots els temes
    }

    public static void carregar(String nomFitxer, String[] temes, int[][] anys) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);

        int llegits = 0; // Declarem els temes llegits

        while (scFitxer.hasNextLine()) {
            for (int i = 0; i < temes.length; i++) {
                if (scFitxer.hasNextLine()) {
                    //  Carreguem en memoria les cançons a l'array
                    temes[llegits] = scFitxer.nextLine();
                }
            }

            /*
              Comprovem si hi ha una linia més al fitxer i mirem el següent enter
              que hi hagi, els enters que hi hagin en aquesta linia s'afegeixen a la matriu anys
              com a reproduccions (en milions) per any de cada tema
             */
            if (scFitxer.hasNextLine()) {
                for (int i = 0; i < anys.length; i++) {
                    for (int j = 0; j < anys.length; j++) {
                        while (scFitxer.hasNextInt()) {
                            anys[i][j] = scFitxer.nextInt();
                        }
                    }
                }
                llegits++; //   Incrementem les cançons
            }
        }
    }

    public static int calcularBeneficis(int[][] anys) throws Exception {
        int beneficis = 146562;


        int reproduccions = 0;
        double beneficisPerAny = 1;

        /*for (int i = 0; i < anys[tema].length; i++) {
            reproduccions += anys[tema][i];
            beneficis += (reproduccions * 1000) * beneficisPerAny;
            beneficisPerAny = beneficisPerAny / 2;
            beneficisPerAny++;
        }*/


        return beneficis;
    }

    public static int temaAmbMesBeneficis(int[][] anys) throws Exception {
        int max = Integer.MIN_VALUE;
        int beneficis = calcularBeneficis(anys);
        int temaAmbMesBeneficis = 0;
        for (int i = 0; i < anys.length; i++) {
            for (int j = 0; j < anys[i].length; j++) {
                if (beneficis > max){
                    max = beneficis;
                }
            }
        }

        return 0;
    }

    public static void mostrarDades(int[][] anys, String[] temes) {
        //  Recorrem la matriu anys i l'array temes i mostrem les dades d'aquests
        for (int i = 0; i < anys.length; i++) {
            System.out.print("1000$ " + temes[i] + " - Rep: ");
            for (int j = 0; j < anys[i].length; j++) {
                if (j == anys[i].length - 1) {
                    System.out.print(anys[i][j]);
                } else {
                    System.out.print(anys[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }

    public static void guardarDades(String nomFitxer, String[] temes, int[][] anys) throws Exception {
        File fitxer = new File(nomFitxer);
        PrintWriter printWriter = new PrintWriter(fitxer); //   Declarem PrintWriter per poder escriure al fitxer


        //  Escrivim al fitxer les dades amb una estructura
        for (int i = 0; i < temes.length; i++) {
            printWriter.println(temes[i]);
            for (int j = 0; j < anys[i].length; j++) {
                printWriter.print(anys[i][j] + " ");
            }
            if (i < temes.length - 1) {
                printWriter.println();
            }

        }

        printWriter.close(); // Tanquem PrintWriter
    }

    public static void ordenarTemesPerBeneficis(String nomFitxer, String[] temes, int[][] anys) throws Exception {
        guardarDades(nomFitxer, temes, anys);
        mostrarDades(anys, temes);
    }

    public static void main(String[] args) throws Exception {
        String nomFitxer = "kiss.txt"; //   Guardem el nom del fitxer

        //  Declarem les cançons a l'array
        String[] temes = {"Deuce", "Rocket Ride", "Rock And Roll All Nite", "God Of Thunder", "Detroit Rock City"};
        int[][] anys = {    // Declarem les reproduccions (en milions) de tots els anys de cada tema
                {79, 43, 25, 58, 94,}, // tema 1
                {60, 12, 17, 38, 82}, // tema 2
                {91, 72, 49, 15, 87}, // tema 3
                {85, 30, 69, 33, 81}, // tema 4
                {56, 76, 14, 67, 93} // tema 5
        };

        //  Executem les funcions
        guardarDades(nomFitxer, temes, anys);
        mostrarDades(anys, temes);
        carregar(nomFitxer, temes, anys);
        System.out.println(quantitatAnys(nomFitxer));
        System.out.println(quantitatTemes(nomFitxer));
        System.out.println(calcularBeneficis(anys));
        ordenarTemesPerBeneficis(nomFitxer, temes, anys);
        System.out.println(temaAmbMesBeneficis(anys));
    }
}
