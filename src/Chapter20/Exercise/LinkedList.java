package Chapter20.Exercise;

public class LinkedList {
    Node head; // head of list

    public String toString()
    {
        String result = "";
        // traversal of a linkedlist
        Node ref = head;
        while(ref != null)
        {
            //System.out.print(ref.data + "-->");
            result += ref.data + "-->";
            ref = ref.next;
        }
        return "head --> " + result + " null\n";
    }
    public boolean isEmpty()
    {
        return head == null;
    }

    // return the size of the linkedlist
    public int size()
    {
        int count = 0;
        Node ref = head;
        while(ref != null)
        {
            count ++;
            ref = ref.next;
        }
        return count;
    }

    public void append(Node e)
    {
        if (isEmpty())
        {
            head = e;
        }
        else {
            Node last = head;
            Node ref = head;
            while(ref != null)
            {
                last = ref;
                ref = ref.next;
            }
            last.next = e;
        }
    }

    public void addIndex(Node e, int index)
    {
        if(index < 0 && index > size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0)
        {
            head = e;
        }
        Node pred = head;
        for(int k = 1; k < index; k++)
            pred = pred.next;
        if(pred.next != null)
            e.next = pred.next;
        pred.next = e;
    }
}
