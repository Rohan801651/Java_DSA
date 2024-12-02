package AllStacks.STOne;

public class Stackss {

    Node top = null;
    private int size;

    public  class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public Stackss(int size) {
        this.size = size;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

/*    public void pop() {
        if (top == null) {
            throw new RuntimeException("stack is empty");
        } else {
            top = top.next;
        }
    }*/

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        return top.data;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += peek();
            pop();
        }
        return sum;
    }

    public void even() {
        for (int i = 0; i < size; i++) {
            if (peek() % 2 == 0) {
                System.out.println("Even " + peek());

            }
            pop();
        }

    }

















}
