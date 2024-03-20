public class Exemple {
    public static void main(String[] args) {
        String[] noms = new String[10];
        int[] energia = new int[10];
        int personatges = 0;

        mostra("entrada.txt");
        personatges = carrega("entrada.txt", noms, energia);
        energia("Vegetta", noms, energia, 0);
        desa("Vegetta")
    }
}
