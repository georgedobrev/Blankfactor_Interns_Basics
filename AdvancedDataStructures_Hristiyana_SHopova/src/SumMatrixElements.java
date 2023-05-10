import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of the rows for matrix 1: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the numbers of the columns for matrix 1: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.printf("Enter the first matrix elements for [%d %d]: ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int[][] matrix2 = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.printf("Enter the second matrix elements for [%d %d]: ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }


        int[][] resultMatrix = new int[rows][columns];
        System.out.println("The result matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
