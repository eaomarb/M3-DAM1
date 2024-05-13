package Institut;

public class Main {
    public static void main(String[] args) {
        Institut itest = new Institut();
        itest.setNom("Test");

        System.out.println("Institut sense professors");
        System.out.println(itest);

        System.out.println("Afegim un profressor");
        itest.afegeixProfessor("NomTest", 1, "00000000Z");
        System.out.println(itest);

        // Fem un nou institut
        Institut ibc = new Institut("Baix Camp", 3);
        // Hi afegim un profe a partir de les seves dades
        ibc.afegeixProfessor("Anna", 10, "12345678A");
        // Creem una instancia de professor i l'afegim a l'institut en dos passos
        Professor carles = new Professor("Carles", 30, "34567890C");
        ibc.afegeixProfessor(carles);
        // Creem una instancia de professor i l'afegim a l'institut directament
        ibc.afegeixProfessor(new Professor("Berta", 20, "23456789B"));

        System.out.println("Mostrem el segon Institut");
        System.out.println(ibc);

        System.out.println("Afegim un curs amb setters, només al segon Institut");
        ibc.nouCursInstitut();
        System.out.println(itest);
        System.out.println(ibc);

        System.out.println("Afegim un altre curs amb metodes, només al segon Institut");
        ibc.nouCursProfessor();
        System.out.println(itest);
        System.out.println(ibc);

        // Afegim els instituts a un vector
        Institut[] instituts = new Institut[2];
        instituts[0] = itest;
        instituts[1] = ibc;

        System.out.println("Afegim un curs a tots els Instituts");
        for (int i = 0; i < instituts.length; i++) {
            instituts[i].nouCursInstitut();
            System.out.println(instituts[i]);
        }

        System.out.println("El primer profressor de cada Institut:");
        for (int i = 0; i < instituts.length; i++) {
            System.out.println(" · " + instituts[i].getNom() + ": " + instituts[i].professors[0]);
        }
    }
}