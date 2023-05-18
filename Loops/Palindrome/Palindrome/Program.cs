class Program
{
    static bool IsPalindrome(int x)
    {
        
        string str_x = x.ToString();
        
        char[] charArray = str_x.ToCharArray();
        //Array.Reverse(charArray);
        //string reversed_str_x = new string(charArray);
        string reverse = String.Empty
        for(int i = charArray.Length - 1 ; i >= 0 ; i--)
            {
                reverse = charArray[i];
            }

        if (str_x == reversed_str_x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void Main(string[] args)
    {
        int x = 122;
        bool result = IsPalindrome(x);
        Console.WriteLine(result);
    }
}

