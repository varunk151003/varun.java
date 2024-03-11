package Git.TreeDSA;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BalancedTree {

    Node root;

    BalancedTree(Node root) {
        this.root = root;
    }

    int calc_Height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calc_Height(root.left);
        int rightHeight = calc_Height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    boolean isBalancedTree(Node root) {
        if (root == null) {
            return true;
        }

        int leftHeight = calc_Height(root.left);
        int rightHeight = calc_Height(root.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalancedTree(root.left) && isBalancedTree(root.right)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(30);
        root.right.left.left = new Node(76);

        BalancedTree bt = new BalancedTree(root);
        if (bt.isBalancedTree(root)) {
            System.out.println("It is a Balanced Tree");
        } else {
            System.out.println("It is not a Balanced Tree");
        }

    }

}
