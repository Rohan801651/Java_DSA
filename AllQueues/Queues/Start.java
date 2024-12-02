public class Start {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(6);
        q.enqueue(9);


        // System.out.println(q.isEmpty());
        q.displayReversed();

    }
}
