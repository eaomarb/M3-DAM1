import java.util.Scanner;

public class EurosADolars {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		//Demanem el preu del dòlar americà
		System.out.print("Quants dòlars val un euro actualment? ");
		double preuActual = teclat.nextDouble();
		
		//Demanem la quantitat d'euros
		System.out.print("Introdueix la quantitat d'euros: ");
		double euros = teclat.nextDouble();
		
		//Fem la conversió
		double dolars = euros * preuActual;
		
		//Mostrem en pantalla la conversió a dòlars
		System.out.print(euros + "€ són " + "$" + dolars + ".");
	}
}
