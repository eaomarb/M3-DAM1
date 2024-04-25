public class A9_4 {
    public static void main(String[] args) {
        char[][] chessboard = {
                {'t', 'a', 'c', 'q', 'k', 'a', 'c', 't'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'T', 'A', 'C', 'Q', 'K', 'A', 'C', 'T'}
        };

        for (int row = 0; row < chessboard.length; row++) {
            for (int col = 0; col < chessboard[row].length; col++) {
                System.out.print(chessboard[row][col]);
                if (chessboard[row][col] == ' '){
                    System.out.print('·');
                }
            }
            System.out.println();
        }
    }
}
