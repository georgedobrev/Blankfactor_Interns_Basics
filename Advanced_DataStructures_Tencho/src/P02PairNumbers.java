import java.util.Scanner;


public class P02PairNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = input.nextInt();
        int columns = input.nextInt();
        sumScanner(rows, columns);
    }

    private static int [][]sumScanner (int rows, int cols){
        Scanner input = new Scanner(System.in);
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        System.out.println("Enter the elements of matrix 1:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return sumMatrix;
    }
}
