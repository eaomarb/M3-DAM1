import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class A1_5 {
    public static void addDate(int day, int month, int year, String description) throws Exception {
        File file = new File("src/UF3/Activitats/A1/A1_5.txt");
        FileWriter fileWriter = new FileWriter(file, true);

        if (file.length() != 0) {
            fileWriter.write("\n" + day + " " + month + " " + year + " " + description);
        } else {
            fileWriter.write(day + " " + month + " " + year + " " + description);
        }

        fileWriter.close();
    }

    public static int findLineByDate(int day, int month, int year) throws Exception {
        File file = new File("src/UF3/Activitats/A1/A1_5.txt");
        Scanner scFile = new Scanner(file);

        int line = 1;
        while (scFile.hasNextLine()) {
            if (scFile.nextInt() == day && scFile.nextInt() == month && scFile.nextInt() == year) {
                return line;
            } else {
                scFile.nextLine();
                line++;
            }
        }
        return -1;
    }


    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the day: ");
        String strDay = kb.nextLine();

        System.out.println("Enter the month: ");
        String strMonth = kb.nextLine();

        System.out.println("Enter the year: ");
        String strYear = kb.nextLine();

        System.out.println("Enter the description: ");
        String description = kb.nextLine();

        int day = Integer.parseInt(strDay);
        int month = Integer.parseInt(strMonth);
        int year = Integer.parseInt(strYear);

        addDate(day, month, year, description);

        System.out.println(findLineByDate(10, 11, 20223));
    }
}