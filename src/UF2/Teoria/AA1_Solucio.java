public class AA1_Solucio {
	// Funcions auxiliars (que no demana explicitament l'enunciat)
	/**
	 * Comprova si una posicio esta dins de la matriu
	 * 
	 * @param matriu Matriu
	 * @param fil Fila
	 * @param col Columna
	 * @return Si esta dins
	 */
	public static boolean dinsMatriu(char[][] matriu, int fil, int col) {
		return (fil >= 0 && fil < matriu.length && col >= 0 && col < matriu[fil].length);
	}

	/**
	 * Comprova si una posicio te un WC
	 * 
	 * @param restaurant Matriu
	 * @param fil Fila
	 * @param col Columna
	 * @return Si te un WC
	 */
	public static boolean wc(char[][] restaurant, int fil, int col) {
		return (restaurant[fil][col] == 'W');
	}

	// 1. (**4 punts**) Dissenya una funció que donada
	// una matriu M files x N columnes, una fila i columna,
	// retorni si en aquella posició es pot col·locar una taula.

	/**
	 * Retorna si una taula es valida. Es considera una taula valida si te un
	 * WC com a molt a 3 posicions de distancia en qualsevol direcció en
	 * linea recta, i si no te cap lavabo just al costat.
	 * 
	 * @param restaurant Matriu de chars amb la distribucio del restaurant. 
	 *            			W - WC,
	 *            			Espai - Res
	 * @param fil Fila a comprovar
	 * @param col Columna a comprovar
	 * @return Si es una taula valida
	 */
	public static boolean taulaValida(char[][] restaurant, int fil, int col) {
		// Comprovem si la cel.la esta dins de la matriu
		if (!dinsMatriu(restaurant, fil, col)) {
			return false;
		}

		// Si te un WC just al costat (o on volem posa la taula) -> NO VALIDA
		// Mirem si hi ha algun WC de [fil-1, col-1] fins [fil+1, col+1]
		for (int incFil = -1; incFil <= 1; incFil++) {
			for (int incCol = -1; incCol <= 1; incCol++) {
				int f = fil + incFil;
				int c = col + incCol;

				// Si esta dins la matriu
				if (dinsMatriu(restaurant, f,c)) {
					// Mirem si hi ha WC
					if (wc(restaurant, f, c)) {
						return false;
					}
				}
			}
		}

		// Si te un WC com a molt a 3 de distancia -> VALIDA
		for (int incFil = -3; incFil <= 3; incFil++) {
			for (int incCol = -3; incCol <= 3; incCol++) {
				int filAComprobar = fil + incFil;
				int colAComprobar = col + incCol;

				if ((incFil == 0 || incCol == 0					//Horitzontal o vertical
					|| Math.abs(incFil) == Math.abs(incCol)) 	//Diagonals 
					&& (Math.abs(incFil) >= 2 || Math.abs(incCol) >= 2)) { //a distancia 2+

					if (dinsMatriu(restaurant, filAComprobar, colAComprobar)) {
						if (wc(restaurant, filAComprobar, colAComprobar)) {
							return true;
						}
					}
				}
			}
		}

		// En qualsevol altre cas no es valida
		return false;
	}

	// 2. (**2 punts**) Dissenya una funcio que donada una
	// matriu, mostri per pantalla, en forma de matriu,
	// les coordenades de totes les taules valides.
	/**
	 * Mostra per pantalla en forma de matriu les coordenades de totes
	 * les taules valides
	 * @param restaurant Matriu del restaurant
	 */
	public static void mostrarPlanolRestaurant(char[][] restaurant) {

		// Per cada posicio del restaurant
		for (int fil = 0; fil < restaurant.length; fil++) {
			for (int col = 0; col < restaurant[fil].length; col++) {

				// Mostro si hi ha un WC, una taula valida o res
				if (wc(restaurant, fil, col)) {
					System.out.print(" W ");
				} else if (taulaValida(restaurant, fil, col)) {
					System.out.print(" T ");
				} else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	// 3. (**2 punts**) Dissenya una funcio que donada una
	// matriu, escrigui per consola les coordenades de totes
	// les taules valides.
	/**
	 * Mostra per pantalla les coordenades de totes les taules valides
	 * @param restaurant Matriu del restaurant
	 */
	public static void mostrarTaules(char[][] restaurant) {
		// Per a cada posicio del restaurant
		for (int fil = 0; fil < restaurant.length; fil++) {
			for (int col = 0; col < restaurant[fil].length; col++) {
				// Si te una taula valida, la mostrem
				if (taulaValida(restaurant, fil, col)) {
					System.out.println("Taula valida a: "+ fil + " - " + col);
				}
			}
		}
	}
	
	// 4. (**1 punt**) Programa principal
	public static void main(String[] args) {
		char[][] restaurant = {	//10x10
				{' ', ' ', 'W', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'W', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', 'W', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', 'W', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'W'},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

		// System.out.println(taulaValida(restaurant, -1, 12));
		// System.out.println(taulaValida(restaurant, 0, 1));
		// System.out.println(taulaValida(restaurant, 0, 2));
		mostrarPlanolRestaurant(restaurant);
		mostrarTaules(restaurant);
	}
}
