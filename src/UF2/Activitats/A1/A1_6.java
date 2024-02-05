import java.util.Scanner;

public class A1_6 {
    /**
     @param language (english, spanish, catalan)
     @param dayOrNight (day, night)
     */
    public static void greeting(String language, String name, String dayOrNight) {
        Scanner kb = new Scanner(System.in);

        if (language.equalsIgnoreCase("english") && dayOrNight.equalsIgnoreCase("day")) {
            System.out.println("Good morning, " + name);

        } else if (language.equalsIgnoreCase("english") && dayOrNight.equalsIgnoreCase("night")){
            System.out.println("Good night, " + name);
        }
        else if (language.equalsIgnoreCase("spanish") && dayOrNight.equalsIgnoreCase("day")) {
            System.out.println("Buenos días, " + name);
        } else if (language.equalsIgnoreCase("spanish") && dayOrNight.equalsIgnoreCase("night")) {
            System.out.println("Buenas noches, " + name);
        } else if (language.equalsIgnoreCase("catalan") && dayOrNight.equalsIgnoreCase("day")) {
            System.out.println("Bon dia, " + name);
        } else if (language.equalsIgnoreCase("catalan") && dayOrNight.equalsIgnoreCase("night")) {
            System.out.println("Bona nit, " + name);
        }
    }

    public static void main(String[] args) {
        greeting("english", "omar", "night");
    }
}