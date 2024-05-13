package Examen;

import java.io.File;
import java.util.Scanner;

public class Habitacio {
    /*Variables de clase*/
    public boolean[][] mapa;
    private Poomba[] poombes;
    private String nomFitxer;
    private int quantitatPoombes;

    /*Constructors*/
    public Habitacio() {
        /*Assignem true per a quan hi ha un lloc brut i fals quan esta net*/
        mapa = new boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}};
        Poomba poomba = new Poomba(this, "s", 1, 1); // Creem una nova Poomba inicialitzant-la amb direccio sud i en la posició (1,1)
        poombes = new Poomba[3];
        this.poombes[0] = poomba;
        quantitatPoombes = 1;
    }

    public Habitacio(String nomFitxer, int quantitatPoombes) throws Exception {
        File file = new File(nomFitxer);
        Scanner scanner = new Scanner(file);

        int filas = 0;
        int columnes = 0;

        /*Assignem les files al primer numero del fitxer
         * i assignem les columnes al segon numero del fitxer
         * */
        filas = scanner.nextInt();
        columnes = scanner.nextInt();
        scanner.nextLine();

        boolean[][] mapa = new boolean[filas][columnes];

        for (int i = 0; i < filas; i++) {
            String linia = scanner.nextLine();
            for (int j = 0; j < columnes; j++) {
                char posicio = linia.charAt(j); // Separem els caracters de cada linia del fitxer
                if (posicio == '*') { // Brut
                    mapa[i][j] = true;
                } else if (posicio == '.') { // Net
                    mapa[i][j] = false;
                }
            }
        }

        poombes = new Poomba[quantitatPoombes];

        setMapa(mapa);
        scanner.close();
    }

    /**
     * Aquest mètode afefeix una Poomba a l'habitació i que netegi l'espai on la posem
     *
     * @param poomba instancia de la clase Poomba
     */
    public void afegirPoomba(Poomba poomba) {
        if (quantitatPoombes < poombes.length) {
            poombes[quantitatPoombes] = poomba;
            quantitatPoombes++;

            if (mapa[poomba.getX()][poomba.getY()]) {
                this.mapa[poomba.getX()][poomba.getY()] = false; // Netejem la posició assignada
            }

        }
    }

    /**
     * Aquest funció comprova si la posició esta bruta o no
     * @param mapa habitació
     * @param x posició columna
     * @param y posició fila
     * @return si la posició esta bruta o no
     */
    public boolean estaBrut(boolean[][] mapa, int x, int y) {
        if (mapa[x][y]) {
            return true;
        } else if (y > mapa[x].length) {
            return false;
        } else {
            return false;
        }
    }

    /**
     * Aquesta funció calcula el percentatge de les posicicons brutes
     * @param mapa habitació
     * @return percentatge de les posicions brutes amb decimals
     */
    public double calcularPercentatgeBrut(boolean[][] mapa) {
        int llocsBruts = 0;
        int tamanyMapa = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                tamanyMapa = mapa.length * mapa[i].length;
                if (estaBrut(mapa, i, j)) {
                    llocsBruts++;
                }
            }
        }
        return ((double) llocsBruts / tamanyMapa) * 100;
    }

    /**
     * Comprova si hi ha una Poomba a la habitació
     * @param habitacio instancia Habitacio
     * @param poomba instancia Poomba
     * @return true si hi ha una Poomba a la habitació
     */
    public boolean hiHaPoomba(Habitacio habitacio, Poomba poomba) {
        boolean hiHaPoomba = false;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[poomba.getX()][poomba.getY()]) {
                    mapa[poomba.getX()][poomba.getY()] = false;
                    hiHaPoomba = true;
                }
            }
        }
        return hiHaPoomba;
    }

    public String getNomFitxer() {
        return nomFitxer;
    }

    public void setNomFitxer(String nomFitxer) {
        this.nomFitxer = nomFitxer;
    }

    public boolean[][] getMapa() {
        return mapa;
    }

    public void setMapa(boolean[][] mapa) {
        this.mapa = mapa;
    }

    public Poomba[] getPoombes() {
        return poombes;
    }

    public void setPoombes(Poomba[] poombes) {
        this.poombes = poombes;
    }

    public void escriureFitxer(boolean[][] mapa, String nomFitxer) {
        File file = new File(nomFitxer);

    }

    /**
     * Cada vegada que es vulgui imprimir la instancia Habitacio es imprimeix aquest codi
     * @return mapa
     */
    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (hiHaPoomba(this, getPoombes()[0])) {
                    System.out.print("O");
                } else if (mapa[i][j]) {
                    System.out.print("*");
                } else if (!mapa[i][j]) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

        System.out.println(calcularPercentatgeBrut(mapa));

        return str;
    }
}
