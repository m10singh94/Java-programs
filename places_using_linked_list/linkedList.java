import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class linkedList
{
    public static void main(String[] arg)
    {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Darwin");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Alice Springs");
        printPlaces(placesToVisit);
        visit(placesToVisit);
    }
    private static void printPlaces(LinkedList<String> linkedList)
    {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String city)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext())
        {
            int comparison  = stringListIterator.next().compareTo(city);
            if(comparison == 0)
            {
                System.out.println("City already included.");
                return false;
            }
            else if(comparison > 0)
            {
                stringListIterator.previous();
                stringListIterator.add(city);
                return true;
            }
        }
        stringListIterator.add(city);
        return true;
    }
    private static void visit(LinkedList<String> cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty())
        {
            scanner.close();
            return;
        }
        else
        {
            System.out.println(listIterator.next());
            printMenu();
        }
        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0 : System.out.println("No Holiday.");
                        quit = true;
                        break;
                case 1 : if(!goingForward)
                        {
                            if(listIterator.hasNext())
                            {
                                listIterator.next();
                            }
                            goingForward = true;
                        }
                        if(listIterator.hasNext())
                        {
                            System.out.println(listIterator.next());
                        }
                        else
                        {
                            System.out.println("Reached end.");
                            goingForward = false;
                        }    
                        break;
                case 2 : if(goingForward)
                        {
                            if(listIterator.hasPrevious())
                            {
                                listIterator.previous();
                            }
                            goingForward = false;
                        }
                        if(listIterator.hasPrevious())
                        {
                            System.out.println(listIterator.previous());
                        }    
                        else
                        {
                            System.out.println("Start of the list.");
                            goingForward = true;
                        }
                        break;
                case 3 : printMenu();
            }
        }
        scanner.close();
    }
    public static void printMenu()
    {
        System.out.println("0 - to quit.");
        System.out.println("1 - to go to next city.");
        System.out.println("2 - to got o previous city.");
        System.out.println("3 - to print options.");
    }
}