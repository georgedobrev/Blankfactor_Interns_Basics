import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfTwoMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = new int[][] {
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                matrix1[row][col] += matrix2[row][col];
            }
        }

        Stream.of(matrix1).map(Arrays::toString).forEach(System.out::println);
    }
}
