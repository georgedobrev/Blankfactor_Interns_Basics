using System;
namespace Abstraction_and_Inheritance
{
	public class Dictionary
	{
        private List<Words> words = new List<Words>();

        public void AddWord(Words word)
        {
            words.Add(word);
        }

        public void DisplayWords()
        {
            foreach (Words word in words)
            {
                word.DisplayWordInfo();
            }
        }
    }
}

