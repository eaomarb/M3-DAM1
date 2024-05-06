package A1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum {
    public static int sumFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int sum = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }

        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src/UF4/src/A1/sum.txt";
        System.out.println(sumFile(fileName));
    }
}