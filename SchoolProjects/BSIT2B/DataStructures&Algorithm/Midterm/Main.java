
import java.util.*;

public class Main {

    public static void main(String[] args) {

        BST t = new BST();

        int[] vals = {50, 30, 70, 20, 40, 60, 80};
        for (int v : vals) {
            t.insert(v);
        }

        t.inorderPrint()

        BinaryTree t = new BinaryTree();
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        t.root = new Node(72);

        t.root.left = new Node(45);
        t.root.left.left = new Node(35);
        t.root.left.right = new Node(63);

        t.root.left.left.left = new Node(28);
        t.root.left.left.right = new Node(39);

        t.root.right = new Node(86);
        t.root.right.left = new Node(81);
        t.root.right.left = new Node(90);

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
        if (n == null) {
            return;
        }
        inorder(n.left, out);
        out.add(n.data);
        inorder(n.right, out);
    }

    public void preorder(Node n, ArrayList<Integer> out) {
        if (n == null) {
            return;
        }
        out.add(n.data);
        preorder(n.left, out);
        preorder(n.right, out);
    }

    public void postorder(Node n, ArrayList<Integer> out) {
        if (n == null) {
            return;
        }

        postorder(n.left, out);
        postorder(n.right, out);
        out.add(n.data);
    }

    public ArrayList<Integer> levelOrder(Node n) {
        ArrayList<Integer> out = new ArrayList<>();

        if (n == null) {
            return out;
        }

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

    class BSTNode {

        int key;
        BSTNode left, right;

        public BSTNode(int key) {
            this.key = key;
        }
    }

    class BST {

        BSTNode root;

        public void insert(int key) {
            root = insertRec(root, key);

        }

        private BSTNode insertRec(BSTNode n, int k) {
            if (n == null) {
                return new BSTNode(k);
            }
            if (k < n.key) {
                n.left = insertRec(n.left, k);

            } else if (k > n.key) {
                n.right = insertRec(n.right, k);
            }
            return n;
        }

        public Boolean search(BSTNode n, int k) {
            if (n == null) {
                return false;
            }
            if (n.key == k) {
                return true;
            }
            if (k < n.key) {
                return search(n.left, k);
            } else {
                return search(n.right, k);
            }

        }

        public void deleteKey(int key) {
            root = deleteRec(root, key);
        }

        private BSTNode deleteRec(BSTNode n, int k) {
            if (n == null) {
                return null;

            }
            if (k < n.key) {
                n.left = deleteRec(n.left, k);
            } else if (k > n.key) {
                n.right = deleteRec(n.right, k);
            } else {
                if (n.left == null) {
                    return n.right;
                } else if (n.right == null) {
                    return n.left;
                }
                n.key = minValue(n.right);
                n.right = deleteRec(n.right, n.key);
            }
            return n;
        }

        private int minValue(BSTNode n) {
            while (n.left != null) {
                n = n.left;
            }
            return n.key;
        }

        private void inorderPrint() {
            inorder(root);
            System.out.println();
        }

        private void inorder(BSTNode n) {
            if (n != null) {
                inorder(n.left);
                System.out.print(n.key + " ");
                inorder(n.right);
            }
        }

    }
}
