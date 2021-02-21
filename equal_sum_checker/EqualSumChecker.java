public class EqualSumChecker
{
    public static void main(String[] args) 
    {
        hasEqualSum(4, 5, 10);
    }
    public static boolean hasEqualSum(int num1, int num2, int sum) 
    {
        if((num1 + num2) == sum)
        {
            System.out.println("Equal");
            return true;
        }
        else return false;
    }
}