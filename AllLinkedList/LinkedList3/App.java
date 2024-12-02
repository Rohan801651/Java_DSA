package AllLinkedList.LinkedList3;

public class App {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(3);
        ll.insertAtEnd(12);
        // ll.insertAtFirst(15);
        ll.insertAtMiddle(5);

        ll.display();
        // System.out.println(ll.isEmpty());

        System.out.println(ll.getElementById(1));

    }
}
