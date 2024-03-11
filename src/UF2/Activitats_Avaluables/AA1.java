public class AA1 {
    public static boolean esPotColocarTaula(String[][] restaurant, int fila, int columna) {
        // Comprovem que la posició donada no sigui un lavabo
        if (restaurant[fila][columna].equals("W")) {
            return false;
        }

        int max = 3; // Les posicions màximes desde la posicio donada

        // Mirem les posiciones verticals
        for (int i = fila - max; i <= fila + max; i++) {
            if (i >= 0 && i < restaurant.length && i != fila && restaurant[i][columna].equals("W")) {
                return false;
            }
        }

        // Mirem les posiciones horizontals
        for (int j = columna - max; j <= columna + max; j++) {
            if (j >= 0 && j < restaurant[0].length && j != columna && restaurant[fila][j].equals("W")) {
                return false;
            }
        }

        //Mirem les diagonals
        for (int i = fila - max; i < fila + max; i++) {
            for (int j = columna - max; j < columna + max; j++) {
                if (j >= 0 && j < restaurant[0].length && j != columna && restaurant[fila][j].equals("W")) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void mostrarTaulesValides(String[][] restaurant) {
        for (int fila = 0; fila < restaurant.length; fila++) {
            for (int columna = 0; columna < restaurant[0].length; columna++) {
                if (esPotColocarTaula(restaurant, fila, columna)) {
                    System.out.print("T"); // Imprimim "T" a les posicions on hi puguin haver taules
                } else {
                    System.out.print(restaurant[fila][columna] + "·");
                }
            }
            System.out.println();
        }
    }

    public static void escriureTaulesValides(String[][] restaurant) {
        for (int fila = 0; fila < restaurant.length; fila++) {
            for (int columna = 0; columna < restaurant[0].length; columna++) {
                if (esPotColocarTaula(restaurant, fila, columna)) {
                    // Imprimim la posició quan esPotColocarTaula sigui true
                    System.out.print("(" + fila + ", " + columna + ") ");
                }
            }
        }
    }


    public static void main(String[] args) {
        //Declarem la matriu del restaurant
        String[][] restaurant = {{"", "", "W", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "W", ""},
                {"", "", "", "", "", "", "", "", "", ""},
                {"", "", "", "", "W", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "W", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "", "W"},
                {"", "", "", "", "", "", "", "", "", ""}};

        mostrarTaulesValides(restaurant);
        System.out.print("Les taules vàlides són: ");
        escriureTaulesValides(restaurant);

    }
}