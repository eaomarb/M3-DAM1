// Guardar en un array els 20 primers nombres parells.

import java.util.Arrays;

public class A8_1 {

	public static void main(String[] args) {
		int[] array = new int [20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i*2;
		}
		
		System.out.println(Arrays.toString(array));	}

}
