using System;
namespace Abstraction_and_Inheritance
{
	public class Verb : Words
	{
        public string Infinitive { get; set; }
        public override void DisplayWordInfo()
        {
            Console.WriteLine(English);
            Console.WriteLine(Bulgarian);
            Console.WriteLine(Infinitive);
        }
    }
}

