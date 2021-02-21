import java.util.Scanner;

public class InputCalculator
{
    public static void main(String[] args) 
    {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while(true)
        {
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
            {
                sum += scanner.nextInt();
                count++;
            }
            else
            {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/count));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}