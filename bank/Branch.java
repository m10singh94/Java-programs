//package bank;
import java.util.ArrayList;

public class Branch
{
    private String nameOfBranch;
    private ArrayList<Customer>  customerList = new ArrayList<Customer>();
    public Branch(String nameOfBranch)
    {
        this.nameOfBranch = nameOfBranch;
    }
    public String getBranchName()
    {
        return this.nameOfBranch;
    }
    public ArrayList<Customer> getCustomers()
    {
        return customerList;
    }
    private Customer getPositionOfCustomer(String name)
    {
        for(int i = 0; i < customerList.size(); i++)
        {
            Customer checkedCustomer = this.customerList.get(i);
            if(checkedCustomer.getName().equals(name))  
                return checkedCustomer;
        }
        return null;   
    }
    public boolean addCustomer(String name, double initialTransaction)
    {
        if(getPositionOfCustomer(name) == null)
        {
            this.customerList.add(new Customer(name, initialTransaction));
            return true;
        }
        return false;
    }
    public boolean addNewTransaction(String name, double transaction)
    {
        Customer existingCustomer = getPositionOfCustomer(name);
        if(existingCustomer != null)
        {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }
}