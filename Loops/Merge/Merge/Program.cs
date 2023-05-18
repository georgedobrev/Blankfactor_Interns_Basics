class Program
{
    static void Main(string[] args)
    {
        string word1 = "abc";
        string word2 = "pqr";
        string merged = MergeStrings(word1, word2);
        Console.WriteLine(merged);
    }

static string MergeStrings(string word1, string word2)
    {
        string merged = "";
        int len1 = word1.Length;
        int len2 = word2.Length;
        int i = 0;
        int j = 0;


        while (i < len1 && j < len2)
        {
            merged += word1[i++].ToString() + word2[j++].ToString();
        }


        while (i < len1)
        {
            merged += word1[i++];
        }


        while (j < len2)
        {
            merged += word2[j++];
        }

        return merged;
    }
}


