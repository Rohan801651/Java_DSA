package AllQueues.ByArray;

/**
 *      Queues By Using Arrays
**/

public class QueuesOne {

    private int rear = -1;
    private int front = -1;
    private int[] queues;
    private int size = 0;

    public QueuesOne(int sizeMax){
        this.queues = new int[sizeMax];
    }


    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queues[i]+" ");
        }
        System.out.println();
    }


    public void enqueue(int data) {  // q is currently empty
        if (front == -1) {
            front = 0;
            rear = 0;
            queues[0] = data;

        } else {
            queues[++rear] = data;
        }
        if (rear == queues.length ) {
            System.out.println("Queue is full ");
            return;
        }
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty ");
        }
        front++;
        size--;
        return queues[front-1];
    }

    public int peek() {
        return queues[front];
    }












}
