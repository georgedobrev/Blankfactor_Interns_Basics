import java.util.Arrays;

public class MatrixSum {
    public static void main(String[] args) {

        int[][] matrix1 = {{3, 2, 1}, {9, 11, 5}, {6, 0, 13}};
        int[][] matrix2 = {{3, 2, 1}, {9, 11, 5}, {6, 0, 14}};

        System.out.println(Arrays.deepToString(sumMatrix(matrix1, matrix2)));

    }

    private static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        int res[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return res;

    }
}
