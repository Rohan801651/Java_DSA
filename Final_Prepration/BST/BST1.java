package Final_Prepration.BST;

public class BST1 {

//    Node root = null;

    static class Node {
        int data;
        Node left, right;
        public Node (int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }


    public Node insertNode (Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insertNode(root.right, val);
        } else {
            root.left = insertNode(root.left, val);
        }

        return root;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }





}
