package AllStacks.StacksByLinkedList;

public class NodesStack {

    private Node top = null;
    private int size;

    public class Node {
        private int data;
        private Node next = null;

        public Node(int data) {
            this.data = data;
            // this.next = null;
        }
    }

    public NodesStack(int size) {
        this.size = size;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void peek() {
        System.out.println(top.data);
    }


    public void pop() {
        if (top != null) {
            top = top.next;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

}
