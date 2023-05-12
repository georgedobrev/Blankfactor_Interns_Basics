namespace Task2;
class Program
{
    static void Main(string[] args)
    {
        const int insertIndex = 4;
        const int removeIndex = 3;
        const string insertNumber = "+359 83 74 84 84";

        var phoneBook = new PhoneBook();

        for (int i = 0; i < 6; i++)
        {
            phoneBook.AddNumber($"+359 {i * 100} {i * 200} {i * 300} {i * 400}");
        }

        phoneBook.InsertNumberAtIndex(insertIndex, insertNumber);

        Console.WriteLine(new string('-', 100));
        Console.WriteLine(phoneBook.ToString());
        Console.WriteLine(new string('-', 100));

        phoneBook.RemoveNumberAtIndex(removeIndex);

        Console.WriteLine(phoneBook.ToString());
        Console.WriteLine(new string('-', 100));
    }
}

