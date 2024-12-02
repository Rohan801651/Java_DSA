package AllLinkedList.LLOne;

import java.util.NoSuchElementException;

public class MyLinkedList {

    private Node head = null;

    private class Node{
        private int data;
        private Node next = null;
        public Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

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

    public void addFirstNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLastNode(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                 temp = temp.next;
            }
            temp.next = newNode;
        }


    }
    
    public void removeFirstNode() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        } else {
            head = head.next;
        }
    }

    public void removeLastNode() {
        if (head == null) {
            throw new RuntimeException("List Is Empty");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void addNode(int index, int data) {
        Node temp = head;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        }
    }

    public void deleteNode(int index) {
        Node temp = head;

        if (index == 0) {
            removeFirstNode();
        } else if (index == getSize()) {
            removeLastNode();
        } else {
            for (int i = 0; i < index -1 ; i++) {
                temp = temp.next;
            }
            temp.next =  temp.next.next;
        }
    }








}
