import java.util.Scanner;

public class A2_1 {
    public static double percentatgePlacesLliuresFila(boolean[][] parking, int fila) {
        int placesLliures = 0;
        for (int columna = 0; columna < parking[fila].length; columna++) {
            if (!parking[fila][columna]) {
                placesLliures++;
            }
        }
        return ((double) placesLliures / parking[fila].length) * 100;
    }

    public static double percentatgePlacesLliuresParking(boolean[][] parking) {
        double placesLliures = 0;
        for (int fila = 0; fila < parking.length; fila++) {
            placesLliures += percentatgePlacesLliuresFila(parking, fila);
        }
        return placesLliures / parking.length;
    }

    public static double numFilaMesLliure(boolean[][] parking) {
        double filaMesLliure = -1;
        double maxPercentatge = 0;

        for (int fila = 0; fila < parking.length; fila++) {
            double percentatge = percentatgePlacesLliuresFila(parking, fila);

            if (percentatge > maxPercentatge) {
                maxPercentatge = percentatge;
                filaMesLliure = fila;
            }
        }
        return filaMesLliure;
    }


    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        boolean[][] parking =
                {{true, false, false, true, true},
                        {false, true, true, true, true},
                        {true, false, false, true, false},
                        {false, true, true, false, true}};

        while (true) {

            System.out.println("Que vols fer:");

            System.out.println("1. Percentatge places lliures per fila");

            System.out.println("2. Percentatge places lliures al parquing");

            System.out.println("3. Numero de fila mes lliure");

            System.out.println("4. Sortir");


            int opcio = teclat.nextInt();


            switch (opcio) {

                case 1:
                    System.out.println("De quina fila vols saber el percentatge de places lliures?");
                    int fila = teclat.nextInt();
                    System.out.println("Fila " + (fila) + ": " + percentatgePlacesLliuresFila(parking, fila-1) + "%");
                    break;

                case 2:

                    System.out.println("Percentatge places lliures al pàrquing: " + percentatgePlacesLliuresParking(parking) + "%");

                    break;

                case 3:

                    System.out.println("Número de fila més lliure: " + (numFilaMesLliure(parking) + 1));

                    break;

                case 4:

                    System.out.println("Has sortit del programa!");

                    return;

                default:

                    System.out.println("Opció invàlida. Torna a provar.");

            }

        }

    }
}
