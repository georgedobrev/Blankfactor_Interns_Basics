import java.util.Scanner;

public class MatrixRotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix");
        int  r = input.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        int c = input.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = input.nextInt();



        int n = r;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                int temp = a[i][j];
                a[i][j] = a[n - 1 - j][i];
                a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];
                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
                a[j][n - 1 - i] = temp;
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println("");

            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
        }

    }
}
