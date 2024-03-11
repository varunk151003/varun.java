package Git.TreeDSA;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Tree {
    TreeNode root;

    public Tree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }

        return root;
    }

    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(TreeNode root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.val + " ");
            inOrderRecursive(root.right);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7};
        for (int val : inputs) {
            tree.insert(val);
        }

        tree.inOrder();
    }
}
