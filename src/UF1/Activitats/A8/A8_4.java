// Programa que ompli un array amb 10 nombres enters que es llegeixen per teclat.
// A continuació calcula i mostra la mitjana dels valors positius i la dels valors negatius de l'array.
public class A8_4 {
	public static void main(String[] args) {
		double [] array = {2, -2, 3, -5, -1, 0, 4, 8, -9, 1};
		
		int positius = 0;
		int negatius = 0;
		
		double sumaPositius = 0;
		double sumaNegatius = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positius++;
				sumaPositius = sumaPositius + array[i];
			} else if (array[i] < 0) {
				negatius++;
				sumaNegatius = sumaNegatius + array[i];
			}
		}
		
		double mitjanaPositius = sumaPositius/positius;
		double mitjanaNegatius = sumaNegatius/negatius;
		
		
		System.out.println("Mitjana positius: " + mitjanaPositius);
		System.out.println("Mitjana negatius: " + mitjanaNegatius);
	}

}
