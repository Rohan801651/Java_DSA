package Trees;

public class StartOne {
    public static void main(String[] args) {
        TreeOne tree = new TreeOne();

        TreeOne.Node root = new TreeOne.Node(1);

        TreeOne.Node a = new TreeOne.Node(2);
        TreeOne.Node b = new TreeOne.Node(3);

        root.left = a;
        root.right = b;

//        TreeOne.Node c = new TreeOne.Node(3);
//        TreeOne.Node d = new TreeOne.Node(4);
//
//        a.left = c;
//        a.right = d;

        TreeOne.Node e = new TreeOne.Node(4);
        TreeOne.Node f = new TreeOne.Node(5);

        b.right = e;
        e.left = f;

        System.out.println(tree.sumOfNodes(root));

//        tree.displayEachChild(root);

        System.out.println(tree.findMax(root));
        System.out.println(tree.height(root));
        System.out.println(tree.level(root));

        tree.displayInorder(root);



    }
}
