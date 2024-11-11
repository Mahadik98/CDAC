using System;

class test
{
    static void Main()
    {
        // Correct array with 1 to 10
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        foreach (int num in numbers)
        {
            Console.WriteLine(num); // This should print 1 to 10
        }
    }
}