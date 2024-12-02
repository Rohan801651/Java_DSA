package AllLinkedList.SLTwo;

public class Linked_List {

    public Node head = null,tail;
    public class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void delFirst() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void addMid(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int midNode = getSize() / 2;
        for (int i = 0; i < getSize() - 1; i++) {
            temp = temp.next;
        }
        newNode.next = head.next;
        head.next = newNode;

    }

    public void delMid() {
        Node temp = head;
        int midNode = getSize() / 2;
        for (int i = 0; i < getSize() - 1; i++) {
            temp = temp.next;
        }
        head.next = head.next.next;

    }














}
