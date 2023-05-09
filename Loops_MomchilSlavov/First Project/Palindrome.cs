/*
 * C# Program aimed at checking whether a certain number is a palindrome or not via a for loop
 */

public class ForLoop
{

    public static void main(String[] args)
    {

        int num = 121;

        int reversedNum = 0, remainder;


        int originalNum = num;

        while (num != 0)

        {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum)

        {
            Console.WriteLine(originalNum + " is a palindrome.");
        }

        else

        {
            Console.WriteLine(originalNum + " is not a palindrome.");
        }
    }
}