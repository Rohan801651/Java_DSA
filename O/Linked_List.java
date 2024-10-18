package LinkedList2.O;

public class Linked_List {
    Node head = null;
    Node tail = null;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

    }

    public void insertAtFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int lengthOfLinkedList() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void deleteNode(int index) {
        if (head == null) {
            System.out.println("List Empty ");
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node cur = head;
        int count = 0;
        Node pre = null;

        while (cur != null && count < index) {
            pre = cur;
            cur = cur.next;
            count++;
        }

        if (cur == null) {
            System.out.println("Index Out Of Bounds ");
        }
        pre.next = cur.next;
    }

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next.next != null) { // secondlast node
            temp = temp.next; // iterate
        }
        temp.next = null; // point second last node .next to null
    }

    public Linked_List reverseList() {
        Node temp = head;
        Linked_List reversed = new Linked_List();
        while (temp != null) {
            reversed.insertAtFirst(temp.data);
            temp = temp.next;
        }
        return reversed;
    }

    public void insertAtMiddle(int data) {

        int middleNode = lengthOfLinkedList() / 2;
        // System.out.println("Midd node "+ middleNode);
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 0; i < middleNode - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteMiddle() {
        Node temp = head;
        int middleNode = lengthOfLinkedList() / 2;
        for (int i = 0; i < middleNode - 1; i++) {
            temp = temp.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

    }

    public int max() {
        int max = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }

        return max;
    }

    public int min() {
        int min = head.data;
        Node temp = head;
        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }

    public int search(int data) {  // search position of data
        int pos = 0;
        Node temp = head;
        while (temp != null) {
            pos++;
            if (temp.data == data) {
                return pos;
            }
            temp = temp.next;
        }
        return -1;
    }



}
