
namespace _2dMatrixRotator
{
    public class Program
    {
        public static void Main(string[] args)
        {
            while (true)
            {
                try
                {
                    Console.WriteLine("Input size, please(one number ONLY, please !)");
                    int inputPar = int.Parse(Console.ReadLine());

                    Console.WriteLine("First matrix input, please");

                    var matrixOne = SumOfTwoMatrixes.Program.MakeMatrix(inputPar, inputPar);

                    var resultMatrix = RotateTwoMatrixes(matrixOne);

                    Console.WriteLine(SumOfTwoMatrixes.Program.PrintResultMatrix(resultMatrix));
                }
                catch (Exception e)
                {
                    Console.WriteLine($"Input ERROR TRY AGAIN :( !!!!! {e.Message}");
                }
            }
        }

        public static int[,] RotateTwoMatrixes(int[,] matrixOne)
        {
            for (int i = 0; i < matrixOne.GetLength(0); i++)
            {
                for (int j = i; j < matrixOne.GetLength(0); j++)
                {
                    int temp = matrixOne[i, j];
                    matrixOne[i, j] = matrixOne[j, i];
                    matrixOne[j, i] = temp;
                }
            }


            for (int i = 0; i < matrixOne.GetLength(0); i++)
            {
                for (int j = 0; j < matrixOne.GetLength(0) / 2; j++)
                {
                    int temp = matrixOne[i, j];
                    matrixOne[i, j] = matrixOne[i, matrixOne.GetLength(0) - 1 - j];
                    matrixOne[i, matrixOne.GetLength(0) - 1 - j] = temp;
                }

            }
                return matrixOne;
        }
    }
}