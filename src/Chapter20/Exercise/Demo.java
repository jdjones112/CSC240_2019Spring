package Chapter20.Exercise;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(99); // Node a
        Node<Integer> b = new Node<>(100); // Node b
        Node<Integer> c = new Node<>(103); // Node c
        Node<Integer> d = new Node<>(104); // Node d

        LinkedList list = new LinkedList();
        list.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        Node head = list.head;
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
//
//        System.out.println(list.head.data);
//        System.out.println(list.head.next.data);
//        System.out.println(list.head.next.next.data);
//        System.out.println(list.head.next.next.next.data);
//        System.out.println(a.next.data);
    }
}
