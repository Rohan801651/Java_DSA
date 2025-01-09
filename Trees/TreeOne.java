package Trees;

public class TreeOne {

    Node root = null;

    public static class Node{
        int data;
        Node left ,right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }



    public int getSize(Node root) {
        if (root == null) {
            return 0;  //  for leaf node
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }




    public void displayEachChild(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" → ");
        if (root.left != null) {
            System.out.print(root.left.data+" ,");
        }
        if (root.right != null) {
            System.out.print(root.right.data);
        }

        System.out.println();
        displayEachChild(root.left);
        displayEachChild(root.right);
    }

    public int sumOfNodes(Node root) {
        if (root == null) return 0;
        return root.data + sumOfNodes(root.right) + sumOfNodes(root.left);
    }

    public int findMax(Node root) {
        if (root == null) return 0;  // if -ve values use minimum value of integer...
        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));

    }

    public int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int level(Node root) {
        if (root == null ) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }


    public void displayPreOrder(Node root) {  // pre-order
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }

    public void displayInorder(Node root) {
        if (root == null) return;
        displayInorder(root.left);
        System.out.print(root.data+" ");
        displayInorder(root.right);
    }

    public void displayPostOrder(Node root) {
        if (root == null) return;
        displayPostOrder(root.left);
        displayPostOrder(root.right);
        System.out.print(root.data+ " ");
    }



































}
