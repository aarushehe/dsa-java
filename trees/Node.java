package trees;

public class Node {

    Node root; 

    class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }

        if(key < root.data){
            root.left = insert(root.left, key);
        }
        else{
            root.right = insert(root.right, key);
        }

        return root;
    }

    boolean search(Node root, int key){
        if(root = null){
            return false;
        }

        if(root == key){
            return true,
        }
        else if(key < root.left){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    void inOrder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println("Binary Tree created!");
    }   
}
