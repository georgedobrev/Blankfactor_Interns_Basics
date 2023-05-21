import java.util.Arrays;
import java.util.List;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] result = sumTwoMatrices(matrix1, matrix2);

        System.out.println(Arrays.deepToString(result));
    }


    public static int[][] sumTwoMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] summedMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                summedMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        return summedMatrix;
    }
}