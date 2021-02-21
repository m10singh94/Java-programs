import java.util.Scanner;

// Hamburger Challenge
class Hamburger
{
    private String breadRollType;
    private String meat;
    private double price;
    
    public Hamburger(String breadRollType, String meat, double price)
    {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addLettuce()
    {
        System.out.println("Lettuce added. Fare added = 50");
        this.price += 50; 
    }
    public void addTomato()
    {
        System.out.println("Tomato added. Fare added = 55");
        this.price += 55; 
    }
    public void addCarrot()
    {
        System.out.println("Carrot added. Fare added = 60");
        this.price += 60; 
    }
    public void addChilli()
    {
        System.out.println("Chilli added. Fare added = 25");
        this.price += 25; 
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getBreadRollType()
    {
        return breadRollType;
    }
    public String getMeat()
    {
        return meat;
    }
}
class HealthyBurger extends Hamburger
{
    private double additionsPrice;
    public HealthyBurger(String meat, double price)
    {
        super("Brown rye bread roll", meat, price);
    }
    public void addJalapeno()
    {
        this.additionsPrice = 80;
        System.out.println("Jalapeno added. Fare added = 80");
        this.additionsPrice += getPrice();
    }
    public void addRedPepper()
    {
        this.additionsPrice = 70;
        System.out.println("Red Pepper added. Fare added = 70");
        this.additionsPrice += getPrice();
    }
    public double getAdditionsPrice()
    {
        return additionsPrice;
    }
}
class DeluxeBurger extends Hamburger
{
    public DeluxeBurger(String breadRollType, String meat, double price)
    {
        super(breadRollType, meat, price);
    }
    @Override
    public void addLettuce()
    {
        System.out.println("Cannot be added. This burger comes as a package.");
    }
    @Override
    public void addTomato()
    {
        System.out.println("Cannot be added. This burger comes as a package.");
    }
    @Override
    public void addCarrot()
    {
        System.out.println("Cannot be added. This burger comes as a package.");
    }
    @Override
    public void addChilli()
    {
        System.out.println("Cannot be added. This burger comes as a package.");
    }
    public double totalPrice()
    {
        System.out.println("Chips and Coke added as a part of the package.");
        return getPrice();
    }
}

public class HamburgerMain
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the choice of Burger ->");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        chooseBurger(choice);
        scanner.close(); 
    }
    public static void chooseBurger(int i)
    {
        Scanner scanner = new Scanner(System.in);
        if(i < 1 || i > 3)
            System.out.println("Invalid input");
        else
        {
            int option;
            switch(i)
            {
                case 1 :    
                    System.out.println("Enter the type of Bread Roll ->");
                    String breadRollType = scanner.nextLine();
                    System.out.println("Enter the type of meat ->");
                    String meat = scanner.nextLine();
                    Hamburger hamburger = new Hamburger(breadRollType, meat, 50);
                    System.out.println("Do you want any additions: \n1) Lettuce\n2) Tomato\n3) Carrot\n4) Chilli");
                    while(true)
                    {
                        boolean hasInt = scanner.hasNextInt();
                        if(hasInt)
                        {
                            option = scanner.nextInt();
                            if(option >= 1 && option <= 4)
                            {
                                switch(option)
                                {
                                    case 1 : hamburger.addLettuce();
                                            break;
                                    case 2 : hamburger.addTomato();
                                            break;
                                    case 3 : hamburger.addCarrot();
                                            break;
                                    case 4 : hamburger.addChilli();
                                        break;
                                }
                            }
                            else
                                System.out.println("Invalid Input.");
                        }
                        else
                            break;
                    }
                    System.out.println("Total Price = " + hamburger.getPrice());
                    break;
                case 2 : 
                    System.out.println("Enter the type of meat ->");
                    meat = scanner.nextLine();
                    HealthyBurger healthyBurger = new HealthyBurger(meat, 80);
                    System.out.println("Do you want any additions: \n1) Lettuce\n2) Tomato\n3) Carrot\n4) Chilli\n5) Jalapeno\n6) Red Pepper");
                    while(true)
                    {
                        boolean hasInt = scanner.hasNextInt();
                        if(hasInt)
                        {
                            option = scanner.nextInt();
                            if(option >= 1 && option <= 6)
                            {
                                switch(option)
                                {
                                    case 1 : healthyBurger.addLettuce();
                                            break;
                                    case 2 : healthyBurger.addTomato();
                                            break;
                                    case 3 : healthyBurger.addCarrot();
                                            break;
                                    case 4 : healthyBurger.addChilli();
                                            break;
                                    case 5 : healthyBurger.addJalapeno();
                                            break;
                                    case 6 : healthyBurger.addRedPepper();
                                            break;
                                }
                            }
                            else    
                                System.out.println("Invalid Input.");
                        }
                        else
                            break;
                    }
                    System.out.println("Total Price = " + healthyBurger.getPrice());
                    break;
                case 3 :  
                    System.out.println("Enter the type of Bread Roll ->");
                    breadRollType = scanner.nextLine();
                    System.out.println("Enter the type of meat ->");
                    meat = scanner.nextLine();
                    DeluxeBurger deluxeBurger = new DeluxeBurger(breadRollType, meat, 110); 
                    System.out.println("Total Price = " + deluxeBurger.totalPrice());                     
            }
        }
        scanner.close();
    }
}