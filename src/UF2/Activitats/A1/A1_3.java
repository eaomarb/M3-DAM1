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
            for (int columnes = 0; columnes < matriu.length; columnes++) {
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
            for (int columnes = 0; columnes < matriu.length; columnes++) {
                if (matriu[files][columnes] < min) {
                    min = matriu[files][columnes];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Quantes files vols?");
        int files = teclat.nextInt();

        System.out.println("Quantes columnes vols?");
        int columnes = teclat.nextInt();

        int[][] matriu = new int[files][columnes];
    }
}
