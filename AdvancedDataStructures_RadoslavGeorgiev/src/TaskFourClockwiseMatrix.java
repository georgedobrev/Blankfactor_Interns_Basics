import java.util.Scanner;

//Exercise 2: Write a program that takes a 2D matrix of size N x N as input and rotates it 90 degrees clockwise in place.
//
//
//Example input:
//Matrix:                 Example output:
//1 2 3                     7 4 1
//4 5 6                     8 5 2
//7 8 9                     9 6 3
public class TaskFourClockwiseMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int newRows = scanner.nextInt();
        int newColumns = scanner.nextInt() ;

       int[][] new2dArray= new int[newRows][newColumns];
        int[][] matrix1 = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j]);
            }
            System.out.println();

        }
        System.out.println("Insert New rows and columns");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                new2dArray[newRows][newColumns]= matrix1[rows][columns];
                newRows++;
            }
            newColumns++;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(new2dArray[newRows][newColumns]);
            }
            System.out.println();

        }
    }
}
