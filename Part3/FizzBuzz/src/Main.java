public class Main
{
    private static void FizzBuzz()
    {
        for (int n = 1; n <= 100; n++)
        {
            if ((n % 3) != 0 && (n % 5) != 0)
            {
                System.out.println(n);
            }
            else
            {
                PrintFizzBuzz(n);
            }
        }
    }

    private static void PrintFizzBuzz(int n)
    {
        if ((n % 3) == 0)
        {
            System.out.print("Fizz");
        }

        if ((n % 5) == 0)
        {
            System.out.print("Buzz");
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        FizzBuzz();
    }
}
