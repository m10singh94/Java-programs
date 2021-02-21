public class FirstLastDigitSum
{
    public static void main(String[] args) 
    {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(465));
   }
    public static int sumFirstAndLastDigit(int number)
    {
        int sum = 0;
        if(number < 0)
            return -1;
        if(number == 0)
            return 0;
        sum += number % 10;
        while(number >= 10)
        {
            number /= 10;
        }
        sum += number;
        return sum;
    }
}