import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class A1_3 {
    public static void swapCase() throws FileNotFoundException {
        // Leemos el archivo y lo guardamos como "inputFile" con Scanner
        Scanner inputFile = new Scanner(new File("src/UF3/Activitats/A1/A1_3.txt"));
        // Creamos el archivo "outputFile.txt" con PrintWriter
        PrintWriter outputFile = new PrintWriter("src/UF3/Activitats/A1/outputFile.txt");


        while (inputFile.hasNextLine()) {
            String str = inputFile.nextLine(); // Pasamos la siguiente linea del archivo como "str"
            char[] strToChar = str.toCharArray(); // Convertimos "str" a un array de caracteres

            for (int i = 0; i < strToChar.length; i++) {
                char c = strToChar[i];
                if (Character.isLowerCase(c)) {
                    strToChar[i] = Character.toUpperCase(c);
                } else {
                    strToChar[i] = Character.toLowerCase(c);
                }
            }

            String string = new String(strToChar);
            outputFile.println(string);

        }
        inputFile.close();
        outputFile.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        swapCase();
    }
}
