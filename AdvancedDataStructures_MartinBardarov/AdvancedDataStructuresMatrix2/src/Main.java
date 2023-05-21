import java.util.Arrays;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] rotateMatrix(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                result[j][i] = matrix[Math.abs(matrix[0].length - 1 - i)][j];
            }
        }

        return result;


    }
}