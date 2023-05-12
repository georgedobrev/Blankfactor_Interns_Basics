using System;
using System.Runtime.CompilerServices;

namespace SwapIndex
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Swap Index1:");
            int indexOne =int.Parse(Console.ReadLine());
            Console.Write("Swap Index2:");
            int indexTwo = int.Parse(Console.ReadLine());
            List<string> list = new List<string>();
            list.Add("georgi");
            list.Add("ivan");
            list.Add("pesho");
            list.Add("dido");
            list.Add("pavka");
            Swap(list, indexOne , indexTwo);
            for (int i = 0; i < list.Count; i++) 
            {
                Console.WriteLine(list[i]);
            }
        }


        public static void Swap<T>(List<T> list, int indexOne, int indexTwo)
        {
            T temp = list[indexOne];
            list[indexOne] = list[indexTwo];
            list[indexTwo] = temp;
        }
    }
}