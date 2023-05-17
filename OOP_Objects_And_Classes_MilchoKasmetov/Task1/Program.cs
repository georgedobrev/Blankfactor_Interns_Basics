namespace Task1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                try
                {
                    Console.WriteLine("Input date one,please -> mm.dd.yyyy or mm/dd/yyyy");
                    var dateOne = Console.ReadLine();

                    Console.WriteLine("Input date two,please -> mm.dd.yyyy or mm/dd/yyyy");
                    var dateTwo = Console.ReadLine();

                    Console.WriteLine("Difference in days is");
                    Console.WriteLine(DateModifier.CalcDiffDays(dateOne, dateTwo));

                }
                catch (Exception e)
                {
                    Console.WriteLine($"ERROOR IN INPUT :( {e.Message}");
                }

            }
        }
    }
}