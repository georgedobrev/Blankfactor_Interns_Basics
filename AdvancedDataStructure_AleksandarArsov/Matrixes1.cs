//MATRIXES EXERCISE 1 OF ADVANCED DATA STRUCTURES

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the number of rows for the matrix: ");
        int rows = int.Parse(Console.ReadLine());
        Console.Write("Enter the number of rows for the matrix: ");
        int cols = int.Parse(Console.ReadLine());


        int[,] matrix1 = new int[rows, cols];
        int[,] matrix2 = new int[rows, cols];
        int[,] matrix3 = new int[rows, cols];

        Console.WriteLine("Input elements into first matrix\n");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix1[i, j] = int.Parse(Console.ReadLine());
            }
        }

        Console.WriteLine("Input elements into second matrix\n");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix2[i, j] = int.Parse(Console.ReadLine());
            }
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix3[i, j] = matrix1[i, j] + matrix2[i, j];
            }
        }

        Console.WriteLine("\nSum of the two matrix: \n");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                Console.Write(string.Format("{0} ", matrix3[i, j]));
            }
            Console.Write(Environment.NewLine + Environment.NewLine);

        }

    }
}
