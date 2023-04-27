
int n = 15;

List<string> listFuzzBuzz = new List<string>();

for (int i = 1; i <= n; i++)
{
	if (i % 3 == 0 && i % 5 == 0)
	{

		listFuzzBuzz.Add("FizzBuzz");

	}

	else if (i % 3 == 0)
	{
        listFuzzBuzz.Add("Fizz");
	}

    else if (i % 5 == 0)
    {
        listFuzzBuzz.Add("Buzz");
    }

	else
	{
		string num = i.ToString();
        listFuzzBuzz.Add(num);
    }

	
	
};

for (int i = 0; i < listFuzzBuzz.Count; i++)
{
	Console.Write(listFuzzBuzz[i] + ", ");
}