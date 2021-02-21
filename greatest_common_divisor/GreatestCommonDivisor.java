public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(12, 15));
        System.out.println(getGreatestCommonDivisor(12, 20));
        System.out.println(getGreatestCommonDivisor(12, 24));
        System.out.println(getGreatestCommonDivisor(3, 15));
        System.out.println(getGreatestCommonDivisor(456, 789));
        System.out.println(getGreatestCommonDivisor(100, 123));
    }
    public static int getGreatestCommonDivisor(int a, int b)
    {
        int i = 2, gcf = 1;
        if((a < 10) || (b < 10))
            return -1;
        while((i <= a) && (i <= b))
        {
            if((a % i == 0) && (b % i == 0))
                gcf = i;
            i++;
        }
        return gcf;
    }
}