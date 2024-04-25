
public class A8_1 {
	//Guardar en un array els 20 primers nombres parells.
	
	public static void main(String[] args) {
		int[] nombres = new int[20];
		
		//Omplim l'array/vector amb nombres parells
		for (int i=0; i<20; i++) {
			nombres[i] = i*2;
			//System.out.println("El "+(i+1)+" nombre parell és: "+nombres[i]);
		}

		//Mostrem el contingut de l'array
		for (int j=0; j<nombres.length; j++) {
			System.out.println("El "+(j+1)+" nombre parell és: "+nombres[j]);
		}
	}
}