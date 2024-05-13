package Institut;

public class Institut {
    /*Parametres de clase*/
    private String nom;            // Nom de l'institut
    public Professor[] professors;            // Vector de professors de l'institut
    private int quantitatProfessors;    // Profes que hi ha ara a l'institut

    /*Getters & Setters*/
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /*Constructors*/

    /**
     * CONSTRUCTOR - Retorna un institut amb capacitat per a 10 professors
     */
    public Institut() {
        professors = new Professor[10];
        quantitatProfessors = 0;
    }

    /**
     * CONSTRUCTOR - Retorna un nou institut
     *
     * @param nom       de l'institut
     * @param maxProfessors quants professors pot tenir com a maxim
     */
    public Institut(String nom, int maxProfessors) {
        this.nom = nom;
        professors = new Professor[maxProfessors];
        quantitatProfessors = 0;
    }

    /*Funcions privades*/

    /**
     * Torna un llistat de tots els professors de l'institut
     *
     * @return llistat de professors
     */
    private String llistaProfessors() {
        String llista = "";
        for (int i = 0; i < quantitatProfessors; i++) {
            llista += professors[i] + "\n";
        }
        return llista;
    }

    /*Funcions públiques*/

    /**
     * Genera un String amb les dades de l'institut
     */
    public String toString() {
        return "Institut " + nom + " [" + quantitatProfessors + "/" + professors.length + "]\n"
                + llistaProfessors();
    }

    /**
     * Afegeix un nou professor a l'institut, passant les dades del professor
     *
     * @param nom  del professor
     * @param edat del professor
     * @param dni  del professor
     */
    public void afegeixProfessor(String nom, int edat, String dni) {
        if (quantitatProfessors < professors.length) {
            professors[quantitatProfessors] = new Professor(nom, edat, dni);
            quantitatProfessors++;
        }
    }

    /**
     * Afegeix un nou professor a l'institut, passant el professor
     *
     * @param professor que volem afegir
     */
    public void afegeixProfessor(Professor professor) {
        if (quantitatProfessors < professors.length) {
            professors[quantitatProfessors] = professor;
            quantitatProfessors++;
        }
    }

    /**
     * Incrementa un any, utilitzant getters i setters
     */
    public void nouCursInstitut() {
        for (int i = 0; i < quantitatProfessors; i++) {
            professors[i].setEdat(professors[i].getEdat() + 1);
        }
    }

    /**
     * Incrementa un any, utilitzant un metode de professor
     */
    public void nouCursProfessor() {
        for (int i = 0; i < quantitatProfessors; i++) {
            professors[i].afegeixAny();
        }
    }
}