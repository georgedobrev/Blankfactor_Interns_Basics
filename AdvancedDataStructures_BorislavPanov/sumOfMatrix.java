public class sumOfMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3}, {4,5,6}};
        int[][] matrix2 = {{7,8,9}, {10,11,12}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
