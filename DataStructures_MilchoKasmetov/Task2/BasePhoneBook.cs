using System;
using System.Text;

namespace Task2
{
    public abstract class BasePhoneBook
    {
        private List<string> phoneBook;

        protected BasePhoneBook()
        {
            this.phoneBook = new List<string>();
        }

        public void AddNumber(string number)
        {
            this.phoneBook.Add(number);
        }

        public void RemoveNumber(string number)
        {
            this.phoneBook.Remove(number);
        }

        public void RemoveNumberAtIndex(int index)
        {
            this.phoneBook.RemoveAt(index);
        }

        public void InsertNumberAtIndex(int index, string number)
        {
            this.phoneBook.Insert(index, number);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            this.phoneBook.ForEach(x => sb.AppendLine(x));

            return sb.ToString();
        }
    }
}

