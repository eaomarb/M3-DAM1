import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1_2 {
    public static void escriureFitxer(String cadena, String nomFitxer) throws FileNotFoundException {
        File fitxer = new File(nomFitxer);
        PrintWriter prFitxer = new PrintWriter(fitxer);

        prFitxer.print(cadena.toUpperCase());
        prFitxer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el nombre del fitxer: ");
        String nomFitxer = teclat.nextLine();

        System.out.println("Introdueix el que vulguis escriure al fitxer: ");
        String cadena = teclat.nextLine();

        teclat.close();
        escriureFitxer(cadena, nomFitxer);
    }
}