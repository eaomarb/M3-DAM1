package A10;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(29, 2, 2024);
        NIF nif = new NIF(12381273);

        System.out.println(data);

        data.afegir1Dia();
        System.out.println("Data nova (+1 dia): " + data);


        nif.getLletra();
        System.out.println(nif);
    }
}