import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class RotateMatrix {
    private static void rotateMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row; col < matrix[row].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length / 2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix [row][matrix.length - 1 - col];
                matrix[row][matrix.length - 1 - col] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the size of the matrix: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("Input a number for matrix[%d][%d]: ", row, col);
                matrix[row][col] = Integer.parseInt(scanner.nextLine());
            }
        }

        rotateMatrix(matrix);

        Stream.of(matrix).map(Arrays::toString).forEach(System.out::println);
    }
}
