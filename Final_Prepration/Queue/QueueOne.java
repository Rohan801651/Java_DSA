package Final_Prepration.Queue;

public class QueueOne {

    Node front = null;
    Node rear = null;
    int size = 0;

    class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        this.size++;
    }


    public int dequeue() {
        int result = 0;

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            result = front.data;
            front = front.next;
        }

        return result;
    }


    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
    public void displayReversed() {
        Node temp = front;
        int[] arr = new int[this.size];

        while (temp != null) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = temp.data;
                temp = temp.next;
            }
        }

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]+" ");
        }

    }










}
