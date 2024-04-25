
public class Booleans {

	public static void main(String[] args) {
		
		// Existe un tipo de datos, llamado "boolean" que permite
		// almacenar valores del tipo cierto / falso (true / false)
		
		boolean nombre = true; // false
		
		// Demana l'antiguitat i crea una expressió (booleana) 
		// que emmagatzemi si el treballador li toca pujada de sou (empleado es fiel si lleva 7 años o más en la empresa)
		// Consideramos sueldo bajo si cobra menos de 1500
		
		int antiguitat = 10;
		int sou = 1000;
		
		boolean empleadoFiel = (antiguitat >= 7);
		boolean souBaix = (sou < 1500);
		
		if (empleadoFiel && souBaix) {
			System.out.println("!Te toca augmento de sueldo!");
			
		} else {
			System.out.println("!A comer arroz!");
		}
		
		
		String opcion = "S";
		boolean continuar = (opcion.equalsIgnoreCase("S"));
		
		if (continuar) {
			System.out.println("Puedes continuar");
		}
		
		/*
		 * EN OCASIONES ES MÁS COMODO TRABAJAR CON UNA VARIABLE BOOLEANA QUE IR ARRASTRANDO UNA CONDICION QUE SE REPITE
		 * Y ES MÁS LARGA DE ESCRIBIR.
		 * */
		
		int anyo = 2000;
		int dia = 29;
		
		boolean bisiesto = (anyo % 4 == 0) &&	
						   ((anyo % 100 != 0) || (anyo % 400 == 0));
		
		if (dia == 29 && bisiesto) {
			System.out.println("Fecha correcta");
		}
	}

}
