using Gym.Core;
using Gym.Core.Contracts;

namespace OOP_Abstraction_and_Inheritance_MilchoKasmetov
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IEngine engine = new Engine();
            engine.Run();
        }
    }
}