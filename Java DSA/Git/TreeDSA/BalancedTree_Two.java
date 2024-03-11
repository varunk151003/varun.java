package Git.TreeDSA;

import java.util.Scanner;

public class BalancedTree_Two {

    Node root;

    BalancedTree_Two(Node root) {
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

        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the root value: ");
        int rootValue = scanner.nextInt();
        Node root = new Node(rootValue);

        // System.out.print("Enter the left child value of the root: ");
        int leftValue = scanner.nextInt();
        root.left = new Node(leftValue);

        // System.out.print("Enter the right child value of the root: ");
        int rightValue = scanner.nextInt();
        root.right = new Node(rightValue);

        // System.out.print("Enter the left child value of the right child of the root: ");
        int leftRightValue = scanner.nextInt();
        root.right.left = new Node(leftRightValue);

        // System.out.print("Enter the right child value of the right child of the root: ");
        int rightRightValue = scanner.nextInt();
        root.right.right = new Node(rightRightValue);

        // int leftRightLeftValue = scanner.nextInt();
        // root.right.left.left = new Node(leftRightLeftValue);

        BalancedTree_Two bt = new BalancedTree_Two(root);
        if (bt.isBalancedTree(root)) {
            System.out.println("It is a Balanced Tree");
        } else {
            System.out.println("It is not a Balanced Tree");
        }

        scanner.close();
    }

}
