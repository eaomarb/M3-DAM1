import java.util.Scanner;

public class T12_Arrays {

	public static void main(String[] args) {
		
		// Pedir al usuario 5 números y mostrar los que son
		// mayores a la media
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		
		// CON ESTE BUCLE PERDEMOS LOS NúMEROS Y POR TANTO LUEGO
		// NO PODEMOS COMPARARLOS CON LA MEDIA
//		for (int i = 0; i < 5; i++) {
//			System.out.println("NÃºmero " + i + ":");
////			int numero = teclado.nextInt();
////			suma += numero;
//			suma += teclado.nextInt();
//		}
//		
		// ES INVIABLE HACER TANTAS VARIABLES COMO NúMEROS
		// NECESITEMOS, PORQUE PUEDEN SER MUCHOS
//		System.out.println("Número 1:");
//		int num1 = teclado.nextInt();
//		suma += num1;
//		System.out.println("Número 2:");
//		int num2 = teclado.nextInt();
//		suma += num2;
//		System.out.println("Número 3:");
//		int num3 = teclado.nextInt();
//		suma += num3;
//		System.out.println("Número 4:");
//		int num4 = teclado.nextInt();
//		suma += num4;
//		System.out.println("Número 5:");
//		int num5 = teclado.nextInt();
//		suma += num5;
		
		
//		double media = (double)suma / 5;
//		System.out.println(media);

//		if (num1 > media) {
//			System.out.println(num1);
//		}
		
		// Para solucionar este tipo de problemas y otros existen
		// los ARRAYS, también llamados VECTORES
		
		// Un array es un conjunto de variables DEL MISMO TIPO, al cual
		// se puede acceder por su posición. Es como si tuviéramos una
		// estantería en la cual en el estante 0 guardamos un dato,
		// en el 1 otro...
		
		// Las posiciones van númeradas desde el 0 hasta tamaño-1
		
		// SINTAXIS para crear un array
		// tipoDeDatos[] nombreArray = new tipoDeDatos[tamaño]
		
		int[] arrayNumeros = new int[5];
		
		// ¿Cómo accedemos a una posición del array?
		//  nombreArray[posicion]
		
		// Lectura
		// System.out.println(arrayNumeros[3]);
		
		// Escritura
		// arrayNumeros[3] = 5;
		// arrayNumeros[3] = teclado.nextInt;
		// arrayNumeros[3] = 3 + (8 * 17);
		
		// Para saber el tamaño de un array, usamos el .length
		// arrayNumeros.length
		
		// Recorremos un array para escribir datos
		for (int i = 0; i < arrayNumeros.length; i++) {
			
			System.out.println("Número " + (i + 1) + ":");
			arrayNumeros[i] = teclado.nextInt();
			
			suma += arrayNumeros[i];
		}
		
		// Calculamos la media
		double media = (double)suma / 5;
		System.out.println(media);
		
		System.out.println("NÃºmeros por encima de la media");
		
		// Recorremos un array para leer datos
		for (int i = 0; i < arrayNumeros.length; i++) {
			
			if (arrayNumeros[i] > media) {
				System.out.println(arrayNumeros[i]);
			}
		}
		
		// Qué pasa si accedemos a una posición que no existe del array
		//arrayNumeros[8] = 25;
		
		// A veces necesitamos o queremos crear un array y darle
		// valores directamente en código, sin necesidad de leerlos 
		// o pedirlos de ningÃºn sitio
		String[] arrayNombres = {"Jaime", "Judit", "Jon" , "Toy"};
	}

}
