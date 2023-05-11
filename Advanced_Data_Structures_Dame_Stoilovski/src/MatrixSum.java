import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    public int[][] FindSumOfTwoMatrix(int[][] firstMatrix, int[][] secondMatrix){
        int rows = firstMatrix.length;
        int columns = firstMatrix[0].length;
        int[][] newMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                newMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return newMatrix;
    }
    public int[][] getMatrixDataFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrix: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns for the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter the value for [%d, %d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrix));
    }

}
