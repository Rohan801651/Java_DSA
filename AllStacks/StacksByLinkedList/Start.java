package AllStacks.StacksByLinkedList;

public class Start {
    public static void main(String[] args) {
        NodesStack ns = new NodesStack(3);

        ns.push(2);
        ns.push(4);
        ns.push(6);

//        ns.peek();
        ns.display();

        ns.pop();
        ns.pop();
//        ns.pop();
//        ns.pop();

        ns.display();






    }
}
