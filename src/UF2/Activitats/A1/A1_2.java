/*A partir d'uns números introduïts per l'usuari en un vector, fer 4 funcions:
· Una funció que digui el valor màxim del vector
· Una funció que digui el valor mínim del vector
· Una funció que digui la mitjana del vector
· Una funció que, calculant la mitjana del vector, digui quantes posicions estan per sobre
*/

import java.util.Scanner;

public class A1_2 {
    public static int maxim(int[] numeros) { // Retorna el valor màxim del array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    public static int minim(int[] numeros) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    public static double mitjana(int[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static int posicionsSobreMitjana(int[] numeros) {
        int posicions = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mitjana(numeros)) {
                posicions++;
            }
        }
        return posicions;
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int[] numeros = new int[4];
        String hola = "hola";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introdueix el valor " + (i + 1));
            numeros[i] = teclat.nextInt();
        }

        System.out.println("Màxim: " + maxim(numeros));
        System.out.println("Mínim: " + minim(numeros));
        System.out.println("Mitjana: " + mitjana(numeros));
        System.out.println("Posicions sobre la mitjana: " + posicionsSobreMitjana(numeros));


    }
}
