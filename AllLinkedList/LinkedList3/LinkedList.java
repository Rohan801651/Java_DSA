package AllLinkedList.LinkedList3;

public class LinkedList {
    private Node head = null;
    private Node tail = null;

    public class Node {
        // String stdName;
        int stdID;
        Node next;

        public Node(int stdID) {
            // this.stdName = stdName;
            this.stdID = stdID;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" ID: " + temp.stdID);
            System.out.println();
            temp = temp.next;
        }
    }

    public void insertNode(int index, int data) {
        Node temp = head;
        Node newNode = new Node(data);

        if (index == getSize()) {
            insertAtEnd(data);
            return;
        } else if (index == 0) {
            insertAtFirst(data);
            return;
        }
        
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void insertAtEnd(int id) {
        /*
         * Node newNode = new Node(name, id);
         * Node temp = head;
         * if (temp == null) {
         * head = newNode;
         * } else {
         * tail.next = newNode;
         * }
         * tail = newNode;
         */
        Node newNode = new Node(id);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        // tail = newNode;

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

    public void insertAtFirst(int id) {
        // Node temp = head;
        Node newNode = new Node(id);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertAtMiddle(int id) {
        int midNode = getSize() / 2;
        Node temp = head;

        Node newNode = new Node(id);
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

    /*
     * public LinkedList reverse() {
     * Node temp = head;
     * LinkedList reversed = new LinkedList();
     * while (temp != null) {
     * reversed.insertAtFirst("saim", 553);
     * reversed.insertAtFirst("Rohan", 123);
     * reversed.insertAtFirst("Ali", 12342);
     * }
     * return reversed;
     * }
     */

    public boolean isEmpty() {
        boolean isEmpty = true; // not empty
        if (head != null) {
            isEmpty = false; // list is empty
        }
        return isEmpty;
    }

    public int getElementById(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.stdID;
    }

















}
