import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class A1_3 {
    public static void swapCase() throws FileNotFoundException {
        //Llegim el fitxer i el guardem com a inputFile amb el Scanner
        Scanner inputFile = new Scanner(new File("src/UF3/Activitats/A1/A1_3.txt"));

        while (inputFile.hasNextLine()) {
            String str = inputFile.nextLine();
            char[] strToChar = str.toCharArray();
            char c;

            for (int i = 0; i < strToChar.length; i++) {
                c = strToChar[i];
                if (Character.isLowerCase(c)) {
                    strToChar[i] = Character.toUpperCase(c);
                } else {
                    strToChar[i] = Character.toLowerCase(c);
                }
            }

            String string = new String(strToChar);
            System.out.println(string);

        }


        inputFile.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        swapCase();
    }
}
