public class LeapYear
{
    public static void main(String[] args) 
    {
        System.out.println(isLeapYear(9000));
    }
    public static boolean isLeapYear(int year) 
    {
        if(year < 1 || year > 9999)
            return false;
        else 
        {
            if(year % 4 == 0)
            {
                if(year % 100 == 0)
                {
                    if(year % 400 == 0)
                    {
                        System.out.println("leap Year");
                        return true;
                    }
                }
                else 
                {
                    System.out.println("leap Year");
                    return true;
                }
            }
        }
        return false;
    }
}