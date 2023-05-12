using System;
namespace OOP_Objects_Classes
{
    public class GenericList
    {
        public static void Swap<T>(List<T> list, int index1, int index2)
        {
            var temp = list[index1];
            list[index1] = list[index2];
            list[index2] = temp;
        }
    }
}

