package Institut;

import java.util.regex.Pattern;

public class Professor {
    // PARAMETRES DE CLASSE
    //////////////////////////////////////////////////////////////////
    private String nom;			// Nom del profe
    private int    edat;		// Edat del profe
    private String dni;			// DNI del profe

    // GETTERS I SETTERS
    //////////////////////////////////////////////////////////////////
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
        if (edat>0) {
            this.edat = edat;
        }
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        // Comprovem que el DNI te el format correcte
        Pattern pattern = Pattern.compile("\\d{8}[A-Z]");
        if (pattern.matcher(dni).matches()) {
            this.dni = dni;
        }
    }

    // CONSTRUCTORS
    //////////////////////////////////////////////////////////////////
    /**
     * CONSTRUCTOR - Retorna un profe amb les dades indicades
     * @param nom del profe
     * @param edat del profe
     * @param dni del profe
     */
    public Professor(String nom, int edat, String dni) {
        this.nom = nom;
        this.edat = edat;
        this.dni = dni;
    }

    // FUNCIONS PUBLIQUES
    //////////////////////////////////////////////////////////////////
    /**
     * Genera un String amb les dades del profe
     */
    public String toString() {
        return dni+" - "+nom+" ("+edat+")";
    }

    /**
     * Afegeix un any a l'edat del profe
     */
    public void afegeixAny() {
        edat++;
    }
}