// 3. Sumes de veïns. Donada una taula FIL x COL, com la
// de la figura adjunta, amb nombres enters, es tracta de
// construir una altra taula amb el contingut de totes les
// sumes dels seus veïns.
public class A2_3_solucio {

	public static void main(String[] args) {

		// Declaramos la matriz de pruebas
		int[][] matriz = {{1, 2, 5, 4, 5},
				{2, 4, 8, 6, 4},
				{2, 5, 6, 5, 4},
				{2, 5, 4, 5, 2},
				{1, 4, 0, 5, 8}
		};

		// Pruebas de la función a)
		System.out.println(sumaVecinos(matriz, 0, 0));
		System.out.println(sumaVecinos(matriz, 3, 3));

		System.out.println();

		// Pruebas de la función b)
		imprimirMatriz(matriz);
		System.out.println();

		imprimirMatriz(sumaVecinosMatriz(matriz));
	}

	// a) Crea una funció que donada una matriu i un número
	// de fila i un número de columna d'una cel·la, retorni
	// la suma dels seus veïns.
	public static int sumaVecinos(int[][] matriz, int fil, int col) {

		// Suma de los vecinos
		int suma = 0;

		/////// MODO POCO ELEGANTE //////////////////

		// Miramos si cada uno de los 8 vecinos ("a mano") está dentro
		// de la matriz, y si es así, lo sumamos

		// Diagonal arriba izquierda
		if (estaDentroMatriz(matriz, fil-1, col-1)) {

			suma += matriz[fil-1][col-1];
		}

		// Diagonal arriba derecha
		if (estaDentroMatriz(matriz, fil-1, col+1)) {

			suma += matriz[fil-1][col+1];
		}

		// Diagonal abajo izquierda
		if (estaDentroMatriz(matriz, fil+1, col-1)) {

			suma += matriz[fil+1][col-1];
		}

		// Diagonal abajo derecha
		if (estaDentroMatriz(matriz, fil+1, col+1)) {

			suma += matriz[fil+1][col+1];
		}

		// Arriba
		if (estaDentroMatriz(matriz, fil-1, col)) {

			suma += matriz[fil-1][col];
		}

		// Abajo
		if (estaDentroMatriz(matriz, fil+1, col)) {

			suma += matriz[fil+1][col];
		}

		// Izquierda
		if (estaDentroMatriz(matriz, fil, col-1)) {

			suma += matriz[fil][col-1];
		}

		// Derecha
		if (estaDentroMatriz(matriz, fil, col+1)) {

			suma += matriz[fil][col+1];
		}

		/////////////////////////////////////////////

		////// MODO OPTIMIZADO Y ELEGANTE ///////////

		// Me creo una matriz de mis vecinos, que irá
		// desde mi f-1, c-1 hasta mi f+1, c+1

		suma = 0;

		for (int f = fil-1; f <= fil+1; f++) {
			for (int c = col-1; c <= col+1; c++) {

				if (estaDentroMatriz(matriz, f, c)) {
					suma += matriz[f][c];
				}
			}
		}

		// Nos restamos, porque estábamos incluidos
		// en la matriz de vecinos

		suma -= matriz[fil][col];

		/////////////////////////////////////////////

		// Retornamos el resultado
		return suma;


	}


	// Servirá para saber si una posición está dentro de la matriz o no
	public static boolean estaDentroMatriz(int[][] matriz, int fil, int col) {

		// Número de filas y columnas
		int numFilas = matriz.length;
		int numColumnas = matriz[0].length;

		// Retornamos cierto si la fila y la columna están dentro de la matriz y
		// falso si no lo están
		return (fil >= 0 && fil < numFilas && col >= 0 && col < numColumnas);
	}

	// b) Crea una funció donada una matriu, retorni la suma
	// dels veïns de totes les cel·les. Aquesta funció ha d'utilitzar
	// la funció anterior.
	public static int[][] sumaVecinosMatriz (int[][] matriz) {

		// Número de filas y columnas
		int numFilas = matriz.length;
		int numColumnas = matriz[0].length;

		// Creamos una matriz del mismo tamaño
		int[][] matrizSuma = new int[numFilas][numColumnas];

		// Recorremos la matriz y calculamos la suma de vecinos de cada posición
		for (int fil = 0; fil < matrizSuma.length; fil++) {
			for (int col = 0; col < matrizSuma.length; col++) {

				matrizSuma[fil][col] = sumaVecinos(matriz, fil, col);
			}
		}

		// Devolvemos la matriz resultado
		return matrizSuma;
	}

	// Imprime una matriz por pantalla
	public static void imprimirMatriz(int[][] matriz) {

		// Recorremos la matriz para imprimirla
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int col = 0; col < matriz.length; col++) {

				System.out.print(matriz[fil][col] + " ");
			}
			System.out.println();
		}
	}

	// c) Fes un menú que demani a l'usuari què vol fer d'entre
	// les següents opcions:

}