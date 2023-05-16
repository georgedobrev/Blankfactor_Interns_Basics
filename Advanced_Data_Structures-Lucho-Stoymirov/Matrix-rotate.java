import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the matrix");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];


        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.println("Enter value for matrix row " + i + " column " + j );
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Starting Matrix");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Rotated Matrix");
        for(int i = 0; i < size; i++){
            for(int j = size - 1; j >= 0; j--){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}