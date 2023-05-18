//EXERCISE 2 OF MATRIXES ADVANCE DATA STRUCTURES
//Exercise 2: Write a program that takes a 2D matrix of size N x N as input and rotates it 90 degrees clockwise in place.


//Example input:
//Matrix: Example output:
//1 2 3                     7 4 1
//4 5 6                     8 5 2
//7 8 9                     9 6 3

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Square matrix rows(cols) = ");
        int n = int.Parse(Console.ReadLine());


        int[,] matrix = new int[n, n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i, j] = int.Parse(Console.ReadLine());
            }
        }

        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < i; ++j)
            {
                int temp = matrix[i, j];
                matrix[i, j] = matrix[j, i];
                matrix[j, i] = temp;
            }
        }

        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n / 2; ++j)
            {
                int temp = matrix[i, j];
                matrix[i, j] = matrix[i, n - j - 1];
                matrix[i, n - j - 1] = temp;
            }
        }





        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                Console.Write(string.Format("{0} ", matrix[i, j]));
            }
            Console.Write(Environment.NewLine + Environment.NewLine);
        }

    }
}

