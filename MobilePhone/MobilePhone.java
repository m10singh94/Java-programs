//package MobilePhone;
import java.util.ArrayList;

public class MobilePhone
{
    private static ArrayList<Contact> contactList = new ArrayList<Contact>();
    public void addContact(Contact contact)
    {
        contactList.add(contact);
        System.out.println("Contact added successfully.");
    }     
    public void printContact()
    {
        for(int i = 0; i < contactList.size(); i++)
        {
            System.out.println(i+1 + ". " + contactList.get(i).getName() + " -> " + contactList.get(i).getContactNumber());
        }
    }
    public static void modifyContact(String oldName, Contact newContact)
    {
        for(int i = 0; i < contactList.size(); i++)
        {
            if(contactList.get(i).getName().equals(oldName))
            {
                contactList.set(i, newContact);
                System.out.println("Contact modified successfully.");
                break;    
            }
            else
            System.out.println("Contact not found.");
        }
        
    }
    public void removeContact(Contact contact)
    {
        int i;
        for(i = 0; i < contactList.size(); i++)
        {
            if(contactList.get(i).getName().equals(contact.getName()))
            {
                contactList.remove(i);
                System.out.println("Contact removed successfully.");
                break;
            }
        }
        if(i == contactList.size())
            System.out.println("Contact not found");
    }
    public static boolean findContact(String name)
    {
        for(int i = 0; i < contactList.size(); i++)
        {
            if(contactList.get(i).getName().equals(name))
            {
                System.out.println("Contact found.\nName = " + contactList.get(i).getName() +"\nNumber = " + contactList.get(i).getContactNumber());
                return true;
            }
        }
        return false;
    }
}