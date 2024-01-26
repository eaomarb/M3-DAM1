//Calculadora: Fer un programa principal que contingui un menú amb 5 opcions:
// Sumar, restar, multiplicar, dividir, sortir

//te pide n1 y n2 despues de haber introducido mal la opcion, cuando la vuelves introduces bien se acaba el programa

import java.util.Scanner;

public class A1_4 {

    public static void menuPrincipal() {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Sortir");
    }


    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public static int restar(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static double dividir(int n1, int n2) {
        return (double) n1 / n2;
    }

    public static void sortir() {
        System.out.println("Has sortit del programa, fins aviat!");
    }


    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        menuPrincipal();
        System.out.println("Escull una opció (1-5)");
        int opcio = teclat.nextInt();

        do {
            System.out.println("Introdueix el primer número: ");
            int n1 = teclat.nextInt();
            System.out.println("Introdueix el segon número: ");
            int n2 = teclat.nextInt();
            switch (opcio) {
                case 1:
                    System.out.println(sumar(n1, n2));

                    menuPrincipal();
                    break;
                case 2:
                    System.out.println(restar(n1, n2));
                    menuPrincipal();
                    break;
                case 3:
                    System.out.println(multiplicar(n1, n2));
                    menuPrincipal();
                    break;
                case 4:
                    System.out.println(dividir(n1, n2));
                    menuPrincipal();
                    break;
                case 5:
                    sortir();
                    break;
                default:
                    System.out.println("Revisa bé la opció que has escollit (1-5)!");
                    menuPrincipal();
            }
            System.out.println("Escull una opció (1-5)");
            opcio = teclat.nextInt();
        } while (opcio == 1 || opcio == 2 || opcio == 3 || opcio == 4 || opcio == 5);

    }
}
