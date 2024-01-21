//Fes un programa que generi una matriu de 4x4, demani els valors a l'usuari i després determini la suma de cadascuna de les files i les columnes.

import java.util.Scanner;

public class A9_2 {
    public static void main(String[] args) {
        int[][] matriu = new int[4][4];

        Scanner teclat = new Scanner(System.in);

        for (int fila = 0; fila < matriu.length; fila++) {
            System.out.println("Fila " + (fila + 1));
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                System.out.println("Introdueix el valor de la columna " + (columna + 1) + ":");
                matriu[fila][columna] = teclat.nextInt();
            }
        }

        System.out.println("La teva matriu: \n");

        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                System.out.print(matriu[fila][columna] + " ");
            }
            System.out.println();
        }

        for (int fila = 0; fila < matriu.length; fila++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                sumaFila = sumaFila + matriu[fila][columna];
                sumaColumna = sumaColumna + matriu[columna][fila];
            }
            System.out.println();
        }
    }
}