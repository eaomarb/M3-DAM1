public class A9_3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 6, 7, 8},
                {2, 4, 5, 7, 9},
                {1, 4, 0, 7, 3},
                {2, 5, 6, 8, 4}};

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == 0 || col == matrix.length || row == 0 || row == matrix.length - 1) {
                    sum += matrix[row][col];
                }
            }
        }

        System.out.println(sum);
    }
}