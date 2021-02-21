import java.util.Scanner;

// to sort an array in descending order
public class SortArray
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to enter : ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        scanner.nextLine();
        
        getIntegers(array, count);
        sortArray(array);
        System.out.println("Sorted array ->");
        printIntegers(array);
        
        scanner.close();
    }
    public static int[] getIntegers(int[] array, int count)
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers for sorting : ");
        for(int i = 0; i < count;)
        {
            num = i + 1;
            System.out.print("Number #"+ num + " : ");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt)
            {
                array[i] = scanner.nextInt();
                i++;
            }
            else
                System.out.println("invalid output.");
        }
        scanner.close();
        return array;
    }
    public static void printIntegers(int[] array)
    {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
    }
    public static void sortArray(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
            for(int j = 0; j < (array.length - i -1); j++)
            {
                int temp;
                if(array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
    }
}