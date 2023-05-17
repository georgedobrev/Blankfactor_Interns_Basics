namespace Task3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                try
                {
                    Console.WriteLine("Input List with whitespace separation");
                    var list = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries).ToList();

                    if (!list.Any())
                    {
                        throw new NullReferenceException();
                    }

                    Console.WriteLine("slap index one");
                    var index1 = int.Parse(Console.ReadLine());

                    if (index1 < 0 || index1 >= list.Count)
                    {
                        throw new IndexOutOfRangeException();
                    }

                    Console.WriteLine("slap index two");
                    var index2 = int.Parse(Console.ReadLine());

                    if (index2 < 0 || index2 >= list.Count)
                    {
                        throw new IndexOutOfRangeException();
                    }

                    Console.WriteLine(new string('-', 100));
                    Console.WriteLine("RESULT");

                    Swap(list, index1, index2);

                    Console.WriteLine(string.Join(", ", list));
                    Console.WriteLine(new string('-', 100));
                }
                catch (Exception e)
                {
                    Console.WriteLine($"ERROR TRY AGAIN :( {e.Message}");
                }
            }
        }
        public static void Swap<T>(List<T> list, int index1, int index2)
        {
            T temporary = list[index1];
            list[index1] = list[index2];
            list[index2] = temporary;
        }
    }
}