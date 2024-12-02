package AllLinkedList.LLOne;



public class Start {
    public static void main(String[] args) {


        MyLinkedList l = new MyLinkedList();
        l.addLastNode(3);
        l.addLastNode(2);
        l.addLastNode(6);
        l.addFirstNode(5);
        l.addLastNode(75);
        l.addLastNode(7);
        l.addNode(3,17);
        l.display();
        System.out.println();

        l.deleteNode(5);


        l.display();


    }
}
