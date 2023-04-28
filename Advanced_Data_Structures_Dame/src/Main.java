import java.util.HashMap;
import java.util.Map;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] names = {"Dame", "John", "Dame", "Martin", "Martin", "Peter", "Anna", "Martin"};
        MapExerciseWithNames mapNames = new MapExerciseWithNames();
        mapNames.checkNumberOfNames(names);

        MatrixSum sumMatrix = new MatrixSum();
//        int[][] firstMatrix = sumMatrix.getMatrixDataFromUser();
//        int[][] secondMatrix = sumMatrix.getMatrixDataFromUser();
//
//        int[][] newMatrix = sumMatrix.FindSumOfTwoMatrix(firstMatrix, secondMatrix);
//        sumMatrix.printMatrix(newMatrix);

        MatrixRotation rotate = new MatrixRotation();
        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotate.rotateMatrix(matrix);
        sumMatrix.printMatrix(rotatedMatrix);
    }
}