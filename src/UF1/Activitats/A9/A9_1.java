//Fes un programa que generi una matriu de 4x4, demani els valors a l'usuari i després determini quin és el número més gran i més petit.

import java.util.Scanner;

public class A9_1 {
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

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }

        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        for (int fil = 0; fil < matriu.length; fil++) {
            for (int col = 0; col < matriu[fil].length; col++) {

                if (matriu[fil][col] < menor) {
                    menor = matriu[fil][col];
                }
                if (matriu[fil][col] > mayor) {
                    mayor = matriu[fil][col];
                }
            }
        }

        System.out.println("Menor " + menor);
        System.out.println("Mayor " + mayor);
    }
}