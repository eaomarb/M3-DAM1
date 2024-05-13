
public class InstiTester {
	public static void main(String[] args) {
		Insti itest = new Insti();
		itest.setNom("Test");
		
		System.out.println("TEST INSTI SENSE PROFES");
		System.out.println(itest);
		
		System.out.println("AFEGIM UN PROFE");
		itest.afegeixProfe("NomTest", 1, "00000000Z");
		System.out.println(itest);		
		
		//Fem un nou insti
		Insti ibc = new Insti("Baix Camp", 3);
		//Hi afegim un profe a partir de les seves dades
		ibc.afegeixProfe("Anna", 10, "12345678A");
		//Creem una instancia de profe i l'afegim a l'insti en dos passos
		Profe carles = new Profe("Carles", 30, "34567890C");
		ibc.afegeixProfe(carles);
		//Creem una instancia de profe i l'afegim a l'insti directament
		ibc.afegeixProfe(new Profe("Berta", 20, "23456789B"));
		
		System.out.println("MOSTREM SEGON INSTI");
		System.out.println(ibc);
		
		System.out.println("AFEGIM UN CURS AMB SETTERS, NOMES AL SEGON INSTI");
		ibc.nouCursInsti();
		System.out.println(itest);
		System.out.println(ibc);
		
		System.out.println("AFEGIM UN ALTRE CURS AMB METODES, NOMES AL SEGON INSTI");
		ibc.nouCursProfe();
		System.out.println(itest);
		System.out.println(ibc);
		
		//Afegim els instis a un vector
		Insti[] instis = new Insti[2];
		instis[0]=itest;
		instis[1]=ibc;
		
		System.out.println("AFEGIM UN CURS, A TOTS ELS INSTIS");
		for (int i=0;i<instis.length;i++) {
			instis[i].nouCursInsti();
			System.out.println(instis[i]);
		}
		
		System.out.println("COM ÉS DIU EL PRIMER PROFE DE CADA INSTI:");
		for (int i=0;i<instis.length;i++) {
			System.out.println(" · "+instis[i].getNom()+": "+instis[i].profes[0]);			
		}
	}
}