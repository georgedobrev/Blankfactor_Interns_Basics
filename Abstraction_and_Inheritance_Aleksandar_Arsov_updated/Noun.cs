using System;
namespace Abstraction_and_Inheritance
{
	public class Noun : Words
	{
        public string Plural { get; set; }
        public override void DisplayWordInfo()
        {
            Console.WriteLine(English);
            Console.WriteLine(Bulgarian);
            Console.WriteLine(Plural);
        }
    }
}

