import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class laberint_pepito {
    //  Player's position in the map
    static int row = -1;
    static int col = -1;

    /**
     * Easy map level
     *
     * @return easy map level
     */
    public static char[][] easyMap() {
        return new char[][]{
                {'M', 'M', '□', 'S'},
                {'□', 'M', 'M', '□'},
                {'□', 'M', 'M', '□'},
                {'□', '□', '□', '□'}
        };
    }

    /**
     * Medium level map
     *
     * @return medium level map
     */
    public static char[][] mediumMap() {
        return new char[][]{
                {'□', 'M', 'M', '□', '□', '□', '□', 'S'},
                {'□', '□', 'M', '□', '□', '□', 'M', '□'},
                {'□', '□', 'M', '□', '□', '□', 'M', '□'},
                {'□', '□', '□', '□', 'M', 'M', '□', '□'},
                {'□', '□', '□', '□', 'M', 'M', '□', '□'},
                {'□', '□', '□', '□', '□', '□', '□', '□'},
                {'□', '□', 'M', '□', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□', '□', '□', '□'}
        };
    }

    /**
     * Hard level map
     *
     * @return hard level map
     */
    public static char[][] hardMap() {
        return new char[][]{
                {'□', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□'},
                {'M', 'M', 'M', 'M', '□', '□', '□', '□', '□', '□', '□', '□'},
                {'□', '□', '□', 'M', '□', '□', '□', '□', '□', '□', '□', '□'},
                {'□', '□', '□', 'M', 'M', 'M', 'M', '□', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□', '□', 'M', '□', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□', '□', 'M', '□', '□', '□', '□', '□'},
                {'□', 'M', 'M', 'M', 'M', '□', 'M', 'M', 'M', 'M', '□', '□'},
                {'□', 'M', '□', '□', '□', '□', '□', '□', '□', 'M', '□', '□'},
                {'□', 'M', '□', '□', '□', '□', '□', '□', '□', 'M', '□', '□'},
                {'□', 'M', '□', '□', '□', '□', '□', '□', '□', 'M', 'M', 'S'},
                {'□', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□'}
        };
    }

    /**
     * Checks if a position is inside the map
     *
     * @param map selected map
     * @param row player's row
     * @param col player's column
     * @return true if it's inside the matrix
     */
    public static boolean isInsideMatrix(char[][] map, int row, int col) {
        int nRows = map.length;
        int nCol = map[0].length;

        return row >= 0 && row < nRows && col >= 0 && col < nCol;
    }

    /**
     * Checks if a position is a wall
     *
     * @param map selected map
     * @param row player's row
     * @param col player's column
     * @return true if the position is a wall (M)
     */
    public static boolean isAWall(char[][] map, int row, int col) {
        return map[row][col] == 'M';
    }

    /**
     * Checks if it's a valid position using isInsideMatrix and isAWall methods
     *
     * @param map selected level
     * @param row player's row position
     * @param col player's column position
     * @return true if it's a valid position
     */
    public static boolean isValidMove(char[][] map, int row, int col) {
        return isInsideMatrix(map, row, col) && !isAWall(map, row, col);
    }

    /**
     * Sets the first valid position on the map
     *
     * @param map selected map
     */
    public static void setInitialPosition(char[][] map) {
        //  Initialize the nearest row and column
        int nearestRow = -1;
        int nearestCol = -1;

        int minDistance = Integer.MAX_VALUE; // Initialize the minimum distance from the player position to a valid position

        int distance; // this variable is used for calculating the distance between the player and a valid position

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                //  Checks if the current position is not a wall
                if (!isAWall(map, i, j)) {
                    //  calculates the distance between the current player position and the current position in the map
                    distance = Math.abs(row - i) + Math.abs(col - j);

                    //  If the current position is closer to the player it updates the nearest position and minimum distance
                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestRow = i;
                        nearestCol = j;
                        // If the nearest position is the exit 'S', sets row and col to -1
                        if (map[nearestRow][nearestCol] == 'S') {
                            row = -1;
                            col = -1;
                            return;
                        }
                    }
                }
            }
        }

        //  Sets player's position
        row = nearestRow;
        col = nearestCol;
    }

    /**
     * This method prints the selected map
     *
     * @param map selected map
     */
    public static void printMap(char[][] map) {
        for (int i = 0; i < map.length; i++) { //   Iterates for every row in the map
            for (int j = 0; j < map[i].length; j++) { //    Iterates for every column in the map
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * This method starts the game once the level is selected
     *
     * @param map           the selected map
     * @param scanner       read user input
     * @param selectedLevel selected level of the game (1 easy, 2 medium, 3 hard or Q to exit to the main menu)
     * @throws Exception
     */
    public static void startGame(char[][] map, Scanner scanner, char selectedLevel) throws Exception {
        char nextMove = ' '; // Initialize the variable to detect the next move entered by the user
        int moves = 0;
        boolean isGameWon = false;
        String fileName = "games.txt";

        setInitialPosition(map); // Once the game starts this method sets the first valid position in the map

        /*
         * If a map is not valid, prints an error and returns to the main menu
         * If it's valid prints the map
         */
        if (row == -1 || col == -1) {
            System.out.println("ERROR: No hi ha cap posició vàlida al mapa!");
            nextMove = 'Q';
        } else {
            map[row][col] = 'P';
            printMap(map);
        }

        //  Loops until the player quits the game or wins
        while (nextMove != 'Q' && !isGameWon) {
            nextMove = scanner.next().charAt(0); // Detects the next move
            nextMove = Character.toUpperCase(nextMove);

            //  Moves the player and if it's a valid move adds +1 to the variable "moves"
            int move = move(map, nextMove);
            moves += move;

            //  Checks if the player wins
            if (row == -1 && col == -1) {
                isGameWon = true;
                setInitialPosition(map); // Resets the first valid position in the map
                map[row][col] = 'P'; // Updates the position

                System.out.println("Enhorabona has arribat a la sortida!!!");

                //  Resets player row and column to -1
                row = -1;
                col = -1;
            }


            //  If the player exits without winning saves the game data to the file
            if (nextMove == 'q' || nextMove == 'Q') {
                row = -1;
                col = -1;
                saveGame(fileName, isGameWon, selectedLevel, moves);
            }
        }
        //  If the player wins saves the game data to the file
        saveGame(fileName, isGameWon, selectedLevel, moves);
    }

    /**
     * Moves the player through the map
     *
     * @param map      is the selected level
     * @param nextMove the move that user has made (WASD)
     * @return the number of moves that user has made
     */
    public static int move(char[][] map, char nextMove) {
        int moves = 0;

        switch (nextMove) {
            case 'A':
                //  Checks if going to left (A) it's valid
                if (isInsideMatrix(map, row, col - 1)) {
                    //  Checks if the next position contains an 'S' (exit)
                    if (map[row][col - 1] == 'S') {
                        map[row][col] = '□'; // replaces the old position for a blank space

                        //  Resets position to [-1, -1]
                        row = -1;
                        col = -1;

                        //  counts one more move
                        moves = 1;
                    }
                }

                //  If it's a valid move (is inside matrix and it's not a wall) updates the position and prints the map
                if (isValidMove(map, row, col - 1)) {
                    map[row][col] = '□';
                    col -= 1;
                    map[row][col] = 'P';

                    moves = 1;

                    printMap(map);
                }
                break;
            case 'D':
                if (isInsideMatrix(map, row, col + 1)) {
                    if (map[row][col + 1] == 'S') {
                        map[row][col] = '□';

                        row = -1;
                        col = -1;

                        moves = 1;
                    }
                }

                if (isValidMove(map, row, col + 1)) {
                    map[row][col] = '□';
                    col += 1;
                    map[row][col] = 'P';

                    moves = 1;

                    printMap(map);
                }
                break;
            case 'S':
                if (isInsideMatrix(map, row + 1, col)) {
                    if (map[row + 1][col] == 'S') {
                        map[row][col] = '□';
                        row = -1;
                        col = -1;

                        moves = 1;
                    }
                }

                if (isValidMove(map, row + 1, col)) {
                    map[row][col] = '□';
                    row += 1;
                    map[row][col] = 'P';

                    moves = 1;

                    printMap(map);
                }

                break;
            case 'W':
                if (isInsideMatrix(map, row - 1, col)) {
                    if (map[row - 1][col] == 'S') {
                        map[row][col] = '□';
                        row = -1;
                        col = -1;

                        moves = 1;
                    }
                }

                if (isValidMove(map, row - 1, col)) {
                    map[row][col] = '□';
                    row -= 1;
                    map[row][col] = 'P';

                    moves = 1;

                    printMap(map);
                }
                break;
            default:
                break;
        }
        return moves;
    }

    /**
     * Asks the user to select a new game, show results of the games or exit the game
     *
     * @param scanner reads user input
     * @return option selected by user
     */
    public static int selectMenuOption(Scanner scanner) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("╠═══════  Laberint de Pepito  ══════╣");
        System.out.println("╠═════════════════════════════╣");
        System.out.println("╠ 1. Nova partida");
        System.out.println("╠ 2. Veure els resultats de les partides");
        System.out.println("╠ 3. Sortir");
        System.out.println("╚═════════════════════════════╝");
        System.out.print("Selecciona una opció: ");


        return scanner.nextInt();
    }

    /**
     * This method asks the user to select a level option and returns the selected level
     *
     * @param scanner reads user input
     * @return the selected level (1 easy, 2 medium, 3 hard or Q to return to the main menu)
     */
    public static char selectLevelOption(Scanner scanner) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("╠═══════  Selecció de nivell  ═══════╣");
        System.out.println("╠═════════════════════════════╣");
        System.out.println("╠ 1. Fàcil");
        System.out.println("╠ 2. Mitjà");
        System.out.println("╠ 3. Difícil");
        System.out.println("╠ Q. Sortir al menú principal");
        System.out.println("╚═════════════════════════════╝");
        System.out.print("Selecciona una opció: ");
        char selectedLevel = scanner.next().charAt(0); //   Reads the first character entered by user

        selectedLevel = Character.toUpperCase(selectedLevel); //    Change the selected level character to uppercase

        return selectedLevel;
    }

    /**
     * This method saves the game data
     *
     * @param fileName      Name or path of the file where data of each game will be saved
     * @param hasWon        Indicates if the player wins the game
     * @param selectedLevel selected level of the game (1 easy, 2 medium, 3 hard)
     * @param moves         the number of moves that the playes did in the game
     * @throws Exception
     */
    public static void saveGame(String fileName, boolean hasWon, char selectedLevel, int moves) throws Exception {
        File file = new File(fileName);
        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true)); //   Initialize PrintWriter with FileWriter to not overwrite the entire file

        //  Writes to file the selected level
        switch (selectedLevel) {
            case '1': {
                printWriter.println("Nivell fàcil");
                break;
            }
            case '2': {
                printWriter.println("Nivell mitjà");
                break;
            }
            case '3': {
                printWriter.println("Nivell difícil");
                break;
            }
            default:
                break;
        }

        printWriter.println("Moviments realitzats: " + moves);

        /*
         * If the player wins writes to file "Partida guanyada"
         * If the player exit the game writes to file "El jugador no ha arribat a la sortida"
         */
        if (hasWon) {
            printWriter.println("Partida guanyada ");
            printWriter.println();
        } else {
            printWriter.println("El jugador no ha arribat a la sortida");
            printWriter.println();
        }
        printWriter.close();
    }

    /**
     * This method counts the number of played games
     *
     * @param fileName Name or path of the file where data of each game will be saved
     * @return the number of played games
     * @throws Exception
     */
    public static int playedGames(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scFile = new Scanner(file);

        int games = 0;

        //  This loop counts the number of lines (skips 4 lines to read the actual number of games)
        while (scFile.hasNextLine()) {
            for (int i = 0; i < 4; i++) {
                scFile.nextLine();
            }
            games++;
        }
        //  Returns the total number of games played
        return games;
    }

    /**
     * This method displays all the games results
     *
     * @param fileName Name or path of the file where data of each game will be saved
     * @throws Exception
     */
    public static void showGamesResults(String fileName) throws Exception {
        File file = new File(fileName); //  Initialize File
        Scanner scFile = new Scanner(file); //  Initialize Scanner to read from file

        System.out.println("Total de partides jugades: " + playedGames(fileName) + "\n");

        //  This loop displays each line of the file
        while (scFile.hasNextLine()) {
            System.out.println(scFile.nextLine());
        }
    }

    public static void main(String[] args) throws Exception {
        String file = "games.txt"; //   Name or path of the file where data of each game will be saved
        Scanner scanner = new Scanner(System.in);

        //  Initialize variables to control the game
        boolean exitGame = false;
        boolean hasWon = false;

        while (!exitGame && !hasWon) {
            int selectedMenu = selectMenuOption(scanner);

            while (selectedMenu == 1) {
                char selectedLevel = selectLevelOption(scanner);
                if (selectedLevel == '1') {
                    startGame(easyMap(), scanner, selectedLevel);
                    selectedMenu = selectMenuOption(scanner);
                } else if (selectedLevel == '2') {
                    startGame(mediumMap(), scanner, selectedLevel);
                    selectedMenu = selectMenuOption(scanner);
                } else if (selectedLevel == '3') {
                    startGame(hardMap(), scanner, selectedLevel);
                    selectedMenu = selectMenuOption(scanner);
                } else if (selectedLevel == 'Q' || selectedLevel == 'q') {
                    selectedMenu = selectMenuOption(scanner);
                }
            }
            if (selectedMenu == 2) {
                showGamesResults(file);
            } else if (selectedMenu == 3) {
                exitGame = true;
                System.out.println("Gràcies per jugar, fins a una altra!");
            } else {
                System.out.println("La opció triada no es correcta si us plau escull una opció vàlida");
            }
        }
    }
}