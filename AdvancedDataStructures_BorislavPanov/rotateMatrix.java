import java.util.Scanner;

public class rotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rows of Matrix: ");
        int rowsOfMatrix = scanner.nextInt();
        System.out.print("Columns of Matrix: ");
        int columnsOfMatrix = scanner.nextInt();
        int[][] matrix = new int[rowsOfMatrix][columnsOfMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Row: " + (i+1) + " Element: " + (j+1) + ": ");
                matrix[i][j] = scanner.nextInt();

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                matrix[i][matrix[0].length - 1 - j] = temp;
            }
        }

        System.out.println("Rotated matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
