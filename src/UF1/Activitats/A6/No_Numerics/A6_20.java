/*Demanar per pantalla que l’usuari introdueixi el nombre de treballadors d’una empresa.
Seguidament, per cada treballador l’usuari ha d’entrar el seu salari mensual en format decimal.
El programa ha de retornar el salari mitjà, el salari màxim el salari mínim d’aquesta empresai ha de retornar
un missatge d’alarma si el salari és inferior al salari mínim interprofessional que actualment és de 735,90 €.
*/

import java.util.*;

public class A6_20 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		int treballadors = 0;
		double totalSalari = 0;
		double maxSalari = 0;
		double minSalari = 0;
				
		System.out.println("Vols afegir un treballador? (true/false)");
		boolean afegirTreballador = teclat.nextBoolean();
		
		while (afegirTreballador == true) {
			System.out.println("Quin és el salari del treballador?");
			double salari = teclat.nextDouble();

			if(salari < 735.90) {
				System.out.println("Aquest salari és menor que l'SMI.");
			}
						
			if (salari > maxSalari) {
				maxSalari = salari;
			} 
			
			if (salari < minSalari && salari > 0) {
				minSalari = salari;
			}
			
			totalSalari = totalSalari + salari;
			treballadors++;
			
			System.out.println("Vols afegir un altre treballador? (true/false)");
			afegirTreballador = teclat.nextBoolean();
			if(afegirTreballador == false) {
				System.out.println("Total de treballadors: " + treballadors);
				System.out.println("Salari mitjà: " + totalSalari/treballadors);
				System.out.println("Salari mínim de l'empresa: " + minSalari);
				System.out.println("Salari màxim de l'empresa: " + maxSalari);
			}
		}
		teclat.close();
	}
}
