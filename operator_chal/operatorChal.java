public class operatorChal
{
    public static void main(String[] args)
    {
        double a = 20.00d, b = 80.00d;
        double calc = (a + b) * 100.00d;
        double remainder = calc % 40.00d;
        boolean ans = (remainder == 0) ? true : false;
        System.out.println("Boolean value = " + ans);
        if(!ans)
        {
            System.out.println("Got some remainder!");
        }
    }
}
