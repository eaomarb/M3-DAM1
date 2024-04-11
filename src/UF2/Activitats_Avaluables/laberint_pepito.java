import java.util.Scanner;

public class laberint_pepito {
    static int row = 0;
    static int col = 0;

    public static char[][] easyMap() {
        return new char[][]{
                {'P', 'M', 'M', 'S'},
                {'□', 'M', 'M', '□'},
                {'□', 'M', 'M', '□'},
                {'□', '□', '□', '□'}
        };
    }

    public static char[][] mediumMap() {
        return new char[][]{
                {'P', 'M', 'M', '□', '□', '□', '□', 'S'},
                {'□', '□', 'M', '□', '□', '□', 'M', '□'},
                {'□', '□', 'M', '□', '□', '□', 'M', '□'},
                {'□', '□', '□', '□', 'M', 'M', '□', '□'},
                {'□', '□', '□', '□', 'M', 'M', '□', '□'},
                {'□', '□', '□', '□', '□', '□', '□', '□'},
                {'□', '□', 'M', '□', '□', '□', '□', '□'},
                {'□', '□', '□', '□', '□', '□', '□', '□'}
        };
    }

    public static char[][] hardMap() {
        return new char[][]{
                {'P', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□', '□'},
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

    public static boolean isInsideMatrix(char[][] map, int row, int col) {
        int numFilas = map.length;
        int numColumnas = map[0].length;

        return row >= 0 && row < numFilas && col >= 0 && col < numColumnas;
    }

    public static boolean isAWall(char[][] map, int row, int col) {
        return map[row][col] == 'M';
    }

    public static boolean isValidMove(char[][] map, int row, int col) {
        return isInsideMatrix(map, row, col) && !isAWall(map, row, col);
    }


    public static void printMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void startGame(char[][] map, Scanner scanner) {
        // TODO: implementar vuelta al menu tras ganar
        char nextMove = ' ';
        printMap(map);

        while (nextMove != 'Q' && !move(map, nextMove)) {
            nextMove = scanner.next().charAt(0);
            nextMove = Character.toUpperCase(nextMove);
            move(map, nextMove);

        }
    }


    public static boolean move(char[][] map, char nextMove) {
        boolean isGameWon = false;

        switch (nextMove) {
            case 'A':
                if (map[row][col - 1] == 'S') {
                    isGameWon = true;
                } else if (isValidMove(map, row, col - 1)) {
                    map[row][col] = '□';
                    col -= 1;
                    map[row][col] = 'P';
                    printMap(map);
                }
                break;
            case 'D':
                if (map[row][col + 1] == 'S') {
                    isGameWon = true;
                } else if (isValidMove(map, row, col + 1)) {
                    map[row][col] = '□';
                    col += 1;
                    map[row][col] = 'P';
                    printMap(map);
                }
                break;
            case 'S':
                if (map[row + 1][col] == 'S') {
                    isGameWon = true;
                } else if (isValidMove(map, row + 1, col)) {
                    map[row][col] = '□';
                    row += 1;
                    map[row][col] = 'P';
                    printMap(map);
                }
                break;
            case 'W':
                if (map[row - 1][col] == 'S') {
                    isGameWon = true;
                }

                if (!isInsideMatrix(map, row - 1, col) || isAWall(map, row - 1, col)) {
                    printMap(map);
                } else {
                    map[row][col] = '□';
                    row -= 1;
                    map[row][col] = 'P';
                    printMap(map);
                }
                break;
            default:
                break;
        }

        return isGameWon;
    }


    public static int selectMenuOption(Scanner scanner) {
        System.out.println();
        System.out.println("###########");
        System.out.println("#      Menu     #");
        System.out.println("###########");
        System.out.println("1. Jugar partida");
        System.out.println("2. Resultats partides");
        System.out.println("3. Sortir");

        return scanner.nextInt();
    }

    public static char selectLevelOption(Scanner scanner) {
        System.out.println("Quin nivell vols jugar?");
        System.out.println("1. Fàcil");
        System.out.println("2. Mitjà");
        System.out.println("3. Difícil");
        char selectedLevel = scanner.next().charAt(0);
        selectedLevel = Character.toUpperCase(selectedLevel);

        return selectedLevel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = selectMenuOption(scanner);

        while (selectedMenu != 3) {
            if (selectedMenu == 1) {
                char selectedLevel = selectLevelOption(scanner);

                if (selectedLevel == '1') {
                    startGame(easyMap(), scanner);
                } else if (selectedLevel == '2') {
                    startGame(mediumMap(), scanner);
                } else if (selectedLevel == '3') {
                    startGame(hardMap(), scanner);
                } else if (selectedLevel == 'Q') {
                    selectedMenu = selectMenuOption(scanner);
                }

            } else if (selectedMenu == 2) {
                // resultats partida
                System.out.println("Aqui surten els resultats1");
                selectedMenu = selectMenuOption(scanner);
            } else if (selectedMenu == 'Q') {
                selectedMenu = selectMenuOption(scanner);
            } else {
                System.out.println("La opció triada no es correcte si us plau escull una opció vàlida");
                System.out.println("1. Jugar partida");
                System.out.println("2. Resultats partides");
                System.out.println("3. Sortir");
                selectedMenu = scanner.nextInt();
            }
        }

        System.out.println("Gràcies per jugar fins un altre!");
    }
}