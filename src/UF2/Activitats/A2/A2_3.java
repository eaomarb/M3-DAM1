public class A2_3 {
    public static int calculateNeighborsSum(int[][] matrix, int row, int col) {
        int neigboursSum = 0;

        for (row = row - 1; row < row + 1; row++) {
            for (col = col - 1; col < col + 1; col++) {
                if (matrix[row][col]){

                }
            }
        }
        return neigboursSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 4, 8, 6, 4},
                {2, 5, 6, 5, 4},
                {2, 5, 4, 5, 2},
                {1, 4, 0, 5, 8}
        };


        System.out.println(calculateNeighborsSum(matrix, 0, 0));
    }
}
