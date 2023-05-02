using System;
using System.Collections;
using System.Linq;
using CSharp_Tasks;

// Join two strings zipper style
Console.WriteLine(JoinStrs.JoinStringsM("abc", "rtqwwe"));

// Palindrome
Console.WriteLine(Palindrome.PalindromeM("racecar"));
Console.WriteLine(Palindrome.Palindrome2M(121));

// Fizz Buzz
Array.ForEach(FizzBuzz.FizzBuzzM(15), Console.WriteLine);

// Check the sum
Console.WriteLine(CheckSum.CheckSumM("abc", "cba", "cdb"));
