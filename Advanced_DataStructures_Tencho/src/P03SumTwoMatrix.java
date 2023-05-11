public class P03SumTwoMatrix {
    public static void main(String[] args) {
        int[][]matrixA = {{1,2,3},
                {4,5,6}};
        int[][]matrixB = {{7,8,9},
                {10,11,12}};
        sumMatrix(matrixA, matrixB);
    }
    private static int[][] sumMatrix(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return sumMatrix;
    }
}
