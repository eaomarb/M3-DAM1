package A10;

public class Persona {
    /*Variables de classe*/
    private String nom;
    private Data data;
    private NIF nif;

    /**
     * S'inicialitza el constructor Persona amb les dades que necessita cada instància persona
     *
     * @param nom       el nom de la persona
     * @param dia       el dia de naixement -> classe Data
     * @param mes       el mes de naixement -> classe Data
     * @param any       l'any de naixement -> classe Data
     * @param numeroNif el número del NIF sense la lletra -> classe NIF
     */
    public Persona(String nom, int dia, int mes, int any, int numeroNif) {
        setNom(nom);
        Data data = new Data(dia, mes, any);
        NIF nif = new NIF(numeroNif);
        setData(data);
        setNif(nif);
    }

    /*Getters & Setters*/
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    /**
     * Retorna el format corresponent de la instància
     */
    @Override
    public String toString() {
        return getNom() + " - " + getData() + " - " + getNif();
    }
}
