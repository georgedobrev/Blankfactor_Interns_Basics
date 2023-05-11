public class MatrixRotation {
    public int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] newMatrix = new int[rows][columns];

        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < columns; j++) {
                newMatrix[j][i] = matrix[Math.abs(columns - 1 - i)][j];
            }
        }
        return newMatrix;
    }
}
