using System.Text;
using System.Threading.Channels;

namespace SumOfTwoMatrixes
{
    public class Program
    {
        public static void Main(string[] args)
        {
            // input size with space
            while (true)
            {
                try
                {
                    Console.WriteLine("Input size please  first input rows then input collums (space between rows and collums, please !)");
                    int[] inputPar = Console.ReadLine().Split().Select(int.Parse).ToArray();

                    Console.WriteLine("First matrix input, please");

                    var matrixOne = MakeMatrix(inputPar[0], inputPar[1]);

                    Console.WriteLine("Secound matrix input, please");

                    var matrixTwo = MakeMatrix(inputPar[0], inputPar[1]);

                    var resultMatrix = SumTwoEqualSizeMatrix(matrixOne, matrixTwo);

                    Console.WriteLine(PrintResultMatrix(resultMatrix));
                }
                catch (Exception e)
                {
                    Console.WriteLine($"Input ERROR TRY AGAIN :( !!!!! {e.Message}");
                }

            }

        }

        public static int[,] MakeMatrix(int row, int col)
        {
            int[,] matrix = new int[row, col];

            Console.WriteLine("Creating Matrix .....");

            for (int inputRow = 0; inputRow < row; inputRow++)
            {

                string[] inputNumber = Console.ReadLine().Split();

                if (inputNumber.Length > row)
                {
                    throw new IndexOutOfRangeException();
                }

                for (int inputCol = 0; inputCol < col; inputCol++)
                {
                    matrix[inputRow, inputCol] = int.Parse(inputNumber[inputCol]);
                }

            }
            Console.WriteLine("Matrix Created");
            return matrix;
        }

        public static int[,] SumTwoEqualSizeMatrix(int[,] matrixOne, int[,] matrixTwo)
        {
            int[,] resultMatrix = new int[matrixOne.GetLength(0), matrixOne.GetLength(1)];

            for (int i = 0; i < matrixOne.GetLength(0); i++)
            {
                for (int j = 0; j < matrixOne.GetLength(1); j++)
                {
                    resultMatrix[i, j] = matrixOne[i, j] + matrixTwo[i, j];
                }
            }

            return resultMatrix;
        }

        public static string PrintResultMatrix(int[,] matrix)
        {
            StringBuilder sb = new StringBuilder();

            sb.AppendLine("Result Matrix");

            for (int printRow = 0; printRow < matrix.GetLength(0); printRow++)
            {
                for (int printCol = 0; printCol < matrix.GetLength(1); printCol++)
                {
                    sb.Append($"{matrix[printRow, printCol]} ");
                }

                sb.AppendLine();
            }

            return sb.ToString().Trim();

        }
    }
}