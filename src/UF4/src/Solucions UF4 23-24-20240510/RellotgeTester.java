import java.util.Scanner;

public class RellotgeTester {
	// RellotgeTester (MAIN)
	//////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		// Comprovem els dos constructors
		Rellotge rellotgeNou  = new Rellotge();
		Rellotge rellotgeVell = new Rellotge(22,10,35);
		
		// Comprovem toString amb valors d'un i dos digits
		System.out.println(rellotgeNou);
		System.out.println(rellotgeVell);
		
		// Comprovem la funcio sumaSegon
		rellotgeNou.sumarSegon();
		System.out.println("Sumat un segon al rellotge nou: " + rellotgeNou);
		
		// Comprovem la funcio modificaHora
	    do {	// Repetim fins que ens donin una hora correcta
	    	System.out.println("Quina hora posem al rellotge nou? (hores minuts segons)");
	    } while (!rellotgeNou.modificarHora(teclat.nextInt(), teclat.nextInt(), teclat.nextInt()));
        System.out.println("Rellotge nou amb l'hora canviada: " + rellotgeNou);
        
        // Comprovem la funcio sumaSegons(v2)
		rellotgeVell.sumarSegonsV2(12345);
		System.out.println("Sumats 12345 segons al rellotge vell: " + rellotgeVell);
		
        teclat.close();
    }
}
