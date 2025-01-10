package Final_Prepration.TreesTwo;

import AllQueues.Bylinkedlist.QueueLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTwo {

    Node root = null;

    class Node {
        int data;
        Node left;
        Node right;

        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   // class BinaryTree {
   int index = -1;
   public Node buildTree(int[] nodes) {
       index += 1;
       if (nodes[index] == -1) {
           return null;
       }
       Node newNode = new Node(nodes[index]);
       newNode.left = buildTree(nodes);
       newNode.right = buildTree(nodes);

       return newNode;
   }

   public void preOrder (Node root) {
       if (root == null) {
           return;
       }
       System.out.print(root.data);
       preOrder(root.left);
       preOrder(root.right);
   }

   public void inOrder (Node root) {
       if (root == null) {
           return;
       }
       inOrder(root.left);
       System.out.print(root.data);
       inOrder(root.right);
   }

   public void postOrder (Node root) {
       if (root == null) {
           return;
       }
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data);
   }


   public void levelOrderBFST (Node root) {
       Queue<Node> q = new LinkedList<>();

       if (root != null) {
           q.add(root);
       }
       while (q.size() > 0) {
           Node temp = q.peek();
           if (temp.left != null) {
               q.add(temp.left);
           }
           if (temp.right != null) {
               q.add(temp.right);
           }
           System.out.print(temp.data+" ");
           q.remove();
       }
   }

   public int countNodes (Node root) {
       if (root == null) {
           return 0;
       }
       return countNodes(root.left) + countNodes(root.right) + 1;
   }
















}
