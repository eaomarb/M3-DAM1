// Programa per inserir N números en un vector A, 
// copiar en un vector B totes les dades del vector A 
// ordenades ascendentment, i posteriorment visualitzar 
// les dades del vector B. 

public class A8_7 {
	public static void main(String[] args) {
		// Omplim l'arrayA amb números
		int[] arrayA = {9, 12, 1, 4, 6, 45, 2, 50};

		// Creem un arrayB de la mateixa mida que A
		int[] arrayB = new int[8];
		
		// Creem una copia per no sobreescriure l'A
		int[] arrayC = new int[8];
		for (int i = 0; i < arrayC.length; i++) {
			arrayC[i] = arrayA[i];
		}

		// Per cada posició de l'array B li assignem el mínim de l'arrayC
		// I llavors eliminem aquest valor de l'arrayC
		for (int indexB = 0; indexB < arrayB.length; indexB++) {
			int minim = Integer.MAX_VALUE;
			int indexMinim = 0;

			// Recorrem l'arrayC per buscar el mínim actual
			for (int indexC = 0; indexC < arrayC.length; indexC++) {
				// mirem si és més petit que el mínim i ENCARA NO L'HEM POSAT
				if (arrayC[indexC] < minim && arrayC[indexC] != -1) {
					minim = arrayC[indexC];
					indexMinim = indexC;
				}
			}
			// Marco el mínim que he trobat per no tornar-lo a posar
			arrayC[indexMinim] = -1;
			// Poso el mínim a l'arrayB
			arrayB[indexB] = minim;
		}

		// Mostrem el vector A
		System.out.println("A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();

		// Mostrem com ha quedat ordenat (arrayB)
		System.out.println("B");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();
	}
}
