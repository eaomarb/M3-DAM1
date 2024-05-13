package Serie;

public class SerieTester {
    public static void main(String[] args) {
        Temporada[] temporades = new Temporada[2];
        temporades[0] = new Temporada();
        temporades[1] = new Temporada();

        Serie serie = new Serie("La millor", "Boston", "English", 7, 2024, "The best", temporades); //Declaració d'objecte

        System.out.println("Serie: " + serie);
    }
}