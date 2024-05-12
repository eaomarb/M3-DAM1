package A2;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        /* S'inicialitzen les variables que fan falta */
        final int MAX_INTENTS = 3;
        Scanner scanner = new Scanner(System.in);
        boolean haGuanyat = false;
        int intentActual = 1;
        double random = Math.random(); // Aquest mètode genera un decimal aleatori del 0 al 1

        /*Es multiplica el decimal x100 i es pasa a un enter*/
        random *= 100;
        int numeroAleatori = (int) random;

        /*Si el numero es major que 10 es trunca el numero (dividint entre 10) per a que estigui dintre del rang de 0-10*/
        if (numeroAleatori > 10) {
            numeroAleatori /= 10;
        }

        /* Es suma +1 si es 0 ja que el numero mínim ha de ser 1*/
        if (numeroAleatori == 0) {
            numeroAleatori++;
        }

        /*Es comprova que l'intent actual estigui entre 1 i 3 i que tampoc l'usuari hagi guanyat*/
        while (intentActual <= MAX_INTENTS && !haGuanyat) {
            System.out.println(numeroAleatori);
            System.out.println("Adivina el numero correcte (1-10)");
            int numeroUsuari = scanner.nextInt();

            /* Es diu si el numero aleatori es major o menor */
            if (numeroUsuari < numeroAleatori) {
                System.out.println("Major!");
            } else if (numeroUsuari > numeroAleatori) {
                System.out.println("Menor!");
            } else {
                haGuanyat = true; // El programa surt del bucle una vegada ha guanyat l'usuari
            }

            intentActual++;
        }

        if (haGuanyat) {
            System.out.println("El numero és correcte, has guanyat!!");
        } else {
            System.out.println("Has esgotat el màxim d'intents :(");
            System.out.println("El nombre correcte era " + numeroAleatori);
        }
    }
}
