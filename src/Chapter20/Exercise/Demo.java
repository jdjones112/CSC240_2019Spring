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

        // Insert Node (102) between b and c
        // create a new node e --> e(102)
        Node<Integer> e = new Node<>(102);
        b.next = e;
        e.next = c;


        list.head = list.head.next; // remove node a



        // delete node e
        b.next = c;

        System.out.println(list);


//
//        System.out.println(list.head.data);
//        System.out.println(list.head.next.data);
//        System.out.println(list.head.next.next.data);
//        System.out.println(list.head.next.next.next.data);
//        System.out.println(a.next.data);
    }
}
