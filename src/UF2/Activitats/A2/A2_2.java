public class A2_2 {
    public static boolean esPodenPlantarBledesFila(String[][] hort, int fila) {
        boolean esPodenPlantarBledesFila = true;

        for (int columna = 0; columna < hort[columna].length; columna++) {
            if (hort[fila][columna].equalsIgnoreCase("E") ||
                    hort[fila][columna].equalsIgnoreCase("B") ||
                    hort[fila][columna].equalsIgnoreCase("R")) {
                esPodenPlantarBledesFila = false;
            }
        }
        return esPodenPlantarBledesFila;
    }

    public static int numFilaOnPodenPlantarBledesMatriu(String[][] hort) {
        int numFilaOnPodenPlantarBledesMatriu = -1;

        for (int fila = 0; fila < hort.length; fila++) {
            boolean esPodenPlantarBledesFila = esPodenPlantarBledesFila(hort, fila);
            if (esPodenPlantarBledesFila){
                numFilaOnPodenPlantarBledesMatriu = fila;
            }

        }
        return numFilaOnPodenPlantarBledesMatriu;
    }

    public static void main(String[] args) {
        //T → Tomàquets
        //E → Enciams
        //B → Bledes
        //R → Raves
        String[][] hort = {{"T", "T", "R", "T"},
                {"-", "-", "-", "-"},
                {"-", "-", "T", "-"},
                {"R", "E", "E", "-"},
                {"R", "E", "-", "E"},
        };

    }
}
