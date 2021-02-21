class EvenDigitSum
{
    public static void main(String[] args) 
    {
        System.out.println(getEvenDigitSum(1234));
        System.out.println(getEvenDigitSum(-125));
        System.out.println(getEvenDigitSum(123));
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(100));
        System.out.println(getEvenDigitSum(56428));
    }
    public static int getEvenDigitSum(int number)
    {
        int sum = 0;
        if(number < 0)
            return -1;
        while(number >= 1)
        {
            if((number % 10) % 2 == 0)
                sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}