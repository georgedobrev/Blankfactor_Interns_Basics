using DictionarysAndMatrix;

Console.WriteLine(MostCommonWord.FindMostCommonWord("The quick brown fox jumped over the lazy dog. The lazy dog slept all day."));

var dict = TargetSum.FindPairs(new int[] { 1, 2, 3, 4, 5 }, 7);
foreach (KeyValuePair<int, int> entry in dict)
{
    Console.WriteLine($"{entry.Key} {entry.Value}");
}

var arr = SumOfTwoMatrix.FindSum(new int[,] { { 1, 2, 3 }, { 3, 2, 1 } }, new int[,] { { 9, 8, 7 }, { 6, 5, 4 } });
for (int i = 0; i < arr.GetLength(0); i++)
{
    for (int j = 0; j < arr.GetLength(1); j++)
    {
        Console.Write(arr[i, j] + ", ");
    }
    Console.WriteLine();
}

var arr2 = RotateMatrix.Rotate(new int[,] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
for (int i = 0; i < arr2.GetLength(0); i++)
{
    for (int j = 0; j < arr2.GetLength(1); j++)
    {
        Console.Write(arr2[i, j] + " ");
    }
    Console.WriteLine();
}