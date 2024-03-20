package BinaryTree;


public class introBtree {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Binary_Tree{
        static int index = -1;
        public static Node buildTree(int[] nodes){
            index++;
            if (nodes[index] == -1){
                return null;
            }
            Node AnsNode = new Node(nodes[index]);
            AnsNode.left = buildTree(nodes);
            AnsNode.right = buildTree(nodes);
            return AnsNode;
        }

    }
    public static void PreOrder(Node root){
        if(root == null){
            System.out.print("null ");
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void InOrder(Node root){
        if (root == null){
            System.out.print("null ");
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }



    public static void PostOrder(Node root){
        if (root == null){
            System.out.println("null ");
            return;
        }
        PreOrder(root.left);
        PreOrder(root.right);
        System.out.println(root.data + " ");
    }
    public static void main(String[] args) {

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binary_Tree tree = new Binary_Tree();
        Node root  = tree.buildTree(nodes);
        //System.out.println(root.data);


        System.out.println("PreOrder Traversal");
        PreOrder(root);

        System.out.println();
        System.out.println();
        System.out.println("InOrder Traversal");
        InOrder(root);

        System.out.println();
        System.out.println();
        System.out.println("PostOrder");
        PreOrder(root);
        System.out.println();
    }

}
