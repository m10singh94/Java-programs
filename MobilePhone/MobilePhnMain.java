//package MobilePhone;
import java.util.Scanner;

public class MobilePhnMain
{
    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        printChoices();
        System.out.print("Enter your choice -> ");
        int choice = scanner.nextInt(); 
        scanner.nextLine();
        while(choice >= 0 && choice <= 5)
        {
            switch(choice)
            {
                case 0 : printChoices();
                        break;
                case 1 : System.out.print("Enter name : ");
                        String name = scanner.nextLine();
                        System.out.print("Enter contact number : ");
                        int contactNumber = scanner.nextInt();
                        scanner.nextLine();
                        Contact contact = Contact.createContact(name, contactNumber);
                        mobilePhone.addContact(contact);
                        break;
                case 2 : System.out.print("Enter name : ");
                        String oldName = scanner.nextLine();
                        // System.out.print("Enter contact number : ");
                        // contactNumber = scanner.nextInt();
                        //scanner.nextLine();
                        //Contact oldContact = Contact.createContact(name, contactNumber);
                        if(MobilePhone.findContact(oldName))
                        {
                            System.out.println("Enter details of new contact ->");
                            System.out.print("Enter name : ");
                            name = scanner.nextLine();
                            System.out.print("Enter contact number : ");
                            contactNumber = scanner.nextInt();
                            scanner.nextLine();
                            Contact newContact = Contact.createContact(name, contactNumber);
                            MobilePhone.modifyContact(oldName, newContact);
                            //System.out.println(MobilePhone.getPosition(oldContact));
                        }
                        break;
                case 3 : System.out.print("Enter name : ");
                        name = scanner.nextLine();
                        System.out.print("Enter contact number : ");
                        contactNumber = scanner.nextInt();
                        scanner.nextLine();
                        mobilePhone.removeContact(Contact.createContact(name, contactNumber));
                        break;
                case 4 : System.out.print("Enter the name whose details need to be found = ");
                        name = scanner.nextLine();
                        MobilePhone.findContact(name);
                        break;
                case 5 : mobilePhone.printContact();
                        break;
            }
            System.out.println("Enter your choice -> ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
    public static void printChoices()
    {
        System.out.println("0 - Print choices");
        System.out.println("1 - Add a new Contact");
        System.out.println("2 - Modify a contact");
        System.out.println("3 - Remove Contact");
        System.out.println("4 - Find contact (by name)");
        System.out.println("5 - Print Contact List");
        System.out.println("Press any other key to exit...");
    }
}