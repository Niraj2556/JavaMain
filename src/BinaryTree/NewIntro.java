package BinaryTree;

public class NewIntro {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static void main(String[] args) {
            Node root  = new Node(1);

            root.left = new Node(2);
            root.right = new Node(3);
            root.right.right = new Node(5);

            System.out.println(root);
        }
    }
}
