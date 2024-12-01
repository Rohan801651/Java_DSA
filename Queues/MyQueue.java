public class MyQueue {

    private Node front = null;
    private Node rear = null;
    private int size;

    public class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    public void display() {
        Node temp = front;
        if (isEmpty() == true) {
            System.out.println("nothing to show :) ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty ");
            return;
        } else {
            System.out.println("Dequeued value = "+ front.data);
            front = front.next;
        }
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (front == null) {
            throw new RuntimeException("Empty");
        }
        return front.data;
    }





}