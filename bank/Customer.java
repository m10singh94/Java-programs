//package bank;
import java.util.ArrayList;

public class Customer
{
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialTransaction)
    {
        this.name = name;
        addTransaction(initialTransaction);
    }
    public String getName()
    {
        return name;
    }
    public ArrayList<Double> getTrandsactions()
    {
        return transactions;
    }
    // public void printTransaction()
    // {
    //     for(int i = 0; i < transactions.size(); i++)
    //         System.out.println(i+1 + " -> " + transactions.get(i));
    // }
    public void addTransaction(double transaction)
    {
        this.transactions.add(transaction);
    }
}