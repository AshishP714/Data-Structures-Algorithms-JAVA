public class MaximumDepthBinaryTree {

    static int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left),
                maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);

        System.out.println(maxDepth(root));
    }
}