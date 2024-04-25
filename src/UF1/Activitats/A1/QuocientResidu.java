import java.util.*;

public class QuocientResidu {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Introdueix un nombre: ");
		int n1 = teclat.nextInt();
		System.out.println("Introdueix un altre nombre: ");
		int n2 = teclat.nextInt();
		
		System.out.println("Quocient: " + n1/n2);
		System.out.println("Residu: " + n1%n2);
	}
}
