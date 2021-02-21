// to print patterns like
// *****                ********            **********
// ** **                **    **            **      **
// * * *                * *  * *            * *    * *
// ** **                *  **  *            *  *  *  *
// *****                *  **  *            *   **   *
//                      * *  * *            *   **   *
//                      **    **            *  *  *  *
//                      ********            * *    * *
//                                          **      **
//                                          **********
public class DiagonalStar
{
    public static void main(String[] args) 
    {
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(3);
        printSquareStar(10);
    }
    public static void printSquareStar(int number)
    {
        if(number < 5)
            System.out.println("Invalid Value");
        else
        {
                for(int r = 0; r < number; r++)
            {
                for(int c = 0; c < number; c++)
                {
                    if((r == 0) || (r == (number - 1)) || (c == 0) || (c == (number - 1)))
                    {
                        System.out.print("*");
                        continue;
                    }
                    if(r == c)
                    {
                        System.out.print("*");
                        continue;
                    }   
                    if(c == (number - r - 1))
                    {
                        System.out.print("*");
                        continue;
                    }
                    else 
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}