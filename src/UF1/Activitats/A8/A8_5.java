// Programa per inserir 5 números en un vector A,
// copiar en un vector B totes les dades parells del vector A, i posteriorment visualitzar les dades del vector B.

import java.util.*;

public class A8_5 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int j = 0;
        int[] vectorA = { 2, 3, 0, 4, 1 };
        int[] vectorB = new int[5];

        for (int i = 0; i < 5; i++) {
            if (vectorA[i] % 2 == 0) {
            	vectorB[j] = vectorA[i];            	
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(vectorB[i]);	
        }
    }
}
