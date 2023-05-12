import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter value for N for [N][N] matrix\nN =  ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        //Entering values for the matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("Enter value for [%d][%d] = ", i, j);

                matrix[i][j] = input.nextInt();
            }
        }

        //Printing the matrix before rotating
        System.out.println("--------Entered matrix--------");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Printing the rotated matrix
        System.out.println("--------Rotated matrix--------");
        for(int j = 0; j < n; j++){
            for(int i = n - 1; i >= 0; i--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}