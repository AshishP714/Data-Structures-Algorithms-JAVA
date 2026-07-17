public class InvertBinaryTree {

    static TreeNode invert(TreeNode root) {

        if (root == null)
            return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }

    static void preorder(TreeNode root) {

        if (root == null)
            return;

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invert(root);

        preorder(root);
    }
}