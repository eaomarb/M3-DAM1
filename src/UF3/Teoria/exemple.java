import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Exemple{

// DOUBLE = INT; ..... DE DOUBLE A INT --> Double = Int (No necesita transformacion);
// INT = DOUBLE; ..... DE DOUBLE A INT --> 
//  INT = STRING; .... DE STRING A INTEGER --> Integer.parseInt(variable_string);
// STRING = INT; ..... DE INT A STRING --> Integer.toString(variable_int);
// BOOLEAN = STRING; ... DE STRING ABOOBLEAN --> Boolean.parseeBoolean(variable_boolean);


// --------------------------------------------------------------------------------------------------------------------------------
    //FUNCIO PER CARREGAR

    /**
     * funció que dontas el nom del fitxer i l'estructura de dades necessària
     * (la que creguis convenient), permet guardar les dades del fitxer a l'estructura.
     * @param nomFitxer nom del fitxer que volem carregar
     * @param noms noms vector que contindra els noms dels personatges
     * @param energia vector que contindra l'energia dels personatges
     * @throws FileNotFoundException no es troba el fitxer
     * @return numero de personatges llegits
     */

      /*Per a simplificar l'estrucutra,
         * asumim que el número màxim de personatges
         * serà 10.
         */
        
    public static int carregar(String nomFitxer, String[] noms, int[] energia) throws FileNotFoundException {
        File fitxer = new File(nomFitxer); // Per obri el fitxer
        Scanner scFitxer = new Scanner(fitxer); // Scanner per llegir el fitxer

        int personatgeFitxer = 0;

        if (scFitxer.hasNextLine()){   // Mira si ha ha alguna linea  mes al fitxer
            personatgeFitxer = Integer.parseInt(scFitxer.nextLine()); // Convertix a enter el num de personatges
       
            for (int i = 0; i < personatgeFitxer; i++){ // Carreguem nom i energia, un per un
                if (scFitxer.hasNextLine()) {
                    noms[i] = scFitxer.next();
                    energia[i] = scFitxer.nextInt();
                }
            }

        }

        scFitxer.close();

        //La funció ha de retornar el número de personatges llegits/.
        return personatgeFitxer;
    }
// -----------------------------------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------------------------------------
   
    //FUNCIO PER ENERGIA

     /**
      * Funció que donat un nom d'un personatge, 'lestructura ' de dades
      i el numero de personatges, retorni la seva energia
      * @param nom del personatge
      * @param noms vectors amb els noms dels pesonatges
      * @param energia vector amb l'energia dels personatges
      * @param numPersonatges número de personatges
      * @return
      */

    public static int energia(String nom, String[] noms, int[] energia, int numPersonatges){
        //Consultant les dades a la estructura de daedes local no al fitxer

        //Retorni la seva energia
        return energia;
    }
// ------------------------------------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------------------------------

    //FUNCIO PER DESA

    /** Crea una funció
     * 
     * @param nom
     * @param noms
     * @param energia
     * @param numPersonatges
     */
    public static void desa(String nom, String[] noms, int[] energia, int numPersonatges){
        // Si el nom de personatge no existeix ha de mostrar un missatge d'error i no crear el fitxer.

        boolean trobat = false;
        int i = 0 ;
        
        while (!trobat && i < noms.length){
            if (nom.equals(noms[i])){ //Pasem un nom
                trobat = true;
            }
            i++;
            
        }

        // El nom fitxer serà el nom del personatge. El format del fitxer de sortida ha de ser com aquest.
    

    }
// --------------------------------------------------------------------------------------------------------------------------------

// -------------------------------------------------------------------------------------------------------------------------------
    
    //FUNCIO PER MOSTRA

    /**
     * Funció que donat el nom d'un fitxer, mostri les dades que té a dins
     * Aquesta funció serveix tant pel fitxer d'ntrada com pels fitxers de sortida.
     * @param nomFitxer que es vol mostrar
     * @throws FileNotFoundException no es troba el fitxer
     */
    public static void mostra(String nomFitxer) throws FileNotFoundException{
        File fitxer = new File(nomFitxer); // Per obri el fitxer
        Scanner scFitxer = new Scanner(fitxer); 

        while (scFitxer.hasNextLine()){ //hasNextLine per llegir per lines el fitxer
            System.out.println(scFitxer.nextLine());  //Et salta la linea del fitxer quan mostri
        }

        scFitxer.close();
    }

//--------------------------------------------------------------------------------------------------------------------------------------




// --------------------------------------------------------------------------------------------------------------------------------------

    // MAIN

    // Estructura del codi, coemntaris, disseny modular.
    public static void main(String[] args) throws FileNotFoundException{
       String[] noms= new String[10];
       int[] energia = new int[10];
       int personatges = 0;

        mostra("entrada.txt");
        personatges = carregar("entrada.txt", noms, energia);
        energia("Vegeta", noms,energia, personatges);
        desa("Vegeta", noms, energia, personatges);
        mostra("sortida.txt");
    }

 // -------------------------------------------------------------------------------------------------------------------------------------------   
}