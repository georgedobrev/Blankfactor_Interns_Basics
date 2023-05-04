using DataStructures;
Console.WriteLine("answ" + Printer.PrintTasks(new int[] { 0, 1, 1, 1 }, new int[] { 1, 0, 0, 1 }));


// Phones
var phones = new List<string>(new string[] { "+123 43 23 65 88", "+993 55 23 69 81", "+691 87 34 69 81", "+223 55 23 66 09", "+355 16 74 22 89", "+098 27 09 33 33" });

phones.Insert(3, "+359 83 74 84 84");
phones.ForEach((str) => Console.WriteLine(str));
phones.RemoveAt(2);
Console.WriteLine("------------------");
phones.ForEach((str) => Console.WriteLine(str));