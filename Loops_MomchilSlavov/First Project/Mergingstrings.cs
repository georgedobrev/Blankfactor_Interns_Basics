public class Mergingstrings
{

    public static string JoinStringsM(string str1, string str2)
    {

        string res = "";
        int diffInLenght = Math.Abs(str1.Length - str2.Length);


        for (int i = 0; i < (str1.Length > str2.Length ? str2.Length : str1.Length); i++)

        {
            res += str1[i];
            res += str2[i];
        }

        if (str2.Length < str1.Length)

        {
            res += str1.Substring(str1.Length - diffInLenght);
        }

        else if (str1.Length < str2.Length)

        {
            res += str2.Substring(str2.Length - diffInLenght);
        }

        return res;
    }

}