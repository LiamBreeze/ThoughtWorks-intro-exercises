import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        ArrayList<Integer> primeFactors = generate(n);

        for (int primeFactor : primeFactors)
        {
            System.out.println(primeFactor);
        }
    }

    private static ArrayList<Integer> generate(int n)
    {
        Boolean[] isPrime = new Boolean[n + 1];

        for (int index = 1; index <= n; index++)
        {
            isPrime[index] = true;
        }

        for (int factor = 2; (factor * factor) <= n; factor++)
        {
            if (isPrime[factor])
            {
                for (int stepSize = 2; (factor * stepSize) <= n; stepSize++)
                {
                    isPrime[factor * stepSize] = false;
                }
            }
        }


        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        for (int index = 2; index <= n; index++)
        {
            if (isPrime[index] && ((n % index) == 0))
            {
                primeFactors.add(index);
            }
        }

        return primeFactors;
    }
}
