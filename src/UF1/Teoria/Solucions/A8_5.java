import java.util.Scanner;

// Programa per inserir 5 números en un vector A, 
// copiar en un vector B totes les dades parells del 
// vector A, i posteriorment visualitzar les dades del vector B.
public class A8_5 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		// Guardem 5 números en un array
		int[] arrayNumeros = new int[5];
//		int[] arrayNumeros = {2, 3, 0, 4, 1};
		
		int parells = 0;
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Núm " + (i+1));
			arrayNumeros[i] = teclat.nextInt();

			// Mirem si és parell
			if (arrayNumeros[i] % 2 == 0) {
				parells++;
			}
		}
		teclat.close();
		
		// Cree un array per als parells
		int[] arrayParells = new int[parells];
		
		// Contador de per quin parell anem
		int iParells = 0;
		
		// Amplim el segon array només amb els parell
		// Recorrem el primer array
		for (int iNumeros = 0; iNumeros < arrayNumeros.length; iNumeros++) {
			// Si trobem un parell el passem a l'arrayParells
			// A la posició que li toqui (iParells) i l'incrementem
			if (arrayNumeros[iNumeros] % 2 == 0) {
				
				arrayParells[iParells] = arrayNumeros[iNumeros];
				iParells++;
			}
		}
		
		// Mostrem l'array de parells
		for (int i = 0; i < arrayParells.length; i++) {
			System.out.print(arrayParells[i] + " ");
		}
		System.out.println();
	}

}
