public class SumOfTwoMatrix {
    public static int[][] findSum(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] sum = SumOfTwoMatrix.findSum(arr1, arr2);
        for (int[] row : sum) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}





