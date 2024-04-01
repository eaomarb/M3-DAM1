import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AA2 {
    public static int obtenirQuantitatVideojocs(String nomFitxer) throws Exception {
        File fitxer = new File(nomFitxer); // src/UF3/Activitats_Avaluables/AA2.txt
        Scanner scFitxer = new Scanner(fitxer);

        return scFitxer.nextInt();
    }

    public static void mostrarVidejocs(String nomFitxer) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);
        scFitxer.nextLine();

        int quantitatVidejocs = obtenirQuantitatVideojocs(nomFitxer);
        String[] nomsJocs = new String[quantitatVidejocs];
        String[] plataformes = new String[quantitatVidejocs];
        String[] preus = new String[quantitatVidejocs];
        String[] unitats = new String[quantitatVidejocs];

        for (int i = 0; i < quantitatVidejocs; i++) {
            scFitxer.nextLine();
            nomsJocs[i] = scFitxer.nextLine();
            plataformes[i] = scFitxer.nextLine();
            preus[i] = scFitxer.nextLine();
            unitats[i] = scFitxer.nextLine();
        }


        System.out.println("-------");
        System.out.println(quantitatVidejocs + " jocs");
        System.out.println("-------");
        for (int i = 0; i < quantitatVidejocs; i++) {
            System.out.print(nomsJocs[i] + " · " + plataformes[i] + " · " + preus[i] + "€ · ");
            if (!unitats[i].equalsIgnoreCase("1")) {
                System.out.print(unitats[i] + " unitats");
            } else {
                System.out.print(unitats[i] + " unitat");
            }
            System.out.println();
        }
    }

    public static double preuEstoc(String nomFitxer) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);

        double preuEstoc = 0;
        int quantitatVidejocs = obtenirQuantitatVideojocs(nomFitxer);

        scFitxer.nextLine();
        for (int i = 0; i < quantitatVidejocs; i++) {
            if (scFitxer.hasNext()) {
                scFitxer.nextLine();
                scFitxer.nextLine();
                scFitxer.nextLine();
                preuEstoc = preuEstoc + Double.parseDouble(scFitxer.nextLine());
                scFitxer.nextLine();
            }
        }

        scFitxer.close();

        return preuEstoc;
    }

    public static void emmagatzemarDades(String nomFitxer, int quantitatJocs, String[] nomsJocs, String[] plataformes, double[] preus, int[] unitats) throws Exception {
        File fitxer = new File(nomFitxer);
        FileWriter fileWriter = new FileWriter(fitxer, true);

        fileWriter.write(quantitatJocs + "\n");
        for (int i = 0; i < quantitatJocs; i++) {
            fileWriter.write("\n" + nomsJocs[i] + "\n");
            fileWriter.write(plataformes[i] + "\n");
            fileWriter.write(preus[i] + "\n");
            fileWriter.write(unitats[i] + "\n");
        }
        fileWriter.close();
    }

    public static int afegirDadesJoc(String nomFitxer, int quantitatJocs, String nomJoc, String plataforma, String preu, String unitats) throws Exception {
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);
        FileWriter fileWriter = new FileWriter(fitxer, true);

        fileWriter.write(quantitatJocs + "\n");
//

        scFitxer.close();
        fileWriter.close();
        return quantitatJocs;
    }

    public static void main(String[] args) throws Exception {
    }
}