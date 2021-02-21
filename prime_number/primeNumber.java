public class primeNumber
{
    public static void main(String[] args) 
    {
        int count = 0;
        for(int i = 23; i <= 255; i++)
        {
            if(isPrime(i))
                count++;
        }
        System.out.println("Number of prime numbers between 23 and 255 are - " + count);
    }
    public static boolean isPrime(int num) 
    {
        if(num == 1)
            return false;
        for(int i = 2; i < num/2; i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}