public class Insti {
	// PARAMETRES DE CLASSE
	//////////////////////////////////////////////////////////////////
	private String  nom;			// Nom de l'insti
	public  Profe[] profes;			// Vector de profes de l'insti
	private int     quantsProfes;	// Profes que hi ha ara a l'insti
	
	// GETTERS I SETTERS
	//////////////////////////////////////////////////////////////////
	// NO FALTEN GETTERS I SETTERS ???????????????
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// CONSTRUCTORS
	//////////////////////////////////////////////////////////////////
	/**
	 * CONSTRUCTOR - Retorna un insti amb capacitat per a 10 profes
	 */
	public Insti() {
		profes = new Profe[10];
		quantsProfes = 0;
	}
	
	/**
	 * CONSTRUCTOR - Retorna un nou insti
	 * @param nom de l'insti
	 * @param maxProfes quants profes pot tenir com a maxim
	 */
	public Insti(String nom, int maxProfes) {
		this.nom = nom;
		profes = new Profe[maxProfes];
		quantsProfes = 0;
	}
	
	// FUNCIONS PRIVADES
	//////////////////////////////////////////////////////////////////
	/**
	 * Torna un llistat de tots els profes de l'insti
	 * @return llistat de profes
	 */
	private String llistaProfes() {
		String llista="";
		for (int i=0; i<quantsProfes; i++) {
			llista+=profes[i]+"\n";
		}
		return llista;
	}
	
	// FUNCIONS PUBLIQUES
	//////////////////////////////////////////////////////////////////
	/**
	 * Genera un String amb les dades de l'insti
	 */
	public String toString() {
		return "Insti "+ nom +" ["+ quantsProfes +"/"+ profes.length +"]\n" 
				+ llistaProfes();
	}
	
	/**
	 * Afegeix un nou profe a l'insti, passant les dades del profe
	 * @param nom del profe
	 * @param edat del profe
	 * @param dni del profe
	 */
	public void afegeixProfe(String nom, int edat, String dni) {
		if (quantsProfes<profes.length) {
			profes[quantsProfes] = new Profe(nom,edat,dni);
			quantsProfes++;
		}
	}
	
	/**
	 * Afegeix un nou profe a l'insti, passant el profe
	 * @param profe que volem afegir
	 */
	public void afegeixProfe(Profe profe) {
		if (quantsProfes<profes.length) {
			profes[quantsProfes] = profe;
			quantsProfes++;
		}
	}
	
	/**
	 * Incrementa un any, utilitzant getters i setters
	 */
	public void nouCursInsti() {
		for (int i=0; i<quantsProfes; i++) {
			profes[i].setEdat(profes[i].getEdat()+1);
		}
	}
	
	/**
	 * Incrementa un any, utilitzant un metode de profe
	 */
	public void nouCursProfe() {
		for (int i=0; i<quantsProfes; i++) {
			profes[i].afegeixAny();
		}
	}
}