public class A1_5 {
    public static void greeting(String language, String name) {
        if (language.equalsIgnoreCase("english")) {
            System.out.println("Good morning, " + name);
        } else if (language.equalsIgnoreCase("spanish")) {
            System.out.println("Buenos días, " + name);
        } else if (language.equalsIgnoreCase("catalan")) {
            System.out.println("Bon dia, " + name);
        }
    }

    public static void main(String[] args) {
    }
}