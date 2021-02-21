public class MyLinkedList implements NodeList{
    private ListItem root = null;
    public MyLinkedList(ListItem root)
    {
        this.root = root;
    }
    @Override
    public ListItem getRoot()
    {
        return this.root;
    }
    @Override
    public boolean addItem(ListItem newItem)
    {
        if(this.root == null)
        {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null)
        {
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0) // newItem > currentItem
            {
                if(currentItem.next() != null)
                    currentItem = currentItem.next();
                else
                {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    // newItem.setPrevious(currentItem);
                    return true;
                }
            }
            else if(comparison > 0) // newItem < currentItem
            {
                if(currentItem.previous() != null)
                {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    //newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                    //currentItem.setPrevious(newItem);
                }
                else
                {
                    newItem.setNext(this.root).setPrevious(newItem);
                    //this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }
            else
            {
                System.out.println(newItem.getValue() + " already exists. Hence, not added.");
                return false;
            }
        }
        return false;
    }
    @Override
    public boolean removeItem(ListItem item)
    {
        ListItem currentItem = this.root;
        if(currentItem == null)
        {
            System.out.println("List is empty.");
            return false;
        }
        while(currentItem != null)
        {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0)
            {
                if((currentItem.previous() != null ) && (currentItem.next() != null))
                {
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                }
                else if((currentItem.previous() == null) && (currentItem.next() != null))
                    {
                        this.root = currentItem.next();
                    } 
                    else if((currentItem.previous() != null ) && (currentItem.next() == null))  
                        {
                            currentItem.previous().setNext(null);
                        } 
                System.out.println(item.getValue() + " successfully deleted.");
                return true;
            }
            currentItem = currentItem.next();
        }
        System.out.println(item.getValue() + " was not found in the list.");
        return false;
    }
    @Override
    public void traverse(ListItem root)
    {
        if(root == null)
        {
            System.out.println("Linked List is empty.");
        }
        else
        {
            ListItem currentItem = this.root;
            while(currentItem != null)
            {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }
        }
            
    }
}