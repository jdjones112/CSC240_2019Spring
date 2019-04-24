package Chapter20;

public class LinkedListDemo
{
    public static void main(String[] args)
    {

        LinkedList llist = new LinkedList();
        Node Head = new Node(99);
        llist.head = Head;
        Node second = new Node(100);
        Node third = new Node(103);
        Node fourth = new Node(104);

        Head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println(llist);

        Node nodeNew = new Node(102);
        second.next = nodeNew;
        nodeNew.next = third;
        System.out.println(llist);

        //llist.head = llist.head.next;
        second.next = nodeNew.next;

        System.out.println(llist);
        llist.addToEnd(new Node(9999));
        System.out.println(llist);
        llist.addToIndex(2, new Node(8888));
        System.out.println(llist);

    }
}