import java.util.*;

public class HoresMinutsSegons {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Hores: ");
		int hores = teclat.nextInt();	
		System.out.println("Minuts: ");
		int minuts = teclat.nextInt();
		System.out.println("Segons: ");
		int segons = teclat.nextInt();
		
		hores = hores*3600;
		minuts = minuts*60;
		
		System.out.println(hores+minuts+segons);
	}
}
