import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0;i < rows;i++) {
            for (int j = 0;j < columns;j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0;i < rows;i++) {
            for (int j = 0;j < columns;j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i < rows;i++) {
            for (int j = 0;j < columns;j++) {
                sum[i][j] = matrix1[i][j] +matrix2[i][j];
            }
        }
        System.out.println("The sum of the matrices is: ");
        for (int i = 0;i < rows;i++) {
            for (int j = 0;j < columns;j++) {
                System.out.println(sum[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
