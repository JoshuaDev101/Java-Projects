
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        t.root = new Node(10);

        t.root.left = new Node(5);
        t.root.left.left = new Node(2);
        t.root.left.right = new Node(7);

        t.root.right = new Node(15);
        t.root.right.left = new Node(12);

        t.inorder(t.root, in);
        t.preorder(t.root, pre);
        t.postorder(t.root, post);
        ArrayList<Integer> levelRes = t.levelOrder(t.root);

        System.out.println("Inorder: " + in);
        System.out.println("Preorder: " + pre);
        System.out.println("PostOrder: " + post);
        System.out.println("Level Order: " + levelRes);
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }

}

class BinaryTree {
    Node root;

    public void inorder(Node n, ArrayList<Integer> out) {
        if (n == null)
            return;
        inorder(n.left, out);
        out.add(n.data);
        inorder(n.right, out);
    }

    public void preorder(Node n, ArrayList<Integer> out) {
        if (n == null)
            return;
        out.add(n.data);
        preorder(n.left, out);
        preorder(n.right, out);
    }

    public void postorder(Node n, ArrayList<Integer> out) {
        if (n == null)
            return;

        postorder(n.left, out);
        postorder(n.right, out);
        out.add(n.data);
    }

    public ArrayList<Integer> levelOrder(Node n) {
        ArrayList<Integer> out = new ArrayList<>();

        if (n == null)
            return out;

        Queue<Node> q = new ArrayDeque<>();
        q.add(n);

        while (!q.isEmpty()) {
            Node cur = q.remove();
            out.add(cur.data);

            if (cur.left != null) {
                q.add(cur.left);
            }

            if (cur.right != null) {
                q.add(cur.right);
            }

        }
        return out;
    }
}
