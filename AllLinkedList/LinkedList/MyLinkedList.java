package AllLinkedList.LinkedList;

public class MyLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head){
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data+" ");
            pointer = pointer.next;
        }
    }

    public static int lengthOfLinkedList(Node a) {
        int count = 0;
        while (a!=null){
            count++;
            a = a.next;
        }
        return count;
    }

    









}
