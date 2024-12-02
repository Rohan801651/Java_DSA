package AllQueues.Bylinkedlist;

public class Start {
    public static void main(String[] args) {
        QueueLinkedList qla = new QueueLinkedList();
        qla.enqueue(5);
        qla.enqueue(7);
        qla.enqueue(3);

        qla.display();

    }
}
