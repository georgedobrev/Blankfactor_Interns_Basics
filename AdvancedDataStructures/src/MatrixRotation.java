import java.util.Scanner;
public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int[][] rotatedMatrix = new int[n][n];

        System.out.println("Enter elements of the matrix: ");
        for (int i = 0;i < n; i++) {
            for (int j = 0; j < n;j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                rotatedMatrix[j][n-1-i] = matrix[i][j];
            }
        }
        System.out.println("The original matrix is: ");
        printMatrix(matrix);

        System.out.println("The rotated matrix is: ");
        printMatrix(rotatedMatrix);
        sc.close();

    }
    public static void printMatrix(int[][]matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0;i < rows;i++) {
            for (int  j = 0; j < columns;j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
