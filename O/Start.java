package LinkedList2.O;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Linked_List ll  =new Linked_List();
        ll.insertAtEnd(65);
        ll.insertAtFirst(9);
        ll.insertAtEnd(51);
        ll.insertAtEnd(8);
        ll.insertAtEnd(87);

        
        ll.display();
        System.out.println();
        System.out.println("length "+ll.lengthOfLinkedList());

        // ll.deleteNode(1);
        // ll.display();

        ll.insertAtMiddle(200);
        ll.display();
        System.out.println();

        // ll.deleteMiddle();
        // ll.display();

        System.out.println("\nMaX "+ ll.max());
        System.out.println("\nMin "+ ll.min());


        System.out.println("at Position "+ll.search(51)); // at pos 4
        


        

    }
}
