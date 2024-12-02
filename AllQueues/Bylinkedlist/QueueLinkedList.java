package AllQueues.Bylinkedlist;

public class QueueLinkedList {

    private Node front;
    private Node rear;
    private int size;

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }


    public void display() {
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }



}
