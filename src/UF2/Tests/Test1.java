// 1 - Funció que demani a l'usuari una matriu
// 2 - Funció que mostri la matriu

import java.util.Scanner;

public class Test1 {
    public static void crearMatriu() {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Quantes files vols?");
        int files = teclat.nextInt();

        System.out.println("Quantes columnes vols?");
        int columnes = teclat.nextInt();

        int[][] matriu = new int[files][columnes];
    }

    public static void mostrarMatriu() {
        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                System.out.print(matriu[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        crearMatriu();
        System.out.println("La matriu introduïda és:");
        mostrarMatriu(matriu);
    }
}
