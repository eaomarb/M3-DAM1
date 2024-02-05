public class A2_1 {
    public static double percentatgePlacesLliuresFila(boolean[][] parking, int fila) {
        int placesLliures = 0;
        for (int columna = 0; fila < parking[fila].length; columna++) {
            if (parking[fila][columna]) {
                placesLliures++;
            }
        }
        return ((double) placesLliures / parking[fila].length) * 100;
    }

    public static double percentatgePlacesLliuresParking(boolean[][] parking, int fila){
        int placesLliures
    }

    public static void main(String[] args) {
        boolean[][] parking =
                {{true, false, false, true, true},
                        {false, true, true, true, true},
                        {true, false, false, true, false},
                        {false, true, true, false, true}};

    }
}
