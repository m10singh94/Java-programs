// testing encapsulation with PrinterMain.java
public class Printer
{
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex)
    {
        if(tonerLevel > 0 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void updateTonerLevel(int update)
    {
        this.tonerLevel += update;
        if(this.tonerLevel > 100)
        {
            this.tonerLevel = 100;
            System.out.println("Exceeded maximum capacity of the toner. Current Toner Level is set to : " + this.tonerLevel);
        }
        else
            System.out.println("Current Toner Level = " + tonerLevel);
    }
    public int getNoOfPagesPrinted(int countOfPages)
    {
        if(isDuplex == true)
        {
            this.pagesPrinted += (2 * countOfPages);
        }
        else
        {
            this.pagesPrinted += countOfPages;
        }
        return this.pagesPrinted;
    }

}