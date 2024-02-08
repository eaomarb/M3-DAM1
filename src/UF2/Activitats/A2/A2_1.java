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
        double maxPercentatge = Integer.MAX_VALUE;

        for (int fila = 0; fila < parking.length; fila++) {
            double percentatge = percentatgePlacesLliuresFila(parking, fila);

            if (percentatge < maxPercentatge) {
                maxPercentatge = percentatge;
                filaMesLliure = fila;
            }
        }
        return filaMesLliure;
    }


    public static void main(String[] args) {
        boolean[][] parking =
                {{true, false, false, true, true},
                        {false, true, true, true, true},
                        {true, false, false, true, false},
                        {false, true, true, false, true}};
        System.out.println(numFilaMesLliure(parking));

    }
}
