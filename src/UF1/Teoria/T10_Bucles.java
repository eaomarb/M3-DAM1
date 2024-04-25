import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// SINTAXIS del WHILE
		/*
		 * while (condicion) {
		 * 		acciones que se van a repetir
		 * 		
		 * 		ACCION QUE HACE CAMBIAR LA CONDICION DE SALIDA
		 * }
		 */
		int num = 1;
		
		while (num <= 100) {
			System.out.println(num);
			
			num = num + 1; // num += 1; o num++;
		}
		
		
		
		int nota = 0;
		int numNotas = 1;
		int contAprobados = 0;
		int contSuspendidos = 0;
		Scanner teclado = new Scanner(System.in);
		
		while (numNotas <= 10) {
			System.out.println("Introduce una nota");
			nota = teclado.nextInt();
			
			if (nota >= 5) {
				contAprobados++;
			}else {
				contSuspendidos++;
			}
			numNotas++;
		}
		System.out.println("Contador de Aprobados: " + contAprobados);
		System.out.println("Contador de Suspendidos: " + contSuspendidos);
		
		
		
		// Ejercicio 2 de JAVA YA
		//Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantas personas quieres medir: ");
		int n = teclado.nextInt();
		double altura = 0;
		double suma = 0;
		
		num = 1;
		while (num <= n) {
			
			System.out.println("Introduce la altura de la persona " + num);
			altura = teclado.nextDouble();
			
			suma = suma + altura;
			
			num = num + 1;
		}
		
		double promedio = suma / n;
		System.out.println("El promedio de las alturas es: " + promedio);
		
		
		
		
		
	
		
		/*
		Scanner teclado = new Scanner(System.in);
		
		double altura = 0;
		double suma = 0;
		
		int num = 1;

		System.out.println("Introduce la altura de la persona " + num + " (PARA SALIR INTRODUCE -1)");
		altura = teclado.nextDouble();
		while (altura != -1) {
			
			suma += altura;
			
			System.out.println("Introduce la altura de la persona " + num);
			altura = teclado.nextDouble();
			
			num = num + 1;
		}
		
		double promedio = suma / (num-1);
		System.out.println("El promedio de las alturas es: " + promedio);
		*/
		
		
		
		
		
		
		
		
		
		
		

	}

}
