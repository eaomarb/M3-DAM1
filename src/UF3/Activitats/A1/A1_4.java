import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class A1_4 {
    public static void writeWordToFile(String word) throws IOException {
        FileWriter file = new FileWriter("src/UF3/Activitats/A1/A1_4.txt", true);

        file.write(word + "\n");
        file.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the word to append: ");
        String word = kb.next();

        writeWordToFile(word);
    }
}