//package BarkingDog;

// udemy challenge Exercise 3
public class BarkingDog
{
    public static void main(String[] args) 
    {
        shouldWakeUp(true, 1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) 
    {
        if(hourOfDay < 0 || hourOfDay > 23)
            return false;
        else if(barking == true && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)))
            {
                System.out.println("Wake Up");
                return true;
            }
        else return false;
    }
}