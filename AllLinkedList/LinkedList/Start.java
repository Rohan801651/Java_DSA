package AllLinkedList.LinkedList;

public class Start {
    public static void main(String[] args) {
        MyLinkedList.Node a = new MyLinkedList.Node(2);
        MyLinkedList.Node b = new MyLinkedList.Node(4);
        MyLinkedList.Node c = new MyLinkedList.Node(21);
        MyLinkedList.Node d = new MyLinkedList.Node(3);

        a.next = b;
        b.next = c;
        c.next = d;

        MyLinkedList.display(a);

        System.out.println("\nlength = " + MyLinkedList.lengthOfLinkedList(a));



    }
}
