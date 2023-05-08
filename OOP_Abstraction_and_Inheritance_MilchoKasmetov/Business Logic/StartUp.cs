namespace Gym
{
    using Gym.Core;
    using Gym.Core.Contracts;
    public class StartUp
    {
        public static void Main()
        {
            IEngine engine = new Engine();
            engine.Run();
        }
    }
}
