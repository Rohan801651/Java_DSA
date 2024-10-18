package LinkedList3;

public class App {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd("Hassan", 1343);
        ll.insertAtEnd("Ali", 12342);
        ll.insertAtFirst("Rohan", 123);
        ll.insertAtMiddle("saim", 553);
        
        ll.deleteMiddle();
        ll.display();



    }
}
