import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A1_5 {
    public static void writeToFile(int day, int month, int year, String description) throws IOException {
        FileWriter file = new FileWriter("src/UF3/Activitats/A1/A1_5.txt", true);

        file.write(day + "/" + month + "/" + year + " " + description + "\n");
        file.close();
    }

    public static int findDate(int day, int month, int year) throws IOException {
        FileWriter file = new FileWriter("src/UF3/Activitats/A1/A1_5.txt", true);
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);


        System.out.println("Enter the day: ");
        String day = kb.nextLine();

        System.out.println("Enter the month: ");
        String month = kb.nextLine();

        System.out.println("Enter the year: ");
        String year = kb.nextLine();

        System.out.println("Enter the description: ");
        String description = kb.nextLine();

    }
}