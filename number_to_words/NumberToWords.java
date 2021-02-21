public class NumberToWords
{
    public static void main(String[] args) 
    {
        System.out.println(reverse(-123)); 
        System.out.println(getDigitCount(-123));  
        numberToWords(100);
    }
    public static int getDigitCount(int number)
    {
        int count = 0;
        if(number < 0)
            return -1;
        if(number == 0)
            return 1;
        while(number >= 1)
        {
            count++;
            number /= 10;
        }
        return count;
    }
    public static int reverse(int number)
    {
        int new_number = 0, flag = 0;
        if(number < 0)
        {
            number *= -1;
            flag = 1;
        }
        while(number >= 1)
        {
            new_number = (new_number * 10) + (number % 10);
            number /= 10;
        }
        if(flag == 1)
            return new_number*-1;
        else return new_number;
    }
    public static void numberToWords(int number)
    {
        int digit, count = 0, originalCount;
        if(number < 0)
            System.out.println("Invalid Value");
        int new_number = reverse(number);
        originalCount = getDigitCount(number);
        while(new_number >= 1)
        {
            digit = new_number % 10;
            switch(digit)
            {
                case 0 : System.out.println("Zero");
                            break;
                case 1 : System.out.println("One");
                            break;
                case 2 : System.out.println("Two");
                            break;
                case 3 : System.out.println("Three");
                            break;
                case 4 : System.out.println("Four");
                            break;
                case 5 : System.out.println("Five");
                            break;
                case 6 : System.out.println("Six");
                            break;
                case 7 : System.out.println("Seven");
                            break;
                case 8 : System.out.println("Eight");
                            break;
                case 9 : System.out.println("Nine");
                            break;
            }
            new_number /= 10;
            count++;
        }
        if(count != originalCount)
        {
            for(int i = count; i < originalCount; i++)
                System.out.println("Zero");
        }
    }
}