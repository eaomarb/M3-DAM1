package Serie;

public class Serie {
    private String nom;
    private String lloc;
    private String idioma;
    private double valoracio;
    private int any;
    private String descripcio;
    private Temporada[] temporades;

    public String getNom() {
        return nom;
    }

    public String getIdioma() {
        return idioma;
    }

    public double getValoracio() {
        return valoracio;
    }

    public int getAny() {
        return any;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public Temporada[] getTemporades() {
        return temporades;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean setValoracio(double valoracio) {
        if (valoracio > 0 && valoracio < 10) {
            this.valoracio = valoracio;
            return true;
        } else {
            return false;
        }
    }

    public void setAny(int any) {
        this.any = any;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setTemporades(Temporada[] temporades) {
        this.temporades = temporades;
    }

    public String getLloc() {
        return lloc;
    }

    public String toString() {
        return nom + ", " + lloc + ", " + idioma;
    }

    // Constructor
    public Serie(String nom, String lloc, String idioma, double valoració,
                 int any, String descripció, Temporada[] temporades) {
        this.nom = nom;
        this.lloc = lloc;
        this.idioma = idioma;
        this.valoracio = valoracio;
        this.any = any;
        this.descripcio = descripcio;
        this.temporades = temporades;
    }

    double benificiTotal() { //Funció que donara el benifici total
        return 0.0;
    }
}
