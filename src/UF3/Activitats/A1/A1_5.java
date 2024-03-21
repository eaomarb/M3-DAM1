import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A1_5 {
    public static void addDate(String day, String month, String year, String description) throws IOException {
        File file = new File("src/UF3/Activitats/A1/A1_5.txt");
        FileWriter fileWriter = new FileWriter(file, true);

        if (file.length() != 0) {
            fileWriter.write("\n" + day + "/" + month + "/" + year + " " + description);
        } else {
            fileWriter.write(day + "/" + month + "/" + year + " " + description);
        }

        fileWriter.close();
    }

    public static int findLineByDate(String day, String month, String year) throws IOException {
        File file = new File("src/UF3/Activitats/A1/A1_5.txt");
        Scanner scFile = new Scanner(file);

        boolean lineFound = false;
        int = file.

        while (!lineFound) {
            if (scFile.next().equalsIgnoreCase(day)){

            }
        }
        return 0;
    }


    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the day: ");
        String day = kb.nextLine();

        System.out.println("Enter the month: ");
        String month = kb.nextLine();

        System.out.println("Enter the year: ");
        String year = kb.nextLine();

        System.out.println("Enter the description: ");
        String description = kb.nextLine();

        addDate(day, month, year, description);
    }
}