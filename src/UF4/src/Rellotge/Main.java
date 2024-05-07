package Rellotge;

public class Main {
    public static void main(String[] args) {
        Rellotge rellotge1 = new Rellotge();
        Rellotge rellotge2 = new Rellotge(1, 58, 7);

        System.out.println("Rellotge 1 sense modificar -> " + rellotge1);
        System.out.println("Rellotge 2 sense modificar ->  " + rellotge2);

        rellotge1.modificarHora(7, 33, 42);
        System.out.println("Rellotge 1 modificat ->" + rellotge1);

        rellotge2.modificarHora(18, 9, 10);
        System.out.println("Rellotge 2 modificat ->" + rellotge2);


    }
}
