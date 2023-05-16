import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = scanner.nextInt();
        System.out.println("Enter columns");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] matrix3 = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Enter value for matrix1 row " + i + " column " + j );
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Enter value for matrix2 row " + i + " column " + j );
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols ; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}