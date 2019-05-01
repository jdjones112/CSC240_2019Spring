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
}
