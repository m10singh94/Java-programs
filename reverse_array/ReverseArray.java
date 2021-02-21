import java.util.Arrays;

// reverse an array
public class ReverseArray
{   
    public static void main(String[] args) 
    {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed array -> " + Arrays.toString(array));
    }
    public static void reverseArray(int[] array)
    {
        
        int j = array.length - 1;
        for(int i = 0; i < (array.length / 2); i++)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
    }
}