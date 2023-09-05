//        1. Tree Traversals (Inorder, Preorder and Postorder)
//        2. Level order transversal
//        3. Count nodes in binary tree
//        4. Find n-th node of inorder traversal
//        5. Find an element from Binary tree
//        6. Find the Maximum Depth /
//        7. Height of given Binary Tree
//        [6:40 pm, 31/08/2023] Ankur Lathiya Add Zero: 6th and 7 th is same question (max depth or height)



package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class treeTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node r = new Node(10);
        tree.root = r;
        r.left = new Node(20);
        r.right = new Node(30);
        r.left.left = new Node(40);
        r.left.right = new Node(50);
        r.right.left = new Node(60);
        r.right.right = new Node(70);

        Tree.levelOrder();
        System.out.println();
        Tree.preOrder(r);
        System.out.println();
        Tree.postOrder(r);
        System.out.println();
        Tree.inOrder(r);
        System.out.println();

//        System.out.println(Tree.countNodes(r));
    }
}


class Tree{
    static Node root;

    public static void levelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.val + " ");

            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(Node r) {
        if(r == null){
            return;
        }

        postOrder(r.left);
        postOrder(r.right);
        System.out.print(r.val + " ");
    }

    public static void inOrder(Node r) {
        if(r == null){
            return;
        }

        inOrder(r.left);
        System.out.print(r.val + " ");
        inOrder(r.right);
    }

}
class Node{
    Node left,right;
    int val;


    public Node(int val) {
        this.val = val;
    }
}
