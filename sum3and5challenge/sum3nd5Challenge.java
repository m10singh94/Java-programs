public class sum3nd5Challenge
{
    public static void main(String[] args) 
    {
        int i, count = 0, sum = 0;
        for(i = 1; i < 1000; i++)
        {
            if((i % 3 == 0) && (i % 5 == 0))
            {
                count++;
                sum += i;
                System.out.println("Number " + count + " : " + i);
            }
            if(count == 5)
            {
                System.out.println("Sum = " + sum);
                break;
            }    
        }
    }
}