
class Arrayofintegers
{
    static void Main(string[] args)
    {
        int target;
        target = Int.Parse(Console.ReadLine());
        Console.WriteLine("Input the desired integer number: ");

        int[] numbers = { 1, 2, 3, 4, 5 };

        Dictionary<int> dictionary = new Dictionary<int>();

        foreach (int number in numbers)
        {
            int difference = target - number;

            if (set.Contains(difference))
            {
                Console.WriteLine($"The {difference}, is {number}");
            }
            set.Add(number);
        }
    }
}
