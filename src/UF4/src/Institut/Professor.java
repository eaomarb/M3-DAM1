package Institut;

public class Professor {
    private String nom;
    private int edat;
    private String NIF;

    public Professor(String nom, int edat, String NIF) {
        this.nom = nom;
        this.edat = edat;
        this.NIF = NIF;
    }

    public void afegirAny() {
        this.edat = edat + 1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        String str;

        str = "Nom: " + this.nom + "\nEdat: " + this.edat + "\nNIF: " + this.NIF;

        return str;
    }
}
