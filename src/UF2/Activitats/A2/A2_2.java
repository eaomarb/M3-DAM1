public class A2_2 {
    public static boolean esPodenPlantarBledesFila(String[][] hort, int fila) {
        boolean esPodenPlantarBledesFila = false;
        for (fila = 0; fila < hort[fila].length; fila++) {
            for (int columna = 0; columna < hort[columna].length; columna++) {
                if (!hort[fila][columna].equalsIgnoreCase("T") || !hort[fila][columna].equalsIgnoreCase("-")) {
                    esPodenPlantarBledesFila = false;
                } else{
                    esPodenPlantarBledesFila = true;
                }
            }
        }
        return esPodenPlantarBledesFila;
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

        System.out.println(esPodenPlantarBledesFila(hort, 1));
    }
}
