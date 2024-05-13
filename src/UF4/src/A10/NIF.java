package A10;

public class NIF {
    /*Variables de clase*/
    private int numero;
    private String lletra;

    /**
     * S'inicialitza el constructor
     *
     * @param numero del NIF sense lletra
     */
    public NIF(int numero) {
        setNumero(numero);
        setLletra();
    }

    /**
     * Aquesta funció calcula la lletra en funció del número donat del NIF y assigna la lletra calculada a la variable lletra de la instància
     */
    private void calcularLletra() {
        String str = String.valueOf(getNumero()); // Es converteix el número a String per comptar la longitud del número

        /* Per calcular la lletra s'ha de calcular el mòdul del numero dividit entre 23,
         * llavors el mòdul calculat es la posició a l'array lletres
         * */
        String[] lletres = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int resultat = getNumero() % 23;

        /*La longitud d'un NIF ha de ser de 8*/
        if (str.length() <= 8) {
            this.lletra = lletres[resultat];
        }
    }

    /**
     * Aquesta funció comprova si el NIF esta complet, si no ho esta s'afegeix els 0 que facin falta al principi
     * @return
     */
    private String emplenarNIF() {
        String str = String.valueOf(getNumero());

        for (int i = 0; i < 7; i++) {
            if (str.length() < 8) {
                str = "0" + str;
            }
        }

        return str;
    }

    public void setNumero(int numero) {
        String str = String.valueOf(numero);
        if (str.length() != 8) {
            emplenarNIF();
        }
        this.numero = numero;
    }

    public void setLletra() {
        calcularLletra();
    }

    public int getNumero() {
        return numero;
    }

    public String getLletra() {
        return lletra;
    }

    /**
     * Comprova que el NIF sigui correcte, igual o menor a 8 dígits
     * @return el nif correcte o si no és correcte retorna un missatge d'error
     */
    @Override
    public String toString() {
        String str = emplenarNIF();

        if (String.valueOf(getNumero()).length() <= 8) {
            return str + "-" + getLletra();
        } else {
            return "El número és major que 8!";
        }

    }
}
