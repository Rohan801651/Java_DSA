package AllQueues.ByArray;

public class OneStart {
    public static void main(String[] args) {
        QueuesOne q = new QueuesOne(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

        System.out.println(q.dequeue());
        q.display();
        System.out.println("peek "+q.peek());

    }
}
