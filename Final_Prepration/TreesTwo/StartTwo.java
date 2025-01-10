package Final_Prepration.TreesTwo;

public class StartTwo {
    public static void main(String[] args) {

        int[] nodes = {6,7,4,-1,-1,3,-1,-1,9,1,-1,-1,-1};

        TreeTwo t = new TreeTwo();
        TreeTwo.Node root = t.buildTree(nodes);



        t.levelOrderBFST(root);

        System.out.println();
        System.out.println(t.countNodes(root));

    }
}
