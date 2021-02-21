// perfect number is a number sum of whose proper divisors(excluding the number itself) is equal to the number itself.
// eg : 6 -> 1,2,3 (not 6) => 1+2+3 = 6 Hence, 6 is a perfect number.
public class PerfectNumber
{
    public static void main(String[] args) 
    {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number)
    {
        int sum =0;
        if(number < 1)
            return false;
        for(int i = 1; i < number; i++)
        {
            if(number % i == 0)
                sum += i;
        }
        if(sum == number)
            return true;
        else 
            return false;
    }
}