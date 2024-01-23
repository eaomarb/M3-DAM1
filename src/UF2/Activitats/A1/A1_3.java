/* Fer un programa que demani omplir una matriu de números i em permeti obtenir els següents resultats
· El valor màxim de tota la matriu
· El valor mínim de tota la matriu
· La mitjana de tota la matriu
· Donada una fila o columna, indicar el màxim de la fila o columna (segons correspongui)
· Donada una fila o columna, indicar la mitjana de la fila o columna (segons correspongui).
*/

import java.util.Scanner;

public class A1_3 {
    public static int maxim(int matriu[][]) {
        int max = Integer.MIN_VALUE;
        for (int files = 0; files < matriu.length; files++) {
            for (int columnes = 0; columnes < matriu[files].length; columnes++) {
                if (matriu[files][columnes] > max) {
                    max = matriu[files][columnes];
                }
            }
        }
        return max;
    }

    public static int minim(int matriu[][]) {
        int min = Integer.MAX_VALUE;
        for (int files = 0; files < matriu.length; files++) {
            for (int columnes = 0; columnes < matriu[files].length; columnes++) {
                if (matriu[files][columnes] < min) {
                    min = matriu[files][columnes];
                }
            }
        }
        return min;
    }

    public static double mitjana(int matriu[][]) {
        double suma = 0;
        for (int files = 0; files < matriu.length; files++) {
            for (int columnes = 0; columnes < matriu[files].length; columnes++) {
                suma += matriu[files][columnes];
            }
        }
        return suma / (matriu.length);
    }

    public static int maximFila(int matriu[][], int fila) {
        int max = Integer.MIN_VALUE;
        for (int columnes = 0; columnes < matriu[fila].length; columnes++) {
            if (matriu[fila][columnes] > max) {
                max = matriu[fila][columnes];
            }
        }
        return max;
    }

    public static int maximColumna(int matriu[][], int columna) {
        int max = Integer.MIN_VALUE;
        for (int files = 0; files < matriu.length; files++) {
            if (matriu[files][columna] > max) {
                max = matriu[files][columna];
            }
        }
        return max;
    }

    public static double mitjanaFila(int matriu[][], int fila) {
        double suma = 0;
        for (int columnes = 0; columnes < matriu[fila].length; columnes++) {
            suma += matriu[fila][columnes];
        }
        return suma / matriu[fila].length;
    }

    public static double mitjanaColumna(int matriu[][], int columna) {
        double suma = 0;
        for (int files = 0; files < matriu.length; files++) {
            suma += matriu[files][columna];
        }
        return suma / matriu.length;
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Quantes files vols?");
        int files = teclat.nextInt();

        System.out.println("Quantes columnes vols?");
        int columnes = teclat.nextInt();

        int[][] matriu = new int[files][columnes];

        for (int fila = 0; fila < matriu.length; fila++) {
            System.out.println("Fila " + (fila + 1));
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                System.out.println("Introdueix el valor per la " + (columna + 1) + ": ");
                matriu[fila][columna] = teclat.nextInt();
            }
        }

        // Mostrem la matriu
        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                System.out.print(matriu[fila][columna] + " ");
            }
            System.out.println();
        }

        System.out.println("Valor màxim de tota la matriu: " + maxim(matriu));
        System.out.println("Valor mínim de tota la matriu: " + minim(matriu));
        System.out.println("Mitjana de tota la matriu: " + mitjana(matriu));

        System.out.println("Vols saber el màxim d'alguna fila o columna? (F/C))");
        String maxFC = teclat.next();


        if (maxFC.equalsIgnoreCase("F")) {
            System.out.println("Quina fila vols?");
            int fila = teclat.nextInt();
            System.out.println(maximFila(matriu, fila - 1));
        } else if (maxFC.equalsIgnoreCase("C")) {
            System.out.println("Quina columna vols?");
            int columna = teclat.nextInt();
            System.out.println(maximColumna(matriu, columna - 1));
        }

        System.out.println("Vols saber la mitjana d'alguna fila o columna? (F/C))");
        maxFC = teclat.next();

        if (maxFC.equalsIgnoreCase("F")) {
            System.out.println("Quina fila vols?");
            int fila = teclat.nextInt();
            System.out.println(mitjanaFila(matriu, fila - 1));
        } else if (maxFC.equalsIgnoreCase("C")) {
            System.out.println("Quina columna vols?");
            int columna = teclat.nextInt();
            System.out.println(mitjanaColumna(matriu, columna - 1));
        }


    }
}
