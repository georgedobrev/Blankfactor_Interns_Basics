public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix1= { { 3, 2, 1 },
                { 9, 11, 5 },
                { 6, 0, 13 }};

        int[][] matrix2= { { 3, 2, 1 },
                { 9, 11, 5 },
                { 6, 0, 13 }};

        int res[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = matrix1[i][j] +matrix2[i][j] ;
            }
        }

        for (int i = 0; i < res.length; i++){
            System.out.println("");

            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");


            }}
    }
}
