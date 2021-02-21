// to test encapsulation with Printer class (Printer.java)
public class PrinterMain
{
    public static void main(String[] args) 
    {
        // Printer printer = new Printer(45, 0, true);
        // printer.updateTonerLevel(65);
        // System.out.println(printer.getNoOfPagesPrinted(25));
        Printer printer = new Printer(45, 45, false);
        System.out.println(printer.getNoOfPagesPrinted(2));
        printer.updateTonerLevel(10);
    }
}