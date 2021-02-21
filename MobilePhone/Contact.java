//package MobilePhone;
public class Contact
{
    private String name;
    private int contactNumber;

    public Contact(String name, int contactNumber)
    {
        this.name = name;
        this.contactNumber = contactNumber;
    }
    public String getName()
    {
        return name;
    }
    public int getContactNumber()
    {
        return contactNumber;
    }
    public static Contact createContact(String name, int contactNumber)
    {
        return new Contact(name, contactNumber);
    }
}