package Rellotge;

public class Main {
    public static void main(String[] args) {
        Rellotge rellotge1 = new Rellotge();
        Rellotge rellotge2 = new Rellotge(23, 59, 59);
        Rellotge rellotge3 = new Rellotge(25, 58, 7);

        System.out.println("Rellotges sense modificar");
        System.out.println("Rellotge 1 ->  " + rellotge1);
        System.out.println("Rellotge 2 ->  " + rellotge2);
        System.out.println("Rellotge 3 ->  " + rellotge3);
        System.out.println();

        System.out.println("Rellotges modificats");
        if (rellotge1.modificarHora(7, 33, 100)) {
            rellotge1.modificarHora(7, 33, 100);
            System.out.println("Rellotge 1 OK -> " + rellotge1);
        } else {
            System.out.println("Rellotge 1 no valid -> " + rellotge1);
        }

        if (rellotge2.modificarHora(16, 9, 59)) {
            rellotge2.modificarHora(16, 9, 59);
            System.out.println("Rellotge 2 OK -> " + rellotge2);
        } else {
            System.out.println("Rellotge 2 no valid -> " + rellotge2);
        }

        if (rellotge3.modificarHora(30, 55, 15)) {
            rellotge3.modificarHora(30, 55, 15);
            System.out.println("Rellotge 3 OK -> " + rellotge3);
        } else {
            System.out.println("Rellotge 3 no valid -> " + rellotge3);
        }

        System.out.println();


        System.out.println("Rellotges amb +1 segon");
        rellotge1.addOneSecond();
        rellotge2.addOneSecond();
        rellotge3.addOneSecond();

        System.out.println("Rellotge 1 -> " + rellotge1);
        System.out.println("Rellotge 2 -> " + rellotge2);
        System.out.println("Rellotge 3 -> " + rellotge3);
        System.out.println();

        System.out.println("Rellotges sumats una quantitat de segons determinada");
        rellotge1.addSeconds(59);
        rellotge2.addSeconds(4000);
        rellotge3.addSeconds(8);

        System.out.println("Rellotge 1 -> " + rellotge1);
        System.out.println("Rellotge 2 -> " + rellotge2);
        System.out.println("Rellotge 3 -> " + rellotge3);
    }
}
