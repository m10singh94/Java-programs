//package bank;
public class BankMain
{
    public static void main(String[] args) 
    {
        Bank bank = new Bank("ICICI");
        System.out.println(bank.getBankName());
        bank.addBranch("Noida");
        bank.addCustomer("Noida", "Maitreyi", 450.23);
        bank.addCustomer("Noida", "Shashwat", 45.21);
        bank.addTransaction("Noida", "Shashwat", 112.45);
        bank.addBranch("GrNoida");
        bank.addCustomer("GrNoida", "Namita", 10000);
        bank.addTransaction("GrNoida", "Namita", 452.05);
        bank.addCustomer("GrNoida", "Sonu", 250.50);
        bank.printBranch("GrNoida", false);
        bank.printBranch("Noida", true);
    }
}