// to determine the number of hours, minutes and seconds from minutes and seconds
public class SecondsAndMinutes
{
    public static void main(String[] args) 
    {
        System.out.println(getDurationString(124, 40));
        System.out.println(getDurationString(1256));
    }
    public static String getDurationString(long minutes, long seconds) 
    {
        if((minutes < 0) || (seconds < 0) || (seconds > 59))
            return "Invalid Value";
        long hours = minutes / 60;
        minutes %= 60;
        return hours + " h " + minutes +" m " + seconds + " s";
    }
    public static String getDurationString(long seconds)
    {
        if(seconds < 0)
            return "Invalid Vaue";
        long minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }   
}