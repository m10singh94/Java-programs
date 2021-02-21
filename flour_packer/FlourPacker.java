public class FlourPacker
{
    public static void main(String[] args) 
    {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if((bigCount < 0) || (smallCount < 0) || (goal < 0))
            return false;
        int i, sum = 0;
        if(bigCount != 0)
        {
            for(i = 1; i <= bigCount; i++)
            {
                sum += 5;
                if(sum > goal)
                    break;
            }
            if(sum > goal)
            sum -= 5;
        }
        if(smallCount != 0)
        {
            for(i = 1; i <= smallCount; i++)
            {
                sum += 1;
                if(sum > goal)
                    break;
            }
            if(sum > goal)
                sum -= 1;
        }
        if(sum == goal)
            return true;
        else
            return false;
    }
}