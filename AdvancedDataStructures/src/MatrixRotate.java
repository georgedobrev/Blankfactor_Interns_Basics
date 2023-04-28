public class MatrixRotate {
    public static void main(String[] args) {
        int[][] a = {{3, 2, 1},
                {9, 11, 5},
                {6, 0, 13}};

        int n = 3;
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
