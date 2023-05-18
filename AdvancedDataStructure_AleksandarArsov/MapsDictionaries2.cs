// EXERCISE 2 OF DICTIONARY/HASMAP ADVANCED DATA STRUCTURES
//Write a program that takes an array of integers and a target integer, and outputs all pairs of numbers in the array that sum to the target.

//Example input: [1, 2, 3, 4, 5], 7
//Example output: (2, 5), (3, 4)

class Program
{
    static void Main(string[] args)
    {
        int target;
        Console.WriteLine("Enter target integer: ");
        target = Int32.Parse(Console.ReadLine());

        int[] numbers = { 1, 2, 3, 4, 5 };
        HashSet<int> set = new HashSet<int>();

        foreach (int number in numbers)
        {
            int difference = target - number;

            if (set.Contains(difference))
            {
                Console.WriteLine($"{difference}, {number}");
            }
            set.Add(number);
        }
    }



}

