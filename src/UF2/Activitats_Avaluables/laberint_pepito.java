import java.util.Scanner;

public class laberint_pepito {
    public static char[][] easyMap() {
        return new char[][]{
                {'P', 'M', 'M', 'S'},
                {' ', 'M', 'M', ' '},
                {' ', 'M', 'M', ' '},
                {' ', ' ', ' ', ' '}
        };
    }

    public static char[][] mediumMap() {
        return new char[][]{
                {'P', 'M', 'M', ' ', ' ', ' ', ' ', 'S'},
                {' ', ' ', 'M', ' ', ' ', ' ', 'M', ' '},
                {' ', ' ', 'M', ' ', ' ', ' ', 'M', ' '},
                {' ', ' ', ' ', ' ', 'M', 'M', ' ', ' '},
                {' ', ' ', ' ', ' ', 'M', 'M', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'M', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
    }

    public static char[][] hardMap() {
        return new char[][]{
                {'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'M', 'M', 'M', 'M', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', 'M', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', 'M', 'M', 'M', 'M', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', 'M', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', 'M', ' ', ' ', ' ', ' ', ' '},
                {' ', 'M', 'M', 'M', 'M', ' ', 'M', 'M', 'M', 'M', ' ', ' '},
                {' ', 'M', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'M', ' ', ' '},
                {' ', 'M', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'M', ' ', ' '},
                {' ', 'M', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'M', 'M', 'S'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
    }

    public static boolean isInsideMatrix(char[][] map, int row, int col) {

        // Number of rows and columns
        int nRows = map.length;
        int nColumns = map[0].length;

        // Return true if row & column are inside matrix and false when not
        return (row >= 0 && row < nRows && col >= 0 && col < nColumns);
    }

    public static boolean isNotAWall(char[][] map, int row, int col) {
        return map[row][col] != 'M';
    }

    public static void moveUp(char[][] map, int row, int col) {
        char nextMove = moves();
        if (isInsideMatrix(map, row, col) && isNotAWall(map, row, col) && nextMove == 'W') {
            row -= 1;
            map[row][col] = 'P';
            System.out.println("hola xd");
        }
    }

    public static void moveDown(char[][] map, int row, int col) {
        char nextMove = moves();
        if (isInsideMatrix(map, row, col) && isNotAWall(map, row, col) && nextMove == 'S') {
            row += 1;
            map[row][col] = 'P';
        }
    }

    public static void moveRight(char[][] map, int row, int col) {
        char nextMove = moves();
        if (isInsideMatrix(map, row, col) && isNotAWall(map, row, col) && nextMove == 'D') {
            col += 1;
            map[row][col] = 'P';
        }
    }

    public static void moveLeft(char[][] map, int row, int col) {
        char nextMove = moves();
        if (isInsideMatrix(map, row, col) && isNotAWall(map, row, col) && nextMove == 'A') {
            col -= 1;
            map[row][col] = 'P';
        }
    }

    public static char moves() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static void printMap(char[][] map) {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                System.out.print(map[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        char[][] map;

        while (menu != 3) {
            System.out.println();
            System.out.println("###########");
            System.out.println("#      Menu     #");
            System.out.println("###########");
            System.out.println("1. Jugar partida");
            System.out.println("2. Resultats partides");
            System.out.println("3. Sortir");
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("Quin nivell vols jugar?");
                System.out.println("1. Fàcil");
                System.out.println("2. Mitjà");
                System.out.println("3. Difícil");

                int nivell = scanner.nextInt();

                if (nivell == 1) {
                    map = easyMap();
                    printMap(map);

                }
                play();
            } else if (menu == 2) {
                // resultats partida
            } else if (menu == 3) {
                System.out.println("Has sortit del joc!");
            } else {
                System.out.println("Revisa bé la opció que has escollit (1-3)");
                System.out.println("1. Jugar partida");
                System.out.println("2. Resultats partides");
                System.out.println("3. Sortir");
                menu = scanner.nextInt();
            }
        }
    }

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        char nextMove = scanner.next().charAt(0);

        while (nextMove != 'Q'){
            if (nextMove == 'W'){
                //moveUp(map);
            }
        }



        /*switch (nextMove){
            case 'W':
                moveUp();
        }*/

    }

    public static void main(String[] args) {
        menu();
    }
}