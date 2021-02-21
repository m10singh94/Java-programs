// to convert feet and inches to cm
public class FeetAndInchesToCm
{
    public static void main(String[] args) 
    {
        System.out.println(calcFeetAndInchesToCentimeters(5, 2));
        System.out.println(calcFeetAndInchesToCentimeters(75));        
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) 
    {
        if(feet < 0 || (inches < 0) || (inches > 12))
            return -1;
        return ((feet * 12d * 2.54d) + (inches * 2.54d));
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches < 0)
            return -1;
        double feet = (int)inches / 12;
        inches = (int)inches % 12; 
        System.out.println(feet + " " + inches);
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}