import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A1_5 {
    public static void writeToFile(String day, String month, String year, String description) throws IOException {
        FileWriter file = new FileWriter("src/UF3/Activitats/A1/A1_5.txt", true);

        file.write(day + "/" + month + "/" + year + " " + description + "\n");
        file.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the day: ");
        String day = kb.next();

        System.out.println("Enter the month: ");
        String month = kb.next();

        System.out.println("Enter the year: ");
        String year = kb.next();

        System.out.println("Enter the description: ");
        String description = kb.next();

        writeToFile(day, month, year, description);
    }
}