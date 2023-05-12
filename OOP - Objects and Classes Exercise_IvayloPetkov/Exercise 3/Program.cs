using System;

namespace Application
{
    class Program
    {
        public static void SwapElements<T>(List<T> list, int index1, int index2)
        {
            T temp = list[index1];
            list[index1] = list[index2];
            list[index2] = temp;
        }

        static void Main(string[] args)
        {
            List<int> intList = new List<int> { 1, 2, 3, 4, 5 };
            SwapElements(intList, 1, 3);
            Console.WriteLine(string.Join(", ", intList));

            List<string> stringList = new List<string> { "apple", "banana", "cherry" };
            SwapElements(stringList, 0, 2);
            Console.WriteLine(string.Join(", ", stringList));
        }
    }
}