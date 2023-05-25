
int n = 15;

List<string> listFizzBuzz = new List<string>();

for (int i = 1; i <= n; i++)
{
	if (i % 3 == 0 && i % 5 == 0)
	{

		listFizzBuzz.Add("FizzBuzz");

	}

	else if (i % 3 == 0)
	{
        listFizzBuzz.Add("Fizz");
	}

    else if (i % 5 == 0)
    {
        listFizzBuzz.Add("Buzz");
    }

	else
	{
		string num = i.ToString();
        listFizzBuzz.Add(num);
    }

	
	
};

for (int i = 0; i < listFizzBuzz.Count; i++)
{
	Console.Write(listFizzBuzz[i] + ", ");
}