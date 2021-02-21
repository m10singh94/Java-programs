//package bank;
import java.util.ArrayList;

public class Bank
{
    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<Branch>();
    public Bank(String bankName)
    {
        this.bankName = bankName;
    }
    public String getBankName()
    {
        return this.bankName;
    }
    public boolean addBranch(String nameOfBranch)
    {
        if(findBranch(nameOfBranch) == null)
        {
            this.branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialTransaction)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            return branch.addCustomer(customerName, initialTransaction);
        }
        return false;
    }
    public boolean addTransaction(String branchName, String customerName, double transaction)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            return branch.addNewTransaction(customerName, transaction);
        }
        return false;
    }
    private Branch findBranch(String branchName)
    {
        for(int i =0; i < branches.size(); i++)
        {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getBranchName().equals(branchName))
                return checkedBranch;
        }
        return null;
    }
    public boolean printBranch(String branchName, boolean showTransactions)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            System.out.println("Branch name : " + branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++)
            {
                Customer customer = branchCustomers.get(i);
                System.out.println((i+1) + ". " + customer.getName());
                if(showTransactions)
                {
                    System.out.println("Transactions => ");
                    ArrayList<Double> customerTransactions = customer.getTrandsactions();
                    for(int j = 0; j < customerTransactions.size(); j++)
                    {
                        System.out.println("[" + (j+1) + "] " + customerTransactions.get(j));
                    }
                }
                System.out.println("");
            }
            return true;
        }
        return false;
    }
}