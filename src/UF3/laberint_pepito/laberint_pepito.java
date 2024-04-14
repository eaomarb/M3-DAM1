import java.util.Scanner;

public class laberint_pepito {
    static int row = -1;
    static int col = -1;

    public static char[][] easyMap() {
        return new char[][]{
                {'M', 'M', '□', 'S'},
                {'□', 'M', 'M', '□'},
                {'□', 'M', 'M', '□'},
                {'□', '□', '□', '□'}
        };
    }

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

    public static void setInitialPosition(char[][] map) {
        int nearestRow = -1;
        int nearestCol = -1;
        int minDistance = Integer.MAX_VALUE;
        int distance;


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!isAWall(map, i, j)) {
                    distance = Math.abs(row - i) + Math.abs(col - j);

                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestRow = i;
                        nearestCol = j;
                        if (map[nearestRow][nearestCol] == 'S') {
                            row = -1;
                            col = -1;
                            return;
                        }
                    }
                }
            }
        }

        row = nearestRow;
        col = nearestCol;
    }

    public static void printMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean startGame(char[][] map, Scanner scanner) {
        char nextMove = ' ';
        int moves = 0;
        boolean isGameWon = false;

        setInitialPosition(map);

        if (row == -1 || col == -1) {
            System.out.println("No hi ha cap posició vàlida a la matriu");
            nextMove = 'Q';
        } else {
            map[row][col] = 'P';
            printMap(map);
        }

        while (nextMove != 'Q') {
            nextMove = scanner.next().charAt(0);
            nextMove = Character.toUpperCase(nextMove);

            int moveResult = move(map, nextMove, scanner);
            moves += moveResult;

            if (row == -1 && col == -1) {
                isGameWon = true;
                setInitialPosition(map);
                map[row][col] = 'P';
                System.out.println("Enhorabona!! Has guanyat!");
                return false;
            }


            if (nextMove == 'q' || nextMove == 'Q') {
                return false;
            }
        }
        return isGameWon;
    }


    public static int move(char[][] map, char nextMove, Scanner scanner) {
        int moves = 0;

        switch (nextMove) {
            case 'A':
                if (isInsideMatrix(map, row, col - 1)) {
                    if (map[row][col - 1] == 'S') {
                        map[row][col] = '□';

                        row = -1;
                        col = -1;

                        moves = 1;
                    }
                }

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

    public static int selectMenuOption(Scanner scanner) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("                   LABERINT PEPITO                  ");
        System.out.println("╠═════════════════════════════╣");
        System.out.println("╠ 1. Nova partida                     ");
        System.out.println("╠ 2. Veure els resultats de les partides");
        System.out.println("╠ 3. Sortir                                    ");
        System.out.println("╚═════════════════════════════╝");
        System.out.print("Selecciona una opció: ");


        return scanner.nextInt();
    }

    public static char selectLevelOption(Scanner scanner) {
        System.out.println("Quin nivell vols jugar? Prem Q per sortir al menú principal");
        System.out.println("1. Fàcil");
        System.out.println("2. Mitjà");
        System.out.println("3. Difícil");
        char selectedLevel = scanner.next().charAt(0);

        selectedLevel = Character.toUpperCase(selectedLevel);

        return selectedLevel;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean exitGame = false;
        boolean hasWon = false;

        while (!exitGame && !hasWon) {
            int selectedMenu = selectMenuOption(scanner);

            while (selectedMenu == 1) {
                char selectedLevel = selectLevelOption(scanner);
                if (selectedLevel == '1') {
                    startGame(easyMap(), scanner);
                    selectedMenu = selectMenuOption(scanner);
                } else if (selectedLevel == '2') {
                    startGame(mediumMap(), scanner);
                } else if (selectedLevel == '3') {
                    startGame(hardMap(), scanner);
                }
            }
            if (selectedMenu == 2) {
                System.out.println("resultats");
            } else if (selectedMenu == 3) {
                exitGame = true;
                System.out.println("Gràcies per jugar fins un altre!");
            } else {
                System.out.println("La opció triada no es correcte si us plau escull una opció vàlida");
                System.out.println("1. Jugar partida");
                System.out.println("2. Resultats partides");
                System.out.println("3. Sortir");
            }
        }
    }
}