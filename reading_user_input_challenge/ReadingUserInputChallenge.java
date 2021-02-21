import java.util.Scanner;

public class ReadingUserInputChallenge
{
    public static void main(String[] args) 
    {
        System.out.println("Enter 10 numbers ->");
        boolean hasNextInt;
        int count = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(count <= 10)
        {
            System.out.print("Enter number #" + count +" : ");
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt == true)
            {
                sum += scanner.nextInt();
                count++;
            }
            else
                System.out.println("Invalid Value");
            scanner.nextLine();
        }
        System.out.println("Sum of entered numbers is " + sum);
        scanner.close();
    }
}