package A10;

public class NIF {
    private int numero;
    private String lletra;

    public NIF(int numero) {
        setNumero(numero);
        setLletra(lletra);
    }

    private String calcularLletra() {
        String str = String.valueOf(getNumero());
        String[] lletres = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int resultat = numero % 23;

        this.lletra = lletres[resultat];

        return this.lletra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        String str = String.valueOf(getNumero());
        if (str.length() == 8) {
            this.numero = numero;
        }
    }

    public String getLletra() {
        return calcularLletra();
    }

    public void setLletra(String lletra) {
        this.lletra = lletra;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "numero=" + numero +
                ", lletra='" + lletra + '\'' +
                '}';
    }
}
