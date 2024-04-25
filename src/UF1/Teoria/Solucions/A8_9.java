import java.util.Scanner;
// Programa que digui si el nombre inserit és o no palíndrom. 

public class A8_9 {
	public static void main(String[] args) {
		// Demanem un número
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Núm:");
		int num = teclat.nextInt();
		teclat.close();

		// Comprovem si és palíndrom

		// Descomposem el número en digits i el guardem en un array
		int numAuxiliar = num;
		int numDigits = 0;

		// Mentres tinguem un número més gran que 0
		while (numAuxiliar > 0) {
			// Seguim dividint i afegint digits
			numDigits++;
			numAuxiliar = numAuxiliar / 10;
		}
		
		// Creem l'array de la mida del número
		int arrayNum[] = new int[numDigits];
		numAuxiliar = num;
		
		// Convertim de número a array
		for (int i = 0; i < arrayNum.length; i++) {
			// Afegim l'últim digit del número a la posició i de l'array
			arrayNum[i] = numAuxiliar % 10;
			numAuxiliar = numAuxiliar / 10;
		}
		
		
		// Anem a comprovar si és palindrom
		boolean palindrom = true;
		int i=0;
		while (palindrom && (i < arrayNum.length/2)) {
			if (arrayNum[i] != arrayNum[arrayNum.length - 1 - i]) {
				palindrom = false;
			} 
			//palindrom = arrayNum[i] == arrayNum[arrayNum.length - 1 - i];
			i++;							
		}
		
		if (palindrom) {
			System.out.println("PALÍNDROM");
		} else {
			System.out.println("NO PALÍNDROM");
		}
	}
}