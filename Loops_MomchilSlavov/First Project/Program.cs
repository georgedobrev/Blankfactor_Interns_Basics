/*
 * Java Program to Print 1 to 15 Numbers using For Loop
 */

public class For_Loop
{
    public static void main(String[] args)
    {
        int n = 15;
        for (int i = 1; i <= 15; i++)
        {
            if( n % 3 == 0 && n % 5 == 0)
            {
                Console.WriteLine("FizzBuzz");
            }
            //System.out.println(i);
            else if ( n % 3 == 0)
                Console.WriteLine("Fizz");
            else if (n % 5 == 0)
                Console.WriteLine("Buzz");
        }
    }
}




public class For_Loop
{
    public static void main(String[] args)
    {
        int num = 121;
int reversedNum = 0, remainder;


int originalNum = num;

while(num !=0)
{
    remainder = num % 10;
    reversedNum = reversedNum * 10 + remainder;
    num /= 10;
}
if (originalNum == reversedNum) {
Console.WriteLine (originalNum + " is a palindrome.");
}
else {
    Console.WriteLine (originalNum + " is not a palindrome.");
}





class Program
        static String MergeStrings(String word1, string word2)

string merged = "";
    int len1 = word1.Lenght;
    int len2 = word2.Lenght;
    int i = 0;
    int j = 0;

    while (i < len1 && j < len2);

