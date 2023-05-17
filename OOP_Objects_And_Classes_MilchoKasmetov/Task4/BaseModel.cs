namespace Task4
{
    public abstract class BaseModel
    {
        protected BaseModel(string name)
        {
            this.Name = name;
        }

        public string Name { get; set; }
    }
}