//Crear una funció que rebi 3 números com a paràmetres i digui el màxim.
public class A1_1 {

    public static int numeroMaxim(int n1, int n2, int n3) {

        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {
        System.out.println(numeroMaxim(99, 99, 8));
    }
}
