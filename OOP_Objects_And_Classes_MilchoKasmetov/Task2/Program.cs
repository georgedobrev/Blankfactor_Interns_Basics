namespace Task2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                try
                {
                    Console.WriteLine("Insert number of the family");
                    var n = int.Parse(Console.ReadLine());

                    if( n < 0 || n == 0)
                    {
                        throw new ArgumentOutOfRangeException();
                    }

                    var family = new Family();

                    for (int i = 0; i < n; i++)
                    {
                        Console.WriteLine("Input Name of the family member");
                        var name = Console.ReadLine().Trim();

                        if (string.IsNullOrEmpty(name) || string.IsNullOrWhiteSpace(name))
                        {
                            throw new ArgumentNullException();
                        }

                        Console.WriteLine($"Input {name} Age");
                        var age = int.Parse(Console.ReadLine().Trim());

                        if(age < 0 || age == 0)
                        {
                            throw new ArgumentOutOfRangeException();
                        }

                        Console.WriteLine($"Adding {name} to the familly");

                        family.AddMember(new Person(name, age));
                    }

                    var oldestPerson = family.GetOldestMember();

                    Console.WriteLine(new string('-',100));
                    Console.WriteLine($"The oldest person in the family is {oldestPerson.Name} and its {oldestPerson.Age} years old.");
                    Console.WriteLine(new string('-', 100));
                }
                catch (Exception e)
                {

                    Console.WriteLine($"ERROR TRY AGAIN !!! {e.Message}");
                }
               
            }
        }
    }
}