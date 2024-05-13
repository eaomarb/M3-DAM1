public class Rellotge {
	// PARAMETRES DE CLASSE
	//////////////////////////////////////////////////////////////////
	private int hores;
	private int minuts;
	private int segons;
	
	// GETTERS I SETTERS
	//////////////////////////////////////////////////////////////////
	public int getHores() {
		return hores;
	}

	public void setHores(int hores) {
	    if (validarHores(hores)) {
	        this.hores = hores;
	    }
	}

	public int getMinuts() {
		return minuts;
	}

	public void setMinuts(int minuts) {
	    if (validarTemps(minuts)) {
	        this.minuts = minuts;
	    }
	}

	public int getSegons() {
		return segons;
	}

	public void setSegons(int segons) {
	    if (validarTemps(segons)) {
	        this.segons = segons;
	    }
	}

	// CONSTRUCTORS
	//////////////////////////////////////////////////////////////////
	/**
	 * CONSTRUCTOR - Retorna un rellotge a 00:00:00
	 */
	public Rellotge() {
		this.hores  = 0;
		this.minuts = 0;
		this.segons = 0;
	}
	
	/**
	 * CONSTRUCTOR - Retorna un rellotge amb hores:minuts:segons
	 * @param hores que ha de marcar el rellotge
	 * @param minuts que ha de marcar el rellotge
	 * @param segons que ha de marcar el rellotge
	 */
	public Rellotge(int hores, int minuts, int segons) {
		setHores(hores);
		setMinuts(minuts);
		setSegons(segons);
	}

	// FUNCIONS PRIVADES
	//////////////////////////////////////////////////////////////////
	/** 
	 * Comprova si les hores son valides
	 * @param hores que volem validar
	 * @return true si el valor de hores esta entre 0 i 23
	 */
	private boolean validarHores(int hores) {
		return (0 <= hores && hores <= 23);
	}

	/** 
	 * Comprova si els minuts/segons son valids
	 * @param temps que volem validar
	 * @return true si el valor de temps esta entre 0 i 59
	 */
	private boolean validarTemps(int temps) {
		return (0 <= temps && temps <= 59);
	}
	
	// FUNCIONS PUBLIQUES
	//////////////////////////////////////////////////////////////////
	/**
	 * Genera un String amb l'hora del rellotge en format HH:MM:SS
	 */
	public String toString() {
		String stRellotge = "";
		
		// Afegeix les hores, i un 0 davant si només tenen un digit
		if (hores < 10) stRellotge += "0";
		stRellotge += hores+":";
		
		// Afegeix els minuts, i un 0 davant si només tenen un digit
		if (minuts < 10) stRellotge += "0";
		stRellotge += minuts+":";
		
		// Afegeix els segons, i un 0 davant si només tenen un digit
		if (segons < 10) stRellotge += "0";
		stRellotge += segons;	

		return stRellotge;
	}
	
	/**
	 * Funció per a poder modificar l'hora sencera
	 * @param hores que ha de marcar el rellotge
	 * @param minuts que ha de marcar el rellotge
	 * @param segons que ha de marcar el rellotge
	 * @return true si l'hora es correcta i false si no ho es
	 */
	public boolean modificarHora(int hores, int minuts, int segons) {
		if (validarHores(hores) && validarTemps(minuts) && validarTemps(segons)) {
			this.hores  = hores;
			this.minuts = minuts;
			this.segons = segons;
			return true;		    
		} else return false;
	}
	
	/**
	 * Suma un segon a l'hora actual
	 */
	public void sumarSegon() {
		segons = (segons+1) % 60;	
		if (segons == 0) {			// Hem saltat al següent minut
			minuts = (minuts+1) % 60;
			if (minuts == 0) {		// Hem saltat a la següent hora
				hores = (hores+1) % 24;
			}
		}
	}

	/**
	 * Suma varis segons a l'hora actual (versio poc eficient)
	 * @param segons a sumar
	 */
	public void sumarSegonsV1(int segons) {
		for (int i = 0; i < segons; i++) {
			sumarSegon();
		}
	}
	
	/**
	 * Suma varis segons a l'hora actual (versio eficient)
	 * @param segons a sumar
	 */
	public void sumarSegonsV2(int segons) {
		// Ho passem tot a segons i sumem els segons que ens donen
		int sumaSegons = this.hores * 3600 + this.minuts * 60 + this.segons + segons;
		this.hores  = sumaSegons / 3600 % 24; // Llavors calculem quantes hores
		this.minuts = sumaSegons % 3600 / 60; // minuts
		this.segons = sumaSegons % 3600 % 60; // i segons son.
	}
}