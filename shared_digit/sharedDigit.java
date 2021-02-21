public class sharedDigit
{
    public static void main(String[] args) 
    {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(10, 20));
        System.out.println(hasSharedDigit(12, 45));
        System.out.println(hasSharedDigit(100, 23));
        System.out.println(hasSharedDigit(46, 60));
    }
    public static boolean hasSharedDigit(int num1, int num2)
    {
        if((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2) > 99)
            return false;
        if(((num1 % 10) == (num2 % 10)) || ((num1 % 10) == (num2 / 10)) || 
        ((num1 / 10) == (num2 % 10)) || ((num1 / 10) == (num2 / 10)))
            return true;
        else 
            return false;
    }
}