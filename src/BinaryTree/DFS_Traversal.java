package BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class DFS_Traversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree {
        TreeNode root;

        BinaryTree() {
            root = null;
        }

        // Pre-order traversal recursive function
        void preOrderTraversal(TreeNode node) {
            if (node == null) {
                return;
            }
            else {
                System.out.print(node.val + " "); // Process the current node
                preOrderTraversal(node.left);     // Recur on the left subtree
                preOrderTraversal(node.right);    // Recur on the right subtree
            }
            }


        void postOrderTraversal(TreeNode node){
            if(node == null){
                return;
            }
            else{
                postOrderTraversal(node.left);
                postOrderTraversal(node.right);
                System.out.print(node.val + " ");
            }

        }


//        void inOrderTraversal(TreeNode node){
//            if (node == null){
//                return;
//            }
//            else {
//                inOrderTraversal(node.left);
//                System.out.print(node.val + " ");
//                inOrderTraversal(node.right);
//            }
//        }

        List<Integer> ans = new LinkedList<>();
        public List<Integer> inOrderTraversal(TreeNode root) {


            if(root == null){
                return new LinkedList<>();
            }

            else{
                inOrderTraversal(root.left);
                ans.add(root.val);
                inOrderTraversal(root.right);
                return ans;
            }

        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);

            System.out.println("Pre-order traversal of the binary tree:");
            tree.preOrderTraversal(tree.root);
            System.out.println();
            System.out.println();

            System.out.println("Post-order traversal of the binary tree:");
            tree.postOrderTraversal(tree.root);
            System.out.println();
            System.out.println();

            System.out.println("In-order traversal of the binary tree:");
            tree.inOrderTraversal(tree.root);

        }
    }
}
