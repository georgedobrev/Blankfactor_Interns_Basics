import java.util.Scanner;

//Exercise 1: Find the sum of two matrixes - Write a program that takes two matrices
// of the same size as input and outputs their sum.
//
//
//Example input:
//Matrix 1:                Matrix 2:                 Example Output:
//1 2 3                       7      8     9                  8  10   12
//4 5 6                       10   11  12                14  16  18
public class Task3SumOfTwoMatrix {
    private static void PrintTheSumOfTheTwoMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = input.nextInt();


        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Elements of the first matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }


        System.out.println("Elements of the second matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }


        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }


        System.out.println("Sum of the two matrices is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintTheSumOfTheTwoMatrix();


    }
}

