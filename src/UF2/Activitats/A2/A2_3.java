public class A2_3 {
    public static int calculateNeighborsSum(int[][] matrix, int row, int col) {
        int neigboursSum = 0;
        int nPosition = matrix[row][col]; //restar al final

        for (row = 0; row < matrix.length; row++){
            for (col = 0; col < matrix[row].length; col++){
                if (row == 0 || col != 0){
                    System.out.println(matrix[row][col-1]);
                } else if (row != 0 || col == 0){
                    System.out.println(matrix[row-1][col]);
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
