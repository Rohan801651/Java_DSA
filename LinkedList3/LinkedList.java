package LinkedList3;

public class LinkedList {
    private Node head = null;
    private Node tail = null;

    public class Node {
        String stdName;
        int stdID;
        Node next;

        public Node(String stdName, int stdID) {
            this.stdName = stdName;
            this.stdID = stdID;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("Name: " + temp.stdName + " ID: " + temp.stdID);
            System.out.println();
            temp = temp.next;
        }
    }

    public void insertAtEnd(String name, int id) {
        Node newNode = new Node(name, id);
        Node temp = head;
        if (temp == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

    }

    public int getSize() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertAtFirst(String name, int id) {
        // Node temp = head;
        Node newNode = new Node(name, id);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertAtMiddle(String name, int id) {
        int midNode = getSize() / 2;
        Node temp = head;

        Node newNode = new Node(name, id);
        if (head == null) {
            head = newNode;
        } else {
            for (int i = 0; i < midNode - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteMiddle() {
        int middleNode = getSize() / 2;
        Node temp = head;

        for (int i = 0; i < middleNode - 1; i++) {
            temp = temp.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
    }


/*     public LinkedList reverse() {
        Node temp = head;
        LinkedList reversed = new LinkedList();
        while (temp != null) {
            reversed.insertAtFirst("saim", 553);
            reversed.insertAtFirst("Rohan", 123);
            reversed.insertAtFirst("Ali", 12342);
        }
        return reversed;
    } */







}
