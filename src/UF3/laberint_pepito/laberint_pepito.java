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

    public static void startGame(char[][] map, Scanner scanner) {
        char nextMove = ' ';
        int moves = 0;

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
            move(map, nextMove, scanner);
            moves++;
        }
    }

    public static void move(char[][] map, char nextMove, Scanner scanner) {
        switch (nextMove) {
            case 'A':
                if (isInsideMatrix(map, row, col - 1)) {
                    if (map[row][col - 1] == 'S') {
                        map[row][col] = '□';
                        System.out.println("Enhorabona has guanyat!!!");
                        selectMenuOption(scanner);

                        row = -1;
                        col = -1;
                        setInitialPosition(map);
                        map[row][col] = 'P';
                    }
                }

                if (isValidMove(map, row, col - 1)) {
                    map[row][col] = '□';
                    col -= 1;
                    map[row][col] = 'P';
                }
                printMap(map);
                break;
            case 'D':
                if (isInsideMatrix(map, row, col + 1)) {
                    if (map[row][col + 1] == 'S') {
                        map[row][col] = '□';
                        System.out.println("Enhorabona has guanyat!!!");
                        selectMenuOption(scanner);

                        row = -1;
                        col = -1;
                        setInitialPosition(map);
                        map[row][col] = 'P';
                    }
                }

                if (isValidMove(map, row, col + 1)) {
                    map[row][col] = '□';
                    col += 1;
                    map[row][col] = 'P';
                }
                printMap(map);
                break;
            case 'S':
                if (isInsideMatrix(map, row + 1, col)) {
                    if (map[row + 1][col] == 'S') {
                        map[row][col] = '□';
                        System.out.println("Enhorabona has guanyat!!!");
                        selectMenuOption(scanner);

                        row = -1;
                        col = -1;
                        setInitialPosition(map);
                        map[row][col] = 'P';
                    }
                }

                if (isValidMove(map, row + 1, col)) {
                    map[row][col] = '□';
                    row += 1;
                    map[row][col] = 'P';
                }
                printMap(map);
                break;
            case 'W':
                if (isInsideMatrix(map, row - 1, col)) {
                    if (map[row - 1][col] == 'S') {
                        map[row][col] = '□';
                        System.out.println("Enhorabona has guanyat!!!");
                        selectMenuOption(scanner);

                        row = -1;
                        col = -1;
                        setInitialPosition(map);
                        map[row][col] = 'P';
                    }
                }

                if (isValidMove(map, row - 1, col)) {
                    map[row][col] = '□';
                    row -= 1;
                    map[row][col] = 'P';
                }
                printMap(map);
                break;
            case 'Q':
                row = -1;
                col = -1;
                setInitialPosition(map);
                map[row][col] = 'P';

            default:
                break;
        }
    }

    public static int selectMenuOption(Scanner scanner) {
        System.out.println("###########");
        System.out.println("#      Menu     #");
        System.out.println("###########");
        System.out.println("1. Jugar partida");
        System.out.println("2. Resultats partides");
        System.out.println("3. Sortir");

        return scanner.nextInt();
    }

    public static char selectLevelOption(Scanner scanner) {
        System.out.println("Quin nivell vols jugar? Prem Q per sortir al menú principal");
        System.out.println("1. Fàcil");
        System.out.println("2. Mitjà");
        System.out.println("3. Difícil");
        char selectedLevel = scanner.next().charAt(0);

        if (selectedLevel == 'Q' || selectedLevel == 'q') {
            selectMenuOption(scanner);
        } else {
            selectedLevel = Character.toUpperCase(selectedLevel);
        }

        return selectedLevel;
    }

    public static void main(String[] args) throws Exception {
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
                }
            } else if (selectedMenu == 2) {
                System.out.println("resultats");
            }

            if (selectedMenu == 'Q' || selectedMenu == 'q') {
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