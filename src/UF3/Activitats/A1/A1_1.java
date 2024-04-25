import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// Escriu una funció que donat el nom d'un fitxer, retorni el nombre de paraules que té dins.

public class A1_1 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Introdueix un nom fitxer: ");
        String nomFitxer = tc.next();
        tc.close();
        try {
            System.out.println("El nombre de paraules del fitxer es: " + contadorParaules(nomFitxer));
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat.");
        }
    }

    public static int contadorParaules(String nomFitxer) throws FileNotFoundException {
        int comptador = 0;
        File fitxer = new File(nomFitxer);
        Scanner scFitxer = new Scanner(fitxer);

        while (scFitxer.hasNext()) {
            scFitxer.next();
            comptador++;
        }
        scFitxer.close();

        return comptador;
    }
}