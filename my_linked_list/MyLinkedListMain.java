public class MyLinkedListMain
{
    public static void main(String[] arg)
    {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        System.out.println("============================");
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for(String s : data)
        {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        System.out.println("============================");
        list.removeItem(new Node("Sydney"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("Darwin"));
        System.out.println("============================");
        list.traverse(list.getRoot());
        list.removeItem(new Node("WashingtonD.C."));
        System.out.println("============================");
        list.traverse(list.getRoot());
    }
}