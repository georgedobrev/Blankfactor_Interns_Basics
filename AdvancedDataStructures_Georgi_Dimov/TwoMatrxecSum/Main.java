import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Exercise sum two matrices and print the result
        System.out.print("Enter number of rows for the matrices: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns for the matrices: ");
        int columns = input.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.printf("Enter values for the first matrix [%d, %d] = ", i, j);
                matrix1[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.printf("Enter values for the second matrix [%d, %d] = ", i, j);
                matrix2[i][j] = input.nextInt();
            }
        }

        int sum1 = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sum1 = sum1 + matrix1[i][j];
            }
        }

        int sum2 = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sum2 = sum2 + matrix2[i][j];
            }
        }

        int sum3 = sum1 + sum2;
        System.out.println("The sum of all elements in the matrix is: " + sum3);

    }
}