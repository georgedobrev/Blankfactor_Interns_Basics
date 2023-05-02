package advancedDataStructures;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrix: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns for the matrix: ");
        int cols = scanner.nextInt();

        int [][] matrix = new int[rows][cols];

        //Reading matrix values from console
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter value for [%d, %d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }

        }
        int sum = 0;
        for(int k = 0; k < rows; k++){
            for ( int l = 0; l < cols; l++){
                sum = sum + matrix[k][l];
            }
            System.out.println("Sum of " + (k+1) +" row: " + sum);
        }
    }
}
