package Institut;

public class Institut {
    private String nom;
    public Professor[] profes;
    private int quantitatProfes;

    public Institut() {

    }

    public Institut(String nom, int maxProfes) {
    }

    public void afegirProfe(String nom, int edat, String DNI) {

    }

    public void afegirProfe(Professor professor) {

    }

    public void nouCurs() {

    }

    /*Getters & Setters*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Professor[] getProfes() {
        return profes;
    }

    public void setProfes(Professor[] profes) {
        this.profes = profes;
    }

    public int getQuantitatProfes() {
        return quantitatProfes;
    }

    public void setQuantitatProfes(int quantitatProfes) {
        this.quantitatProfes = quantitatProfes;
    }
}
