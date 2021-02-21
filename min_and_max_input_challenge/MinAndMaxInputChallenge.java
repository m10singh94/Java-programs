import java.util.Scanner;

public class MinAndMaxInputChallenge
{
    public static void main(String[] args) 
    {
        int min = 0, max = 0, number;
        boolean first_number = true;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
            {
                number = scanner.nextInt();
                if(first_number)
                {
                    first_number = false;
                    min = max= number;
                }
                if(number < min)
                    min = number;
                if(number > max)
                    max = number;                    
            }
            else
            {
                System.out.println("Invlaid Input");
                System.out.println("Min = " + min + "   Max = " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}