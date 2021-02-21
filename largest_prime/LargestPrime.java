public class LargestPrime
{
    public static void main(String[] args) 
    {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }
    public static int getLargestPrime(int number)
    {
        int largestFactor = 1;
        if((number <= 0) || (number == 1))
            return -1;
        for(int i = 2; i <= number; i++)
        {
            if((number % i) == 0)
            {
                int x;
                for(x = 2; x <= Math.sqrt(i); x++)
                {
                    if((i % x) == 0)
                        break;
                }
                if(x > Math.sqrt(i))
                    largestFactor = i;
            }
        }
        return largestFactor;
    }
}