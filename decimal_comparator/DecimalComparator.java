public class DecimalComparator
{
    public static void main(String[] args) 
    {
        areEqualByThreeDecimalPlaces(3.5675, 3.5672);
    }
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) 
    {
        if((long)(d1 * 1000d) == (long)(d2 * 1000d))
        {
            System.out.println("Equals");
            return true;
        }
        else return false;
    }
}