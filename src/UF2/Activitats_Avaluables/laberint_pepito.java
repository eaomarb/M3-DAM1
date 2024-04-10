import java.util.Scanner;

public class laberint_pepito {
    public static char[][] easyMap() {
        return new char[][]{
                {'P', 'M', 'M', 'S'},
                {'-', 'M', 'M', '-'},
                {'-', 'M', 'M', '-'},
                {'-', '-', '-', '-'}
        };
    }

    public static char[][] mediumMap() {
        return new char[][]{
                {'P', 'M', 'M', '-', '-', '-', '-', 'S'},
                {'-', '-', 'M', '-', '-', '-', 'M', '-'},
                {'-', '-', 'M', '-', '-', '-', 'M', '-'},
                {'-', '-', '-', '-', 'M', 'M', '-', '-'},
                {'-', '-', '-', '-', 'M', 'M', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', 'M', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-'}
        };
    }

    public static char[][] hardMap() {
        return new char[][]{
                {'P', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'M', 'M', 'M', 'M', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', 'M', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', 'M', 'M', 'M', 'M', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', 'M', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', 'M', '-', '-', '-', '-', '-'},
                {'-', 'M', 'M', 'M', 'M', '-', 'M', 'M', 'M', 'M', '-', '-'},
                {'-', 'M', '-', '-', '-', '-', '-', '-', '-', 'M', '-', '-'},
                {'-', 'M', '-', '-', '-', '-', '-', '-', '-', 'M', '-', '-'},
                {'-', 'M', '-', '-', '-', '-', '-', '-', '-', 'M', 'M', 'S'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };
    }

    public static boolean isInsideMatrix(char[][] map, int row, int col) {

        // Number of rows and columns
        int nRows = map.length;
        int nColumns = map[0].length;

        // Return true if row & column are inside matrix and false when not
        return (row >= 0 && row < nRows && col >= 0 && col < nColumns);
    }

    public static boolean isAWall(char[][] map, int row, int col) {
        return map[row][col] == 'M';
    }

    public static void printMap(char[][] map) {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                System.out.print(map[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void startGame(char[][] map, Scanner scanner) {
        int row = 0;
        int col = 0;

        char nextMove = ' ';
        printMap(map);

        while (nextMove != 'Q') {
            nextMove = scanner.next().charAt(0);
            nextMove = Character.toUpperCase(nextMove);
            move(map, row, col, nextMove);
            printMap(map);
        }
    }

    public static boolean isGameWon(char[][] map, int row, int col) {
        return map[row][col] == 'S';
    }

    public static void move(char[][] map, int row, int col, char nextMove) {
        if (!isValidMove(map, row, col)) {
            return;
        }

        switch (nextMove) {
            case 'A':
                map[row][col] = '-';
                col -= 1;
                map[row][col] = 'P';
                break;
            case 'W':
                map[row][col] = '-';
                row -= 1;
                map[row][col] = 'P';
                break;
            case 'D':
                map[row][col] = '-';
                col += 1;
                map[row][col] = 'P';
                break;
            case 'S':
                map[row][col] = '-';
                row +=  1;
                map[row][col] = 'P';
                break;
            default:
                break;
        }


    }

    public static boolean isValidMove(char[][] map, int row, int col) {
        return isInsideMatrix(map, row, col) && !isAWall(map, row, col);
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