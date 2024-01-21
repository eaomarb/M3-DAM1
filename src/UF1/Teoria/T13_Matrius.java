import java.util.Scanner;

public class T13_Matrius {

	public static void main(String[] args) {

		// Una matriz es un array de arrays, o sea un array
		// que en cada posición contiene un array, el cual 
		// contiene, ahora sí, elementos de tipos conocid	os
		// como int, double, char, boolean, String...

		// Sintaxis
		// tipoDeDatos[][] nombreMatriz = new tipoDeDatos[numFilas][numColumnas]
		// tipoDeDatos[][] nombreMatriz = new tipoDeDatos[dimensionArrayGrande][dimensionArrayPequeño]

		int[][] matriz = new int[4][3];
		
		

		
		
		// Igual que creábamos arrays directamente con los valores en código...
		int[] arrayNumeros = {12, 52, 13};

		//... podemos crear matrices con los valores en código
		//		char[][] matrizChars = {{'a', 'b', 'c'}, 
		//								{'d', 'e', 'f'}};
		char[][] matrizChars = {{'a', 'b'}, 
								{'c', 'd'}, 
								{'e', 'f'}};

		
		int[][] matrizPizarra = { {1, 3, 2},
								  {4, 6, 8},
								  {2, 3, 1},
								  {4, 3, 1} };
		
		// Acceso de lectura y escritura
		matrizPizarra[0][2] = 5;
		System.out.println(matrizPizarra[0][2]);
		System.out.println();
		
		// Cómo recorremos una matriz
		for (int fil = 0; fil < matrizPizarra.length; fil++) {
			
			for (int col = 0; col < matrizPizarra[fil].length; col++) {
				
				System.out.print(matrizPizarra[fil][col] + " ");
			}
			System.out.println();
		}

		// Fes un programa que generi una matriu de 4x4, demani els 
		// valors a l'usuari i després determini quin és el 
		// número més gran i més petit.
		
		int[][] matrizEnteros = new int[4][4];
		
		Scanner teclado = new Scanner(System.in);
		
		// Recorremos la matriz para insertar números
		for (int fil = 0; fil < matrizEnteros.length; fil++) {
			
			System.out.println("Fila " + fil);
			
			for (int col = 0; col < matrizEnteros[fil].length; col++) {
				
				System.out.println("Número (" + fil + "-" + col + "): ");
				matrizEnteros[fil][col] = teclado.nextInt();
			}
		}
		
		// Mostramos la matriz
		for (int fil = 0; fil < matrizEnteros.length; fil++) {
			for (int col = 0; col < matrizEnteros[fil].length; col++) {
				
				System.out.print(matrizEnteros[fil][col] + " ");
			}
			System.out.println();
		}
		
		int menor = Integer.MAX_VALUE;
		int mayor = Integer.MIN_VALUE;
		
		for (int fil = 0; fil < matrizEnteros.length; fil++) {
			for (int col = 0; col < matrizEnteros[fil].length; col++) {
				
				if (matrizEnteros[fil][col] < menor) {
					menor = matrizEnteros[fil][col];
				}
				if (matrizEnteros[fil][col] > mayor) {
					mayor = matrizEnteros[fil][col];
				}
			}
		}
		
		System.out.println("Menor " + menor);
		System.out.println("Mayor " + mayor);
	}

}
