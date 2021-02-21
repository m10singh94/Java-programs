class sumDigits
{
    public static void main(String[] args) 
    {
        System.out.println(sumOfDigits(456));
        System.out.println(sumOfDigits(100));
        System.out.println(sumOfDigits(999));
        System.out.println(sumOfDigits(-45));
    }
    public static int sumOfDigits(int number)
    {
        if(number < 10)
            return -1;
        int num = number, sum = 0;
        while(num >= 1)
        {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}