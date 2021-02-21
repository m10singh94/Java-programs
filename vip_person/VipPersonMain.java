public class VipPersonMain
{
    public static void main(String[] args) 
    {
        VipPerson person1 = new VipPerson();
        System.err.println("PERSON 1 ->");
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());
        System.out.println("************************************");
        System.out.println("PERSON 2 ->");
        VipPerson person2 = new VipPerson("Maitreyi", 100000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());
        System.out.println("************************************");
        System.out.println("PERSON 3 ->");
        VipPerson person3 = new VipPerson("Shashwat", 100000.00, "hello@abc.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());
    }
}